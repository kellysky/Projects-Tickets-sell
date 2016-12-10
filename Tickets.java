package cn.wsh.server;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Tickets  implements Runnable{
	
private Socket client;
private BufferedReader is;
private PrintWriter os;
private YourName_Server yourname;
private BufferedWriter bout;
private BufferedReader bouts;
private FileOutputStream fos;
private FileWriter files;
private FileReader file;
private FileInputStream fis;
private ObjectInputStream in;
private ObjectOutputStream out;
private File fout;
private String filename;
private String name;
private int price=0;

  
 //构造函数
   public Tickets(Socket client){
	 this.client=client;
	  initialize();
  }
 

	//进行初始化
	public void initialize(){
		 try {
			is=new BufferedReader(new InputStreamReader(client.getInputStream()));
			//由Socket对象得到输入流，构造BufferedReader对象
			 os=new PrintWriter(client.getOutputStream());
			 //由Socket对象构造输出流，构造PrintWriter对象
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void run(){
		try {
		
		if(is.readLine().equals("true")){
			os.println(true);
		os.flush();
		}    //服务器-客户机匹配成功
		   information();
			action();
			buy();
			print();
	       end();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// 客户提交个人信息
	public void information(){
		try {
			name = is.readLine();
			fout=new File(name);
			files=new FileWriter(fout);
			bout=new BufferedWriter(files);
			
			bout.write("客户姓名："+name);
			bout.newLine();
		    String cellphone=is.readLine();
			bout.write("客户联系方式："+cellphone);
			bout.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//选择电影
	public void  action() throws IOException{
		if(is.readLine().equals("1")){			
			os.println(true);
			os.flush();
			bout.write("电影名字："+"你的名字(电影单价40)");
			bout.newLine();
			int hall=Integer.parseInt(is.readLine());
			movie_one( hall);
		}
	}
	
	//进行比对时间操作
	public void movie_one(int hall){	
		
		try {
			SimpleDateFormat s1=new SimpleDateFormat(" yyyy-MM-dd ");
			Date date=new Date();
			String date1=s1.format(date);
			String str=is.readLine();
			int days=daysBetween(str,date1);         //假定电影今天首映     
			
			
			String s=String.valueOf(days);           
			filename=".\\"+"yourname"+s+".dat";     //确定读入文件名,确定电影日期
			 fis=new FileInputStream(filename);      //创建输入对象流
			in=new ObjectInputStream(fis);               
			yourname=(YourName_Server)in.readObject();          //读入对象
			
			if(days>0){
				os.print(true);
				os.flush();
				bout.write("时间:  "+str);
				bout.newLine();
				bout.write("购票时间："+date1);
				bout.newLine();
			}else if(days==0){
				if(date.getHours()>=yourname.time[hall]){
					os.print(false);
					os.flush();
				}else {
					os.print(true);
					os.flush();
					bout.write("时间：  "+str);
					bout.newLine();
					bout.write("购票时间："+date1);
					bout.newLine();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
	}
	
	
	//计算时间差，从而调用相应文件
	  public int daysBetween(String smdate,String bdate) throws ParseException{  
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(sdf.parse(smdate));    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(sdf.parse(bdate));    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));     
	    }  
	
  
	//进行购票程序
	public void buy(){
		
		try {
		    int k=Integer.parseInt(is.readLine());    //接收电影场次信息
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					os.println(yourname.seat[k][i][j]);
					os.flush();                         //向客户端发送座位情况
				}
			}
			String str = is.readLine();
			while(str.equals(false)){     //判断条件  直到客户端发出结束请求结束循环
			int seat=Integer.parseInt(str);
			int row=seat/100;
			int line=seat%100;
			yourname.seat[k][row][line]=false;
			yourname.number--;
			price+=40;
			
			os.println(true);
			os.flush();
			
			bout.write("所购座位："+row+"排"+line+"座");
			bout.newLine();
			}
		} catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
	}
	
	
	
	//打印购票信息，生成取票码
		public void print(){			
			 try {
				String str=String.valueOf(price);
				bout.write("总金额："+str);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			 
			    String base = "1234567890";
			    Random random = new Random();   
			    StringBuffer sb = new StringBuffer();   
			    for (int i = 0; i < 9; i++) {   
			        int number = random.nextInt(base.length());   
			        sb.append(base.charAt(number));   
			    } 
			    
			    
			   try {
				bout.write("取票码："+sb.toString());
				bout.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			 os.println(sb.toString()); 
			 os.flush();
		}
		
		//向客户传输购买信息,并返回消费评价
		public void transit(){
			try {
				file=new FileReader(name);
				bouts=new BufferedReader(file);
				String str;		
				while((str=bouts.readLine())!=null){
						os.print(str);
						os.flush();
					}	
				
				bout.write("用户评价："+is.readLine());
				os.print(true);
				os.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
		
		//写入修改了的文件,关闭流，断开连接
		public void end(){
			try {
				fos=new FileOutputStream(filename);
			     out=new ObjectOutputStream(fos);
			     out.writeObject(yourname);
			     file.close();
			     bout.close();
			     out.close();
			     in.close();
			     os.close();
				 is.close();
				 client.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}

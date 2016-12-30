package cn.wsh.server;

import java.io.*;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;

public class Tickets  implements Runnable{
	
private Socket client;
private Socket client2;
private BufferedReader is;                                      //socket输入流
private PrintWriter os;                                        //socket输出流
private AllMovie movie;                                          //运用多态性
private Hash hash;
private Hash list;
private Hashtable<String,AllMovie> table;                     //文件中写入多个对象，实现对对象数据的修改 
private Hashtable<String,ClientsRecords> records ; 
private FileOutputStream fos;                                 //文件输出流，用于写入电影对象
private FileInputStream fis;                                   //文件输入流，用于读取对象
private ObjectInputStream in;                               
private ObjectOutputStream out;
private ObjectOutputStream object;
private String filename;
private Customer customer;
private FileOutputStream  files;                            //用于写入用户信息
private String name;
private ClientsRecords newClients;
private DataOutputStream data;


   //构造函数
   public Tickets(Socket client,Socket client2){
	 this.client=client;
	 this.client2=client2;
	
	  table=new Hashtable<String,AllMovie>();
	  records=new Hashtable<String,ClientsRecords>();
	 hash=new Hash();
	 customer=new Customer();
	  initialize();
   }
 

	//进行初始化
	public void initialize(){
		 try {
			is=new BufferedReader(new InputStreamReader(client.getInputStream()));
			//由Socket对象得到输入流，构造BufferedReader对象
			 os=new PrintWriter(client.getOutputStream());
			 //由Socket对象构造输出流，构造PrintWriter对象
			 data=new DataOutputStream(client2.getOutputStream());                                   //构造文件 图片输出流
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void run(){
		try {
			initialize();
			 movie_information();//传输文件和图片
		    String str=is.readLine();
		    if(str.equals("true")){
		    	  information();//创建账户
		    }else if(str.equals("false") ){
		    	log();//登陆账户
		    }
		   
		    assess();
			os.println(true);
			os.flush();
			action();
			
			buy();
			os.println(true);
			os.flush();
			print();
			os.println(true);
			os.flush();
			transit();
	        end();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//登录
    public void log(){
    	
    	try {
    		fis=new FileInputStream(".//ClientsRecords.dat");
			in=new ObjectInputStream(fis);
			
			list=(Hash)in.readObject();
			records=list.records;
			System.out.print("2");
			while(true){
				String str="1234567890abcdefghijklmnopqlstuvwxyz";
				String check_code=check_code(str,4);                                                   //验证码    
				os.println(check_code);
				os.flush();
				
				
				name=is.readLine();
				String code=is.readLine();
				String checkcode=is.readLine();
				boolean contigo=false;		
				
			for(int i=0;i<records.size();i++){
				try{
				if(records.get(name)!=null){                           //此处有可能发生异常，需处理
					if(records.get(name).code.equals(code)){
						if(checkcode.equals(check_code)){
					customer.name=records.get(name).name;                                     //登录成功
					customer.cellphone=records.get(name).cellphone;
					customer.member=true;
					customer.member_score=records.get(name).member_score;
					newClients=records.get(name);
					contigo=true;
					os.println(true);                                                         //登陆成功
				    os.flush();
						}else{
							os.println(false);
							System.out.println("验证码输入错误");
							os.flush();
							os.println("验证码输入错误");
							os.flush();
						}
				}else{
					os.println(false);
					System.out.println("密码输入错误");
					os.flush();
					os.println("密码输入错误");
					os.flush();
				}
				}else{
					os.println(false);
					System.out.println("用户名不存在");
					os.flush();
					os.println("用户名不存在");
					os.flush();
				}
				}catch(Exception e){
					os.println(false);
					System.out.println("该用户不存在");                                 //
					os.flush();    
					os.println("该用户不存在");
					os.flush();
				}
			}
			if(contigo==true)
				break;	
			
			}
			in.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	
    	
    }
    
    
	// 创建账户，客户提交个人信息
	public void information(){
		
			try {
				newClients=new ClientsRecords();
				name = is.readLine();
				customer.name=name;
				System.out.println(customer.name);
				
			    customer.cellphone=is.readLine();
			    System.out.println(customer.cellphone);
				
			    String code=is.readLine();
			    
			    newClients.name=customer.name;
			    newClients.cellphone=customer.cellphone;
			    newClients.code=code;
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
			
		
	}
	
	
	//传输图片以及电影介绍  、 观众影评
	public void movie_information(){
		
		  try {
			  String[] str=new String[6];
			  str[0]=".\\1283314_144021_7455.jpg";
			  str[1]=".\\17_1471423924110436.jpg";
			  str[2]=".\\11809-3.jpg";
			  str[3]="TheGreatWall.txt";
			  str[4]="TheWastedTime.txt";
			  str[5]="YourName.txt";
			  os.println(str.length);
			  os.flush();
			  for(int i=0;i<6;i++){			  
			  FileInputStream fis=new FileInputStream(new File(str[i]));
			  os.println(new File(str[i]).length());                            //发送图片的长度
			  os.flush();
			 
			  }
			  
			for(int i=0;i<6;i++){
				  byte[] sendbyte=new byte[(int) new File(str[i]).length()];
				 int length=-1;
				
				 FileInputStream fis=new FileInputStream(new File(str[i]));
				
				 DataInputStream s=new DataInputStream(fis);
			  while ((length=s.read(sendbyte))!=-1) {
			     data.write(sendbyte);
			      data.flush();
			      
			  }
			  System.out.println("1");
			  }
		
			  System.out.println("success");
		  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	
	public void assess(){
		try {
		  String yy=is.readLine();
			if(yy.equals("true")){   
				//打开观众留言
			   String str=is.readLine();
				if(str.equals("1")){
					
					
					FileInputStream	stream = new FileInputStream(".//ClientLibrary.dat");
					         
					ObjectInputStream o=new ObjectInputStream(stream);               					
					Hash assess=(Hash)o.readObject();
					if(assess.array.size()==0){
					
							os.println("亲，还没有人评论哦   快来踩一踩吧");
							os.flush();
						
					}else{
					for(int i=0;i<assess.array.size();i++){
						if(assess.array.get(i)!=null){					
						if(assess.array.get(i).tickets_name.equals("你的名字(电影单价40)")){
							System.out.println(assess.array.get(i).message);
							os.println("用户"+assess.array.get(i).cellphone+":");
							os.println(assess.array.get(i).message);
							os.flush();
						}
						
					}
					}
					}
					os.println(true);
					os.flush();
					stream.close();
					o.close();
				
				}else if(str.equals("2")){
						FileInputStream stream=new FileInputStream(".//ClientLibrary.dat");					              
						ObjectInputStream object=new ObjectInputStream(stream);               					
						Hash assess=(Hash)object.readObject();
						System.out.println(assess.list.size());
						if(assess.array.size()==0){
							
							os.println("亲，还没有人评论哦   快来踩一踩吧");
							os.flush();
						
					}else{
						for(int i=0;i<assess.list.size();i++){
							if(assess.array.get(i)!=null){
							if(assess.array.get(i).equals("长城(电影单价60)")){
								os.println("用户"+assess.array.get(i).cellphone+":");
								os.println(assess.array.get(i).message);
								os.flush();
							}
							}else continue;
						}
					}
						os.println(true);
						os.flush();
						stream.close();
						object.close();
							
								
				}else if(str.equals("3")){
								FileInputStream stream=new FileInputStream(".//ClientLibrary.dat");					              
								ObjectInputStream object = new ObjectInputStream(stream);
											
								Hash assess = (Hash)object.readObject();
								System.out.println(assess.list.size());
								if(assess.array.size()==0){
									
									os.println("亲，还没有人评论哦   快来踩一踩吧");
									os.flush();
								
							}else{
								for(int i=0;i<assess.array.size();i++){
									if(assess.array.get(i)!=null){
									if(assess.array.get(i).tickets_name.equals("罗曼蒂克消亡史(电影单价40)")){
										os.println("用户"+assess.array.get(i).cellphone+":");
										os.println(assess.array.get(i).message);
										os.flush();
					}
									}else continue;
				}
							}
								os.println(true);
								os.flush();
								stream.close();
								object.close();
				}
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}              							     
		
	}
	
	
	//选择电影
	public void  action() throws IOException{
		String str=is.readLine();
		if(str.equals("1")){			
			os.println(true);
			os.flush();

			customer.tickets_name="你的名字(电影单价40)";
			System.out.println("你的名字");
			int hall=Integer.parseInt(is.readLine());                                 //电影场次
			customer.hall=hall;
			hall=hall-1;
			os.println(true);
			os.flush();
			while(true){
			movie_one( hall);
			if(is.readLine().equals("true")){
				System.out.println("fdas");
				break;
			}
			}
			
		}
		if(str.equals("2")){			
			os.println(true);
			os.flush();

			customer.tickets_name="长城(电影单价40)";
			System.out.println("长城");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			hall=hall-1;
			os.println(true);
			os.flush();
			while(true){
				movie_one( hall);
				if(is.readLine().equals("true"))
					break;
				}
			
			
		}
		if(str.equals("3")){			
			os.println(true);
			os.flush();

			customer.tickets_name="罗曼蒂克消亡史(电影单价40)";
			System.out.println("罗曼蒂克消亡史");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			hall=hall-1;
			os.println(true);                       //再次发送信号
			os.flush();
			while(true){
				movie_one( hall);
				if(is.readLine().equals("true"))
					break;
				}
			
		}
	}
	
	//进行比对时间操作
	public void movie_one(int hall){	
		
		try {
						
			SimpleDateFormat s1=new SimpleDateFormat(" yyyy-MM-dd ");
			Date date=new Date();
			String date1=s1.format(date);
			String str=is.readLine();                        //得到观影日期
			
			int days=daysBetween(date1,str);                //假定电影今天首映     
			System.out.println("场次:");
			System.out.println(days);
			
			String s=String.valueOf(days);           		                                               
			filename="MovieName.dat";                           //确定读入文件名,确定电影日期
			fis=new FileInputStream(filename);                 //创建输入对象流
			in=new ObjectInputStream(fis); 
		    hash=(Hash)in.readObject();               //
		    movie=hash.allmovie.get(s);                            //通过键值调用特定对象
		    int a=movie.getMoney();
		    
		    System.out.println(a);
			if(days>0){
				customer.time=str;
				customer.date=date1;
				os.println(true);
				os.flush();
		
			}else if(days==0){
				if(date.getHours()>=movie.time[hall]){           
					os.println(false);
					os.flush();
				}else {
					customer.time=str;
					customer.date=date1;
					os.println(true);
					os.flush();

				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
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
		    int k=Integer.parseInt(is.readLine());   
		    k=k-1;
		    System.out.print("场次：");
		    System.out.println(k);                            //接收电影场次信息
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					os.println(movie.getSeat(i, j, k));
					os.flush();                         //向客户端发送座位情况
				}
			}
			int i=0;
			while(true){ 
				//判断条件  直到客户端发出结束请求结束循环
				String str=is.readLine();
				if(str.equals("false"))
					break;
			int seat=Integer.parseInt(str);
			int row=seat/100;
			int line=seat%100;
			movie.setSeat(row, line, k);
			//customer.price+=movie.getMoney();
			String s1=String.valueOf(row);
			String s2=String.valueOf(line);
			customer.seat[i]=row+"排"+line+"座";
			System.out.println("座位：");
			System.out.print(row);
			System.out.print(line);
			movie.setNumber();
			os.println(true);
			os.flush();
			i++;
			customer.number++;
			}
			customer.price=i*movie.getMoney();
		} catch ( IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
	}
	
	
	
	//打印购票信息，生成取票码
	public void print() {
			      String str="1234567890";
				  String code=check_code(str,9);		
				  
			      System.out.print("取票码");
			      System.out.println(code);

			      customer.code=code;  
			      
			      os.println(code); 
			      os.flush();
		}
		
		//生成验证码   取票码
	public String check_code(String str,int length){
			     String base = str;
			    Random random = new Random();   
			    StringBuffer sb = new StringBuffer();   
			    for (int i = 0; i < length; i++) {   
			        int number = random.nextInt(base.length());   
			        sb.append(base.charAt(number));   
			    } 
			  return sb.toString();  
		}
		
		
		//向客户传输购买信息,并返回消费评价
	public void transit(){
			
		try {
			
			//向客户传输信息
			fis=new FileInputStream(".//ClientsRecords.dat");
			in=new ObjectInputStream(fis);
			if(is.readLine()=="true")     //判断会员等级
			customer.member=true;
			if(customer.member==true)    //得到本次积分
			customer.member_score=customer.price;
			
			
			newClients.member_score+=customer.member_score;
			newClients.records++;
			Hash label=new Hash(); 
			label=(Hash)in.readObject();
			label.records.put(name, newClients);
			in.close();
			fis.close();
			files=new FileOutputStream(".//ClientsRecords.dat");
			object=new ObjectOutputStream(files);
			object.writeObject(label);
			
			os.println(customer.name);
			os.flush();
			os.println(customer.cellphone);
			os.flush();
			os.println(customer.tickets_name);
			os.flush();
			os.println(customer.number);
			os.flush();
			os.println(customer.hall);
			os.flush();
			os.println(customer.time);
			os.flush();
			
			SimpleDateFormat s1=new SimpleDateFormat(" yyyy-MM-dd ");
			Date date=new Date();
			String date1=s1.format(date);
			customer.date=date1;
			
			for(int i=0;i<customer.number;i++){
				os.println(customer.seat[i]);
				os.flush();
			}
			
			os.println(customer.price);
			os.flush();
			os.println(customer.date);
			os.flush();
		
			
			String str=is.readLine();                     //得到用户评价
			customer.message=str; 
			System.out.println(customer.message);
			fis=new FileInputStream(".//ClientLibrary.dat");
			in=new ObjectInputStream(fis);
		    Hash array = (Hash)in.readObject();
			//array.list.put(customer.tickets_name,customer);
		    array.array.add(customer);
			in.close();
			fis.close();
			files=new FileOutputStream(".//ClientLibrary.dat");
			object=new ObjectOutputStream(files);
			object.writeObject(array);           //写入对象
			object.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		//写入修改了的文件,关闭流，断开连接
	public void end(){
			try {
				 fos=new FileOutputStream(filename);
			     out=new ObjectOutputStream(fos);                     //
			     out.writeObject(hash);                           //将文件中的多个对象再次写入			    
			     out.close();
			     os.close();
				 is.close();
				 data.close();
				 client.close();
				 client2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}

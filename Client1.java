package yzx;
import java.io.*;
import java.net.*;

public class Client1 {
	static Socket server=null;
	private static PrintWriter os;
	private static BufferedReader is;
	private static BufferedReader sin;
	private static String cc;
	private static DataInputStream data;
	private static FileOutputStream fin;
	private static FileOutputStream fis;
	private static int k;
	
	//PrintWriter os = new PrintWriter(server.getOutputStream());
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Socket server=null;
		int i=0;
		int j=0;
		int l=0;
		String[] movie_pic=new String[3];
	    movie_pic[0]="d:/yzx.jpg";
		movie_pic[1]="d:/wsh.jpg";
		movie_pic[2]="d:/dsb.jpg";
String[] movie_name=new String[3];
    movie_name[0]="d:/yzx.txt";
	movie_name[1]="d:/wsh.txt";
	movie_name[2]="d:/dsb.txt";
	try {
		//String inputString;
		server=new Socket("10.16.42.32",5555);
		
	//System.out.println("登录成功");
	//BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		 os = new PrintWriter(server.getOutputStream());//////////////////////////////////////////////////////////////////////////////////////////////
	//输出给服务器
	 is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	//服务器的输入
	 sin=new BufferedReader(new InputStreamReader(System.in));
	 //客户端输入
	  data = new DataInputStream(server.getInputStream());
	  //接收服务器的图片
	  os.println("true");
	  os.flush();
	  System.out.println(is.readLine());
	  while(data.readByte()==0011){
	  fin=new FileOutputStream(new File(movie_pic[j]));
	 //接受图片
	  j++;
	  fis=new FileOutputStream(new File(movie_name[i]));
	  i++;
	 // os.println("true");//
	//os.flush();	//
	//if(is.readLine().equals("true")){
	System.out.println("欢迎来到王森灏购票系统");
		//load();       //登录或创建
		int length=0;
		//while(true){
		byte[] getbyte=new byte[1024];
		System.out.println("接收数据");
		while((length=data.read(getbyte,0,getbyte.length))>0){
			fin.write(getbyte,0,length);
			fin.flush();
			
	if(data.readByte()==1100)
		break;
		}
		while((length=data.read(getbyte,0,getbyte.length))>0){
			fis.write(getbyte,0,getbyte.length);
			fis.flush();
			
		}
	}
	
		//if(is.readLine().equals("true")){
		//	System.out.println("接收完毕");
			//break;
		//}
		//}
		System.out.println("是否想看电影的评价");
		System.out.println("1.是");
		System.out.println("2.否");
		String choice=sin.readLine();
		if(choice=="1"){
			os.println("true");
			os.flush();
			System.out.println("请选择你想看评价的电影");
			System.out.println("1.Your Name");
	    	System.out.println("2.The Great Wall");
	    	System.out.println("3.The Wasted Time");
	    	os.println(sin.readLine());
	    	os.flush();
			while(true){                                   //查看评价
				if(is.readLine()=="true") break;
				System.out.println(is.readLine());
			}
		}
	
	if(is.readLine().equals("true"))
	movie();                                          //选择电影
	if(is.readLine().equals("true"))
	time();                                          //选择时间段
	if(is.readLine().equals("true"))
	date();                                           //选择日期
	if(is.readLine().equals("true"))
	seat();                                            //选择座位
	System.out.println("客户名字:"+is.readLine());//打印出全部购票信息
	System.out.println("手机号码:"+is.readLine());
	System.out.println("电影名字:"+is.readLine());
	System.out.println("影厅:"+is.readLine());
	System.out.println("日期:"+is.readLine());
	System.out.println("数量:"+is.readLine());
	System.out.printf("座位:");
	if(l<k){
	System.out.println(is.readLine());
	}
	System.out.println("总价:"+is.readLine());
	System.out.println("购票日期:"+is.readLine());
	System.out.println("取票码:"+is.readLine());
	
	
		//inputString=sin.readLine();
		os.close();
		is.close();
		server.close();
		System.out.println("退出购票");

	}catch(UnknownHostException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	}
	 static void load() throws IOException{//第一步登录或创建
		 System.out.println("是否有账号？");
		 System.out.println("1.是");
		 System.out.println("2.否");
		 String answer=sin.readLine();
		 //没有账号先返回true
		 if (answer=="2"){
			 os.println("true");
			 os.flush();
			 System.out.println("输入您的账户名字:");
			 os.println(sin.readLine());
			 os.flush();
			 System.out.println("输入您的手机号码:");
			 os.println(sin.readLine());
			 os.flush();
			 System.out.println("输入您的密码:");
			 os.println(sin.readLine());
			 os.flush();
		 }
		 //有账号直接登录
		 else{
		 System.out.println("输入您的账户名字:");
		 os.println("客户名字为"+sin.readLine());
		 os.flush();
		 System.out.println("输入您的手机号码:");
		 os.println("客户号码为"+sin.readLine());
		 os.flush();
		 System.out.println("输入您的密码:");
			 os.println("客户密码为"+sin.readLine());
			 os.flush();
		System.out.println("登录成功");
	}
		 }
      static void movie() throws IOException{//第二步选择电影
    	  System.out.println("请选择您想要的电影:");
    	  System.out.println("1.Your Name-40￥");
    	  System.out.println("2.The Great Wall-60￥");
    	  System.out.println("3.The Wasted Time-40￥");
    	  //int x=Integer.parseInt(sin.readLine());
           os.println(sin.readLine());
           os.flush();
      }
	static void time() throws IOException{//先选择时间段
		System.out.println("请选择您想看电影的时间段：");
		System.out.println("1.8");
		System.out.println("2.16");
		System.out.println("3.21");
		//cc=sin.readLine();
		os.println(sin.readLine());
		os.flush();
	}
    static void date() throws IOException{//选择日期
    	System.out.println("请选择看电影的日期");
    	System.out.println("2016");
    	System.out.println("  月");
    	System.out.println("  日");
    	os.println(sin.readLine());
    	os.flush();
    	//System.out.println(1);
    }
    static void seat() throws IOException{//选择座位
    	k=0;
    	System.out.println("请选择您想要的座位");
    	os.println(cc);
    	//显示所有座位有没有的情况,卖出的座位标记成无法点击
    	while(true){
    		cc=sin.readLine();
    		if(cc.equals("false"))
    			break;
    		else  {os.println(cc);//输出座位
    		k++;//座位增加
    	os.flush();
    	System.out.println("请继续选择您要的座位");
    	}
    	}
    	os.println("false");
    	os.flush();
    }
}







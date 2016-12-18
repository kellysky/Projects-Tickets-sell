package yzx;
import java.io.*;
import java.net.*;

public class Client1 {
	static Socket server=null;
	private static PrintWriter os;
	private static BufferedReader is;
	private static BufferedReader sin;
	private static String cc;
	//PrintWriter os = new PrintWriter(server.getOutputStream());
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Socket server=null;

	
	try {
		//String inputString;
		server=new Socket("10.16.42.33",5555);
		
	//System.out.println("登录成功");
	//BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		 os = new PrintWriter(server.getOutputStream());//////////////////////////////////////////////////////////////////////////////////////////////
	//输出给服务器
	 is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	//服务器的输入
	 sin=new BufferedReader(new InputStreamReader(System.in));
os.println("true");//
	os.flush();	//
	if(is.readLine().equals("true")){
	System.out.println("欢迎来到王森灏购票系统");
		load();
	}
	if(is.readLine().equals("true"))
	movie();
	if(is.readLine().equals("true"))
	time();
	if(is.readLine().equals("true"))
	date();
	if(is.readLine().equals("true"))
	seat();
	System.out.println("取票码为"+is.readLine());//读取服务器发送的取票码
	
	
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
	 static void load() throws IOException{//第一步输入客户信息
		 System.out.println("输入您的账户名字:");
		 os.println("客户名字为"+sin.readLine());
		 os.flush();
		 System.out.println("输入您的手机号码:");
		 os.println("客户号码为"+sin.readLine());
		 os.flush();
		System.out.println("登录成功");
	}
      static void movie() throws IOException{
    	  System.out.println("请选择您想要的电影:");
    	  System.out.println("1.asdasd");
    	  System.out.println("2.asdasdasd");
    	  System.out.println("3.asdasdasdsad");
    	  //int x=Integer.parseInt(sin.readLine());
           os.println(sin.readLine());
           os.flush();
      }
	static void time() throws IOException{
		System.out.println("请选择您想看电影的时间段：");
		System.out.println("1.8");
		System.out.println("2.16");
		System.out.println("3.21");
		cc=sin.readLine();
		os.println(cc);
		os.flush();
	}
    static void date() throws IOException{
    	System.out.println("请选择看电影的日期");
    	System.out.println("2016");
    	System.out.println("  月");
    	System.out.println("  日");
    	os.println(sin.readLine());
    	os.flush();
    	System.out.println(1);
    }
    static void seat() throws IOException{
    	System.out.println("请选择您想要的座位");
    	os.println(cc);
    	//显示所有座位有没有的情况,卖出的座位标记成无法点击
    	while(true){
    		cc=sin.readLine();
    		if(cc.equals("false"))
    			break;
    		else  {os.println(cc);//XXXX
    	os.flush();
    	System.out.println("请继续选择您要的座位");
    	}
    	}
    	os.println("false");
    	os.flush();
    }
}







package yzx;
import java.io.*;
import java.net.*;

public class Client1 {
	static Socket server=null;
	private static PrintWriter os;
	private BufferedReader is;
	private static BufferedReader sin;
	//PrintWriter os = new PrintWriter(server.getOutputStream());
	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Socket server=null;

	
	try {
		//String inputString;
		server=new Socket("192.168.1.105",5555);
	//System.out.println("登录成功");
	//BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os = new PrintWriter(server.getOutputStream());//////////////////////////////////////////////////////////////////////////////////////////////
	//输出给服务器
	BufferedReader is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	//服务器的输入
	
	load();
	if(is.readLine().equals("true"))
	movie();
	if(is.readLine().equals("true"))
	time();
	if(is.readLine().equals("true"))
	date();
	if(is.readLine().equals("true"))
	seat();
	
	
	
	
		//inputString=sin.readLine();
		os.close();
		is.close();
		server.close();
		System.out.println("聊天结束");

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
		os.println(sin.readLine());
		os.flush();
	}
    static void date() throws IOException{
    	System.out.println("请选择看电影的日期");
    	System.out.println("2016");
    	System.out.println("  月");
    	System.out.println("  日");
    	os.println(sin.readLine());
    	os.flush();
    }
    static void seat() throws IOException{
    	System.out.println("请选择您想要的座位");
    	os.println(sin.readLine());
    	os.flush();
    }
}







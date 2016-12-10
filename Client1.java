package cn.wsh.client;
import java.io.*;
import java.net.*;

public class Client1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Socket server=null;

	
	try {
		String inputString;
		server=new Socket("192.168.1.105",5555);
	System.out.println("登录成功");
	BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
	
		PrintWriter os = new PrintWriter(server.getOutputStream());
	
	BufferedReader is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	

		inputString=sin.readLine();
		while(inputString!=null&&!inputString.trim().equals("quit")){
			os.println(inputString);
			os.flush();
			System.out.println("client:"+inputString);
			System.out.println("server:"+is.readLine());
			inputString=sin.readLine();
	}
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

}

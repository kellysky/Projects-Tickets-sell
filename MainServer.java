package cn.wsh.server;
import java.net.*;
import java.io.*;

public class MainServer {
 static int num=1;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
ServerSocket serversocket=null;
Socket client=null;

Movie movie=new Movie();
movie.init();
movie.file();
while(true){
	 try {
		serversocket=new ServerSocket(5555);  //绑定端口5555监听客户请求
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.print("没有连接");
	}
	 try {
		client=serversocket.accept();  //使用accept阻塞等待客户请求，请求到来时产生一个socket对象
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.print("没有连接");
	}
	 System.out.println("客户"+MainServer.num+"]登录............");
	 Tickets tickets=new Tickets(client);
	 Thread t=new Thread(tickets);
	 t.start();
	 try{
		 serversocket.close();
	 }catch(IOException e){
		 System.out.print("false");
		
	 }
	 num++;
	 
}
}

}

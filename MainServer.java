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
		serversocket=new ServerSocket(5555);  //�󶨶˿�5555�����ͻ�����
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.print("û������");
	}
	 try {
		client=serversocket.accept();  //ʹ��accept�����ȴ��ͻ�����������ʱ����һ��socket����
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.print("û������");
	}
	 System.out.println("�ͻ�"+MainServer.num+"]��¼............");
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

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
ServerSocket serversocket2=null;
Socket client=null;
Socket client2=null;

Movie movie=new Movie();


try {
	FileOutputStream out=new FileOutputStream(".//ClientLibrary.dat");
    ObjectOutputStream object=new ObjectOutputStream(out);
    object.writeObject(new Hash());
    object.close();
    out.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
try {
	
	FileOutputStream out=new FileOutputStream(".//ClientsRecords.dat");
    ObjectOutputStream object=new ObjectOutputStream(out);
    object.writeObject(new Hash());
    object.close();
    out.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
while(true){
	 try {
		serversocket=new ServerSocket(5555);    //�󶨶˿�5555�����ͻ�����
		serversocket2=new ServerSocket(6666);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.print("û������");
	}
	 try {
		client=serversocket.accept();  //ʹ��accept�����ȴ��ͻ�����������ʱ����һ��socket����
		client2=serversocket2.accept();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.out.print("û������");
	}
	 System.out.println("�ͻ�"+MainServer.num+"]��¼............");
	 Tickets tickets=new Tickets(client,client2);
	 Thread t=new Thread(tickets);
	 t.start();
	 try{
		 serversocket.close();
		 serversocket2.close();
	 }catch(IOException e){
		 System.out.print("false");
		
	 }
	 num++;
	 
}
}

}

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
	//System.out.println("��¼�ɹ�");
	//BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os = new PrintWriter(server.getOutputStream());//////////////////////////////////////////////////////////////////////////////////////////////
	//�����������
	BufferedReader is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	//������������
	
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
		System.out.println("�������");

	}catch(UnknownHostException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	}
	 static void load() throws IOException{//��һ������ͻ���Ϣ
		 System.out.println("���������˻�����:");
		 os.println("�ͻ�����Ϊ"+sin.readLine());
		 os.flush();
		 System.out.println("���������ֻ�����:");
		 os.println("�ͻ�����Ϊ"+sin.readLine());
		 os.flush();
		System.out.println("��¼�ɹ�");
	}
      static void movie() throws IOException{
    	  System.out.println("��ѡ������Ҫ�ĵ�Ӱ:");
    	  System.out.println("1.asdasd");
    	  System.out.println("2.asdasdasd");
    	  System.out.println("3.asdasdasdsad");
    	  //int x=Integer.parseInt(sin.readLine());
           os.println(sin.readLine());
           os.flush();
      }
	static void time() throws IOException{
		System.out.println("��ѡ�����뿴��Ӱ��ʱ��Σ�");
		System.out.println("1.8");
		System.out.println("2.16");
		System.out.println("3.21");
		os.println(sin.readLine());
		os.flush();
	}
    static void date() throws IOException{
    	System.out.println("��ѡ�񿴵�Ӱ������");
    	System.out.println("2016");
    	System.out.println("  ��");
    	System.out.println("  ��");
    	os.println(sin.readLine());
    	os.flush();
    }
    static void seat() throws IOException{
    	System.out.println("��ѡ������Ҫ����λ");
    	os.println(sin.readLine());
    	os.flush();
    }
}







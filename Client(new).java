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
		
	//System.out.println("��¼�ɹ�");
	//BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		 os = new PrintWriter(server.getOutputStream());//////////////////////////////////////////////////////////////////////////////////////////////
	//�����������
	 is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	//������������
	 sin=new BufferedReader(new InputStreamReader(System.in));
os.println("true");//
	os.flush();	//
	if(is.readLine().equals("true")){
	System.out.println("��ӭ������ɭ尹�Ʊϵͳ");
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
	System.out.println("ȡƱ��Ϊ"+is.readLine());//��ȡ���������͵�ȡƱ��
	
	
		//inputString=sin.readLine();
		os.close();
		is.close();
		server.close();
		System.out.println("�˳���Ʊ");

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
		cc=sin.readLine();
		os.println(cc);
		os.flush();
	}
    static void date() throws IOException{
    	System.out.println("��ѡ�񿴵�Ӱ������");
    	System.out.println("2016");
    	System.out.println("  ��");
    	System.out.println("  ��");
    	os.println(sin.readLine());
    	os.flush();
    	System.out.println(1);
    }
    static void seat() throws IOException{
    	System.out.println("��ѡ������Ҫ����λ");
    	os.println(cc);
    	//��ʾ������λ��û�е����,��������λ��ǳ��޷����
    	while(true){
    		cc=sin.readLine();
    		if(cc.equals("false"))
    			break;
    		else  {os.println(cc);//XXXX
    	os.flush();
    	System.out.println("�����ѡ����Ҫ����λ");
    	}
    	}
    	os.println("false");
    	os.flush();
    }
}







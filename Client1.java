package yzx;
import java.io.*;
import java.net.*;

public class Client1 {
	static Socket server=null;
	static Socket server2=null;
	private static PrintWriter os;
	private static BufferedReader is;
	private static BufferedReader sin;
	private static String cc;
	private static DataInputStream data;
	private static FileOutputStream fin;
	private static FileOutputStream fis;
	private static int k;
	
	//PrintWriter os = new PrintWriter(server.getOutputStream());
	/**p
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto
//Socket server=null;
		
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
		server=new Socket("127.0.0.1",5555);
		server2=new Socket("127.0.0.1",6666);
	System.out.println("��¼�ɹ�");
	//BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
		 os = new PrintWriter(server.getOutputStream());
	//�����������
	 is = new BufferedReader(new InputStreamReader(server.getInputStream()));
	//������������
	 sin=new BufferedReader(new InputStreamReader(System.in));
	 //�ͻ�������
	  data = new DataInputStream(server2.getInputStream());
	  //���շ�������ͼƬ
	 String num=is.readLine();
	 int a=Integer.parseInt(num);                                  //�ļ�����
	 byte[] getbyte=new byte[1024];
	 int[] pic_length=new int[a];
	 int[] name_length=new int[a];
	 for(int k=0;k<a;k++){
		  pic_length[k]=Integer.parseInt(is.readLine());
		 System.out.println(pic_length[k]);
		  name_length[k]=Integer.parseInt(is.readLine());
		 System.out.println(name_length[k]);
	 }
	 
	 for(int k=0;k<a;k++){
		 fin=new FileOutputStream(new File(movie_pic[k]));
		 fis=new FileOutputStream(new File(movie_name[k]));
		    int i=0;
			int length=0;
			while((length=data.read(getbyte,0,getbyte.length))>0){                                  //����ͼƬ
				fin.write(getbyte,0,length);
				fin.flush();
				i+=1024;
				if(i>pic_length[k]){
					i=0;
					System.out.println("s");
					break;
				}
			}
			
			while((length=data.read(getbyte,0,getbyte.length))>0){                                //�����ļ�
				fis.write(getbyte,0,length);
				fis.flush();
				i+=1024;
				if(i>name_length[k]){
					i=0;
					System.out.println("x");
					break;
				}
			}
			 System.out.println("success");
	
	 }
	          data.close();
	System.out.println("true");
	
		System.out.println("�Ƿ��뿴��Ӱ������");
		System.out.println("1.��");
		System.out.println("2.��");
		String choice=sin.readLine();
		if(choice=="1"){
			os.println("true");
			os.flush();
			System.out.println("��ѡ�����뿴���۵ĵ�Ӱ");
			System.out.println("1.Your Name");
	    	System.out.println("2.The Great Wall");
	    	System.out.println("3.The Wasted Time");
	    	os.println(sin.readLine());
	    	os.flush();
			while(true){                                   //�鿴����
				if(is.readLine()=="true") break;
				System.out.println(is.readLine());
			}
		}
	
	if(is.readLine().equals("true"))
	movie();                                          //ѡ���Ӱ
	if(is.readLine().equals("true"))
	time();                                          //ѡ��ʱ���
	if(is.readLine().equals("true"))
	date();                                           //ѡ������
	if(is.readLine().equals("true"))
	seat();                                            //ѡ����λ
	System.out.println("�ͻ�����:"+is.readLine());//��ӡ��ȫ����Ʊ��Ϣ
	System.out.println("�ֻ�����:"+is.readLine());
	System.out.println("��Ӱ����:"+is.readLine());
	System.out.println("Ӱ��:"+is.readLine());
	System.out.println("����:"+is.readLine());
	System.out.println("����:"+is.readLine());
	System.out.print("��λ:");
	if(l<k){
	System.out.println(is.readLine());
	}
	System.out.println("�ܼ�:"+is.readLine());
	System.out.println("��Ʊ����:"+is.readLine());
	System.out.println("ȡƱ��:"+is.readLine());
	
	
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
	 static void load() throws IOException{//��һ����¼�򴴽�
		 System.out.println("�Ƿ����˺ţ�");
		 System.out.println("1.��");
		 System.out.println("2.��");
		 String answer=sin.readLine();
		 //û���˺��ȷ���true
		 if (answer=="2"){
			 os.println("true");
			 os.flush();
			 System.out.println("���������˻�����:");
			 os.println(sin.readLine());
			 os.flush();
			 System.out.println("���������ֻ�����:");
			 os.println(sin.readLine());
			 os.flush();
			 System.out.println("������������:");
			 os.println(sin.readLine());
			 os.flush();
		 }
		 //���˺�ֱ�ӵ�¼                                           
		 else{                                      //����������
		 System.out.println("���������˻�����:");
		 os.println("�ͻ�����Ϊ"+sin.readLine());
		 os.flush();
		 System.out.println("���������ֻ�����:");
		 os.println("�ͻ�����Ϊ"+sin.readLine());
		 os.flush();
		 System.out.println("������������:");
			 os.println("�ͻ�����Ϊ"+sin.readLine());
			 os.flush();                                                 //�˴�ȱ����֤��
		System.out.println("��¼�ɹ�");
	}
		 }
	 
      static void movie() throws IOException{//�ڶ���ѡ���Ӱ
    	  System.out.println("��ѡ������Ҫ�ĵ�Ӱ:");
    	  System.out.println("1.Your Name-40��");
    	  System.out.println("2.The Great Wall-60��");
    	  System.out.println("3.The Wasted Time-40��");
    	  //int x=Integer.parseInt(sin.readLine());
           os.println(sin.readLine());
           os.flush();
      }
	static void time() throws IOException{//��ѡ��ʱ���
		System.out.println("��ѡ�����뿴��Ӱ��ʱ��Σ�");
		System.out.println("1.8");
		System.out.println("2.16");
		System.out.println("3.21");
		//cc=sin.readLine();
		os.println(sin.readLine());
		os.flush();
	}
    static void date() throws IOException{//ѡ������
    	System.out.println("��ѡ�񿴵�Ӱ������");
    	System.out.println("2016");
    	System.out.println("  ��");
    	System.out.println("  ��");
    	os.println(sin.readLine());
    	os.flush();
    	//System.out.println(1);
    }
    static void seat() throws IOException{//ѡ����λ
    	k=0;
    	System.out.println("��ѡ������Ҫ����λ");
    	os.println(cc);
    	//��ʾ������λ��û�е����,��������λ��ǳ��޷����
    	while(true){
    		cc=sin.readLine();
    		if(cc.equals("false"))
    			break;
    		else  {os.println(cc);//�����λ
    		k++;//��λ����
    	os.flush();
    	System.out.println("�����ѡ����Ҫ����λ");
    	}
    	}
    	os.println("false");
    	os.flush();
    }
}







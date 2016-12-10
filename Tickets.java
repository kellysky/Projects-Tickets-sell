package cn.wsh.server;

import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Tickets  implements Runnable{
	
private Socket client;
private BufferedReader is;
private PrintWriter os;
private YourName_Server yourname;
private BufferedWriter bout;
private BufferedReader bouts;
private FileOutputStream fos;
private FileWriter files;
private FileReader file;
private FileInputStream fis;
private ObjectInputStream in;
private ObjectOutputStream out;
private File fout;
private String filename;
private String name;
private int price=0;

  
 //���캯��
   public Tickets(Socket client){
	 this.client=client;
	  initialize();
  }
 

	//���г�ʼ��
	public void initialize(){
		 try {
			is=new BufferedReader(new InputStreamReader(client.getInputStream()));
			//��Socket����õ�������������BufferedReader����
			 os=new PrintWriter(client.getOutputStream());
			 //��Socket�����������������PrintWriter����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void run(){
		try {
		
		if(is.readLine().equals("true")){
			os.println(true);
		os.flush();
		}    //������-�ͻ���ƥ��ɹ�
		   information();
			action();
			buy();
			print();
	       end();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	// �ͻ��ύ������Ϣ
	public void information(){
		try {
			name = is.readLine();
			fout=new File(name);
			files=new FileWriter(fout);
			bout=new BufferedWriter(files);
			
			bout.write("�ͻ�������"+name);
			bout.newLine();
		    String cellphone=is.readLine();
			bout.write("�ͻ���ϵ��ʽ��"+cellphone);
			bout.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//ѡ���Ӱ
	public void  action() throws IOException{
		if(is.readLine().equals("1")){			
			os.println(true);
			os.flush();
			bout.write("��Ӱ���֣�"+"�������(��Ӱ����40)");
			bout.newLine();
			int hall=Integer.parseInt(is.readLine());
			movie_one( hall);
		}
	}
	
	//���бȶ�ʱ�����
	public void movie_one(int hall){	
		
		try {
			SimpleDateFormat s1=new SimpleDateFormat(" yyyy-MM-dd ");
			Date date=new Date();
			String date1=s1.format(date);
			String str=is.readLine();
			int days=daysBetween(str,date1);         //�ٶ���Ӱ������ӳ     
			
			
			String s=String.valueOf(days);           
			filename=".\\"+"yourname"+s+".dat";     //ȷ�������ļ���,ȷ����Ӱ����
			 fis=new FileInputStream(filename);      //�������������
			in=new ObjectInputStream(fis);               
			yourname=(YourName_Server)in.readObject();          //�������
			
			if(days>0){
				os.print(true);
				os.flush();
				bout.write("ʱ��:  "+str);
				bout.newLine();
				bout.write("��Ʊʱ�䣺"+date1);
				bout.newLine();
			}else if(days==0){
				if(date.getHours()>=yourname.time[hall]){
					os.print(false);
					os.flush();
				}else {
					os.print(true);
					os.flush();
					bout.write("ʱ�䣺  "+str);
					bout.newLine();
					bout.write("��Ʊʱ�䣺"+date1);
					bout.newLine();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        
	}
	
	
	//����ʱ���Ӷ�������Ӧ�ļ�
	  public int daysBetween(String smdate,String bdate) throws ParseException{  
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(sdf.parse(smdate));    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(sdf.parse(bdate));    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time2-time1)/(1000*3600*24);  
	            
	       return Integer.parseInt(String.valueOf(between_days));     
	    }  
	
  
	//���й�Ʊ����
	public void buy(){
		
		try {
		    int k=Integer.parseInt(is.readLine());    //���յ�Ӱ������Ϣ
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					os.println(yourname.seat[k][i][j]);
					os.flush();                         //��ͻ��˷�����λ���
				}
			}
			String str = is.readLine();
			while(str.equals(false)){     //�ж�����  ֱ���ͻ��˷��������������ѭ��
			int seat=Integer.parseInt(str);
			int row=seat/100;
			int line=seat%100;
			yourname.seat[k][row][line]=false;
			yourname.number--;
			price+=40;
			
			os.println(true);
			os.flush();
			
			bout.write("������λ��"+row+"��"+line+"��");
			bout.newLine();
			}
		} catch (NumberFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
	}
	
	
	
	//��ӡ��Ʊ��Ϣ������ȡƱ��
		public void print(){			
			 try {
				String str=String.valueOf(price);
				bout.write("�ܽ�"+str);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			 
			    String base = "1234567890";
			    Random random = new Random();   
			    StringBuffer sb = new StringBuffer();   
			    for (int i = 0; i < 9; i++) {   
			        int number = random.nextInt(base.length());   
			        sb.append(base.charAt(number));   
			    } 
			    
			    
			   try {
				bout.write("ȡƱ�룺"+sb.toString());
				bout.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			 os.println(sb.toString()); 
			 os.flush();
		}
		
		//��ͻ����乺����Ϣ,��������������
		public void transit(){
			try {
				file=new FileReader(name);
				bouts=new BufferedReader(file);
				String str;		
				while((str=bouts.readLine())!=null){
						os.print(str);
						os.flush();
					}	
				
				bout.write("�û����ۣ�"+is.readLine());
				os.print(true);
				os.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}
		
		//д���޸��˵��ļ�,�ر������Ͽ�����
		public void end(){
			try {
				fos=new FileOutputStream(filename);
			     out=new ObjectOutputStream(fos);
			     out.writeObject(yourname);
			     file.close();
			     bout.close();
			     out.close();
			     in.close();
			     os.close();
				 is.close();
				 client.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}

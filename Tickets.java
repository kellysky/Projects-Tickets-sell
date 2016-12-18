package cn.wsh.server;

import java.io.*;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;

public class Tickets  implements Runnable{
	
private Socket client;
private BufferedReader is;                                      //socket������
private PrintWriter os;                                        //socket�����
private YourName_Server yourname;                               //������
private Hashtable<String,YourName_Server> table;              //�ļ���д��������ʵ�ֶԶ������ݵ��޸� 
private Hashtable<String,ClientsRecords> records ; 
private FileOutputStream fos;                                 //�ļ������������д���Ӱ����
private FileInputStream fis;                                   //�ļ������������ڶ�ȡ����
private ObjectInputStream in;                               
private ObjectOutputStream out;
private ObjectOutputStream object;
private String filename;
private Customer customer;
private FileOutputStream  files;                            //����д���û���Ϣ
private String name;
private ClientsRecords newClients;

   //���캯��
   public Tickets(Socket client){
	 this.client=client;
	 table=new Hashtable<String,YourName_Server>();
	 customer=new Customer();
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
			System.out.print("true");
			os.println(true);
		os.flush();
		}    //������-�ͻ���ƥ��ɹ�
		    log();
		    if(is.readLine().equals("true"))
		    information();
			os.println(true);
			os.flush();
			action();
			
			buy();
			os.println(true);
			os.flush();
			print();
			os.println(true);
			os.flush();
			transit();
	        end();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//��¼
    public void log(){
    	
    	try {
    		fis=new FileInputStream("ClientsRecords");
			in=new ObjectInputStream(fis);
			records=(Hashtable)in.readObject();
			while(true){
				String str="1234567890abcdefghijklmnopqlstuvwxyz";
				String check_code=check_code(str,4);                                                   //��֤��    
				os.println(check_code);
				os.flush();
				
				
				name=is.readLine();
				String code=is.readLine();
				String checkcode=is.readLine();
				boolean contigo=false;		
				
			for(int i=0;i<table.size();i++){
				if(records.get(name).name.equals(name)){                           //�˴��п��ܷ����쳣���账��
					if(records.get(name).code.equals(code)){
						if(checkcode.equals(check_code)){
					customer.name=records.get(name).name;                                     //��¼�ɹ�
					customer.cellphone=records.get(name).cellphone;
					customer.member=true;
					customer.member_score=records.get(name).member_score;
					newClients=records.get(name);
					contigo=true;
					os.println(true);                                                         //��½�ɹ�
				    os.flush();
						}else{
							os.println("��֤���������");
							os.flush();
						}
				}else{
					os.println("�����������");
					os.flush();
				}
				}else{
					os.println("�û���������");
					os.flush();
				}
			}
			if(name.equals("false")||contigo==true)
				break;	
			os.println(false);
			os.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
    
    
	// �����˻����ͻ��ύ������Ϣ
	public void information(){
		
			try {
				newClients=new ClientsRecords();
				records.put(name,newClients);
				customer.name = is.readLine();
				System.out.println(customer.name);
				
			    customer.cellphone=is.readLine();
			    System.out.println(customer.cellphone);
				
			    String code=is.readLine();
			    
			    newClients.name=customer.name;
			    newClients.cellphone=customer.cellphone;
			    newClients.code=code;
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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

			customer.tickets_name="�������(��Ӱ����40)";
			System.out.println("�������");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			os.println(true);
			os.flush();
			movie_one( hall);
			
		}
		if(is.readLine().equals("2")){			
			os.println(true);
			os.flush();

			customer.tickets_name="����(��Ӱ����60)";
			System.out.println("����");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			os.println(true);
			os.flush();
			movie_one( hall);
			
		}
		if(is.readLine().equals("3")){			
			os.println(true);
			os.flush();

			customer.tickets_name="�����ٿ�����ʷ(��Ӱ����40)";
			System.out.println("�����ٿ�����ʷ");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			os.println(true);
			os.flush();
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
			
			int days=daysBetween(date1,str);                //�ٶ���Ӱ������ӳ     
			System.out.println("����:");
			System.out.println(days);
			
			String s=String.valueOf(days);           
			filename=".\\yourname.dat";                     //ȷ�������ļ���,ȷ����Ӱ����
			fis=new FileInputStream(filename);                 //�������������
			in=new ObjectInputStream(fis);               
			table=(Hashtable)in.readObject();               //
			yourname=table.get(s);                          //ͨ����ֵ�����ض�����
			if(days>0){
				customer.time=str;
				customer.date=date1;
				os.println(true);
				os.flush();
		
			}else if(days==0){
				if(date.getHours()>=yourname.time[hall]){
					os.println(false);
					os.flush();
				}else {
					customer.time=str;
					customer.date=date1;
					os.println(true);
					os.flush();

				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
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
		    int k=Integer.parseInt(is.readLine());   
		    System.out.print("���Σ�");
		    System.out.println(k);                            //���յ�Ӱ������Ϣ
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					os.println(yourname.seat[k][i][j]);
					os.flush();                         //��ͻ��˷�����λ���
				}
			}
			
			while(true){ 
				int i=0;//�ж�����  ֱ���ͻ��˷��������������ѭ��
				String str=is.readLine();
				if(str.equals("false"))
					break;
			int seat=Integer.parseInt(str);
			int row=seat/100;
			int line=seat%100;
			yourname.seat[k][row][line]=false;
			customer.price+=40;
			String s1=String.valueOf(row);
			String s2=String.valueOf(line);
			customer.seat[0]=row+"��"+line+"��";
			System.out.println("��λ��");
			System.out.print(row);
			System.out.print(line);
			yourname.number--;
			
			
			os.println(true);
			os.flush();
			
	
			i++;
			if(i>4){                   //ÿ����๺�������λ;
				os.print(false);
				os.flush();
			}
			}
		} catch ( IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
	}
	
	
	
	//��ӡ��Ʊ��Ϣ������ȡƱ��
		public void print() {
			      String str="1234567890";
				  String code=check_code(str,9);		
				  
			      System.out.print("ȡƱ��");
			      System.out.println(code);

			      customer.code=code;  
			      os.println(code); 
			      os.flush();
		}
		
		//������֤��   ȡƱ��
		public String check_code(String str,int length){
			     String base = str;
			    Random random = new Random();   
			    StringBuffer sb = new StringBuffer();   
			    for (int i = 0; i < length; i++) {   
			        int number = random.nextInt(base.length());   
			        sb.append(base.charAt(number));   
			    } 
			  return sb.toString();  
		}
		
		
		//��ͻ����乺����Ϣ,��������������
		public void transit(){
			
		try {
			//��ͻ�������Ϣ
			files=new FileOutputStream("ClientsRecords");
			object=new ObjectOutputStream(files);
			if(is.readLine()=="true")     //�жϻ�Ա�ȼ�
			customer.member=true;
			if(customer.member==true)    //�õ����λ���
			customer.member_score=customer.price;
			
			
			newClients.member_score+=customer.member_score;
			newClients.records++;
			object.writeObject(records);                     //д�����Ѽ�¼
			
			os.println(customer.name);
			os.flush();
			os.println(customer.cellphone);
			os.flush();
			os.println(customer.tickets_name);
			os.flush();
			os.println(customer.hall);
			os.flush();
			os.println(customer.time);
			os.flush();
			os.println(customer.number);
			os.flush();
			for(int i=0;i<customer.seat.length;i++){
				os.println(customer.seat[i]);
				os.flush();
			}
			os.println(customer.price);
			os.flush();
			os.println(customer.date);
			os.flush();
		
			
			String str=is.readLine();                     //�õ��û�����
			customer.message=str;   
			files=new FileOutputStream("ClientLibrary");
			object=new ObjectOutputStream(files);
			object.writeObject(customer);           //д�����
			object.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
		
		//д���޸��˵��ļ�,�ر������Ͽ�����
		public void end(){
			try {
				fos=new FileOutputStream(filename);
			     out=new ObjectOutputStream(fos);                     //
			     out.writeObject(table);                           //���ļ��еĶ�������ٴ�д��			    
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

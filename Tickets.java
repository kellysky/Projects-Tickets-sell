package cn.wsh.server;

import java.io.*;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;

public class Tickets  implements Runnable{
	
private Socket client;
private Socket client2;
private BufferedReader is;                                      //socket������
private PrintWriter os;                                        //socket�����
private AllMovie movie;                                          //���ö�̬��
private Hash hash;
private Hash list;
private Hashtable<String,AllMovie> table;                     //�ļ���д��������ʵ�ֶԶ������ݵ��޸� 
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
private DataOutputStream data;


   //���캯��
   public Tickets(Socket client,Socket client2){
	 this.client=client;
	 this.client2=client2;
	
	  table=new Hashtable<String,AllMovie>();
	  records=new Hashtable<String,ClientsRecords>();
	 hash=new Hash();
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
			 data=new DataOutputStream(client2.getOutputStream());                                   //�����ļ� ͼƬ�����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void run(){
		try {
			initialize();
			 movie_information();//�����ļ���ͼƬ
		    String str=is.readLine();
		    if(str.equals("true")){
		    	  information();//�����˻�
		    }else if(str.equals("false") ){
		    	log();//��½�˻�
		    }
		   
		    assess();
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
    		fis=new FileInputStream(".//ClientsRecords.dat");
			in=new ObjectInputStream(fis);
			
			list=(Hash)in.readObject();
			records=list.records;
			System.out.print("2");
			while(true){
				String str="1234567890abcdefghijklmnopqlstuvwxyz";
				String check_code=check_code(str,4);                                                   //��֤��    
				os.println(check_code);
				os.flush();
				
				
				name=is.readLine();
				String code=is.readLine();
				String checkcode=is.readLine();
				boolean contigo=false;		
				
			for(int i=0;i<records.size();i++){
				try{
				if(records.get(name)!=null){                           //�˴��п��ܷ����쳣���账��
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
							os.println(false);
							System.out.println("��֤���������");
							os.flush();
							os.println("��֤���������");
							os.flush();
						}
				}else{
					os.println(false);
					System.out.println("�����������");
					os.flush();
					os.println("�����������");
					os.flush();
				}
				}else{
					os.println(false);
					System.out.println("�û���������");
					os.flush();
					os.println("�û���������");
					os.flush();
				}
				}catch(Exception e){
					os.println(false);
					System.out.println("���û�������");                                 //
					os.flush();    
					os.println("���û�������");
					os.flush();
				}
			}
			if(contigo==true)
				break;	
			
			}
			in.close();
			fis.close();
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
				name = is.readLine();
				customer.name=name;
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
	
	
	//����ͼƬ�Լ���Ӱ����  �� ����Ӱ��
	public void movie_information(){
		
		  try {
			  String[] str=new String[6];
			  str[0]=".\\1283314_144021_7455.jpg";
			  str[1]=".\\17_1471423924110436.jpg";
			  str[2]=".\\11809-3.jpg";
			  str[3]="TheGreatWall.txt";
			  str[4]="TheWastedTime.txt";
			  str[5]="YourName.txt";
			  os.println(str.length);
			  os.flush();
			  for(int i=0;i<6;i++){			  
			  FileInputStream fis=new FileInputStream(new File(str[i]));
			  os.println(new File(str[i]).length());                            //����ͼƬ�ĳ���
			  os.flush();
			 
			  }
			  
			for(int i=0;i<6;i++){
				  byte[] sendbyte=new byte[(int) new File(str[i]).length()];
				 int length=-1;
				
				 FileInputStream fis=new FileInputStream(new File(str[i]));
				
				 DataInputStream s=new DataInputStream(fis);
			  while ((length=s.read(sendbyte))!=-1) {
			     data.write(sendbyte);
			      data.flush();
			      
			  }
			  System.out.println("1");
			  }
		
			  System.out.println("success");
		  } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	
	public void assess(){
		try {
		  String yy=is.readLine();
			if(yy.equals("true")){   
				//�򿪹�������
			   String str=is.readLine();
				if(str.equals("1")){
					
					
					FileInputStream	stream = new FileInputStream(".//ClientLibrary.dat");
					         
					ObjectInputStream o=new ObjectInputStream(stream);               					
					Hash assess=(Hash)o.readObject();
					if(assess.array.size()==0){
					
							os.println("�ף���û��������Ŷ   ������һ�Ȱ�");
							os.flush();
						
					}else{
					for(int i=0;i<assess.array.size();i++){
						if(assess.array.get(i)!=null){					
						if(assess.array.get(i).tickets_name.equals("�������(��Ӱ����40)")){
							System.out.println(assess.array.get(i).message);
							os.println("�û�"+assess.array.get(i).cellphone+":");
							os.println(assess.array.get(i).message);
							os.flush();
						}
						
					}
					}
					}
					os.println(true);
					os.flush();
					stream.close();
					o.close();
				
				}else if(str.equals("2")){
						FileInputStream stream=new FileInputStream(".//ClientLibrary.dat");					              
						ObjectInputStream object=new ObjectInputStream(stream);               					
						Hash assess=(Hash)object.readObject();
						System.out.println(assess.list.size());
						if(assess.array.size()==0){
							
							os.println("�ף���û��������Ŷ   ������һ�Ȱ�");
							os.flush();
						
					}else{
						for(int i=0;i<assess.list.size();i++){
							if(assess.array.get(i)!=null){
							if(assess.array.get(i).equals("����(��Ӱ����60)")){
								os.println("�û�"+assess.array.get(i).cellphone+":");
								os.println(assess.array.get(i).message);
								os.flush();
							}
							}else continue;
						}
					}
						os.println(true);
						os.flush();
						stream.close();
						object.close();
							
								
				}else if(str.equals("3")){
								FileInputStream stream=new FileInputStream(".//ClientLibrary.dat");					              
								ObjectInputStream object = new ObjectInputStream(stream);
											
								Hash assess = (Hash)object.readObject();
								System.out.println(assess.list.size());
								if(assess.array.size()==0){
									
									os.println("�ף���û��������Ŷ   ������һ�Ȱ�");
									os.flush();
								
							}else{
								for(int i=0;i<assess.array.size();i++){
									if(assess.array.get(i)!=null){
									if(assess.array.get(i).tickets_name.equals("�����ٿ�����ʷ(��Ӱ����40)")){
										os.println("�û�"+assess.array.get(i).cellphone+":");
										os.println(assess.array.get(i).message);
										os.flush();
					}
									}else continue;
				}
							}
								os.println(true);
								os.flush();
								stream.close();
								object.close();
				}
			}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}              							     
		
	}
	
	
	//ѡ���Ӱ
	public void  action() throws IOException{
		String str=is.readLine();
		if(str.equals("1")){			
			os.println(true);
			os.flush();

			customer.tickets_name="�������(��Ӱ����40)";
			System.out.println("�������");
			int hall=Integer.parseInt(is.readLine());                                 //��Ӱ����
			customer.hall=hall;
			hall=hall-1;
			os.println(true);
			os.flush();
			while(true){
			movie_one( hall);
			if(is.readLine().equals("true")){
				System.out.println("fdas");
				break;
			}
			}
			
		}
		if(str.equals("2")){			
			os.println(true);
			os.flush();

			customer.tickets_name="����(��Ӱ����40)";
			System.out.println("����");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			hall=hall-1;
			os.println(true);
			os.flush();
			while(true){
				movie_one( hall);
				if(is.readLine().equals("true"))
					break;
				}
			
			
		}
		if(str.equals("3")){			
			os.println(true);
			os.flush();

			customer.tickets_name="�����ٿ�����ʷ(��Ӱ����40)";
			System.out.println("�����ٿ�����ʷ");
			int hall=Integer.parseInt(is.readLine());
			customer.hall=hall;
			hall=hall-1;
			os.println(true);                       //�ٴη����ź�
			os.flush();
			while(true){
				movie_one( hall);
				if(is.readLine().equals("true"))
					break;
				}
			
		}
	}
	
	//���бȶ�ʱ�����
	public void movie_one(int hall){	
		
		try {
						
			SimpleDateFormat s1=new SimpleDateFormat(" yyyy-MM-dd ");
			Date date=new Date();
			String date1=s1.format(date);
			String str=is.readLine();                        //�õ���Ӱ����
			
			int days=daysBetween(date1,str);                //�ٶ���Ӱ������ӳ     
			System.out.println("����:");
			System.out.println(days);
			
			String s=String.valueOf(days);           		                                               
			filename="MovieName.dat";                           //ȷ�������ļ���,ȷ����Ӱ����
			fis=new FileInputStream(filename);                 //�������������
			in=new ObjectInputStream(fis); 
		    hash=(Hash)in.readObject();               //
		    movie=hash.allmovie.get(s);                            //ͨ����ֵ�����ض�����
		    int a=movie.getMoney();
		    
		    System.out.println(a);
			if(days>0){
				customer.time=str;
				customer.date=date1;
				os.println(true);
				os.flush();
		
			}else if(days==0){
				if(date.getHours()>=movie.time[hall]){           
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
		    k=k-1;
		    System.out.print("���Σ�");
		    System.out.println(k);                            //���յ�Ӱ������Ϣ
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					os.println(movie.getSeat(i, j, k));
					os.flush();                         //��ͻ��˷�����λ���
				}
			}
			int i=0;
			while(true){ 
				//�ж�����  ֱ���ͻ��˷��������������ѭ��
				String str=is.readLine();
				if(str.equals("false"))
					break;
			int seat=Integer.parseInt(str);
			int row=seat/100;
			int line=seat%100;
			movie.setSeat(row, line, k);
			//customer.price+=movie.getMoney();
			String s1=String.valueOf(row);
			String s2=String.valueOf(line);
			customer.seat[i]=row+"��"+line+"��";
			System.out.println("��λ��");
			System.out.print(row);
			System.out.print(line);
			movie.setNumber();
			os.println(true);
			os.flush();
			i++;
			customer.number++;
			}
			customer.price=i*movie.getMoney();
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
			fis=new FileInputStream(".//ClientsRecords.dat");
			in=new ObjectInputStream(fis);
			if(is.readLine()=="true")     //�жϻ�Ա�ȼ�
			customer.member=true;
			if(customer.member==true)    //�õ����λ���
			customer.member_score=customer.price;
			
			
			newClients.member_score+=customer.member_score;
			newClients.records++;
			Hash label=new Hash(); 
			label=(Hash)in.readObject();
			label.records.put(name, newClients);
			in.close();
			fis.close();
			files=new FileOutputStream(".//ClientsRecords.dat");
			object=new ObjectOutputStream(files);
			object.writeObject(label);
			
			os.println(customer.name);
			os.flush();
			os.println(customer.cellphone);
			os.flush();
			os.println(customer.tickets_name);
			os.flush();
			os.println(customer.number);
			os.flush();
			os.println(customer.hall);
			os.flush();
			os.println(customer.time);
			os.flush();
			
			SimpleDateFormat s1=new SimpleDateFormat(" yyyy-MM-dd ");
			Date date=new Date();
			String date1=s1.format(date);
			customer.date=date1;
			
			for(int i=0;i<customer.number;i++){
				os.println(customer.seat[i]);
				os.flush();
			}
			
			os.println(customer.price);
			os.flush();
			os.println(customer.date);
			os.flush();
		
			
			String str=is.readLine();                     //�õ��û�����
			customer.message=str; 
			System.out.println(customer.message);
			fis=new FileInputStream(".//ClientLibrary.dat");
			in=new ObjectInputStream(fis);
		    Hash array = (Hash)in.readObject();
			//array.list.put(customer.tickets_name,customer);
		    array.array.add(customer);
			in.close();
			fis.close();
			files=new FileOutputStream(".//ClientLibrary.dat");
			object=new ObjectOutputStream(files);
			object.writeObject(array);           //д�����
			object.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		//д���޸��˵��ļ�,�ر������Ͽ�����
	public void end(){
			try {
				 fos=new FileOutputStream(filename);
			     out=new ObjectOutputStream(fos);                     //
			     out.writeObject(hash);                           //���ļ��еĶ�������ٴ�д��			    
			     out.close();
			     os.close();
				 is.close();
				 data.close();
				 client.close();
				 client2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}

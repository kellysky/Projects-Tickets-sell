package cn.wsh.server;

import java.io.*;
import java.util.Hashtable;


public  class Movie {
	public YourName_Server[] yourname=new YourName_Server[15];
	public GreatWall[]  greatwall=new GreatWall[15];
	public TheWastedTime[] thewastedtime=new TheWastedTime[15];
   public void init(){
	for(int i=0;i<15;i++){
		yourname[i]=new YourName_Server();
		greatwall[i]=new GreatWall();
		thewastedtime[i]=new TheWastedTime();
	}
	
	
}
   public void file(){	   
	   Hashtable<String,YourName_Server> table=new Hashtable<String,YourName_Server>();
	   Hashtable<String,GreatWall> table2=new Hashtable<String,GreatWall>();
	   Hashtable<String,TheWastedTime> table3=new Hashtable<String,TheWastedTime>();
	   
	   String name=".\\yourname.dat";
	   String name2=".\\greatwall.dat";
	   String name3=".\\thewastedtime.dat";
	   
  
		for(int i=0;i<15;i++){
			String str=String.valueOf(i);	   
		  
		try {
			FileOutputStream fos = new FileOutputStream(name);
			FileOutputStream fos2 = new FileOutputStream(name2);
			FileOutputStream fos3 = new FileOutputStream(name3);
			 
			ObjectOutputStream out=new ObjectOutputStream(fos);
			table.put(str, yourname[i]);
			out.writeObject(table);
			out.close();
			
			ObjectOutputStream out2=new ObjectOutputStream(fos2);
			table2.put(str, greatwall[i]);
			out2.writeObject(table2);
			out2.close();
			
			ObjectOutputStream out3=new ObjectOutputStream(fos3);
			table2.put(str, greatwall[i]);
			out3.writeObject(table2);
			out3.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
}

package cn.wsh.server;

import java.io.*;
import java.util.Hashtable;


public  class Movie {
	public YourName_Server[] yourname=new YourName_Server[15];
	public GreatWall[]       greatwall=new GreatWall[15];
	public TheWastedTime[] thewastedtime=new TheWastedTime[15];
	public Hash hash;
	
	public Movie(){
		hash=new Hash();
		init();
		file();
	}
   public void init(){
	for(int i=0;i<15;i++){
		yourname[i]=new YourName_Server();
		greatwall[i]=new GreatWall();
		thewastedtime[i]=new TheWastedTime();
	}
	
	
}
   public void file(){	   
	
	   
	   String name=".\\MovieName.dat";
	  
  
		for(int i=0;i<15;i++){
			String str=String.valueOf(i);	   
			hash.allmovie.put(str, greatwall[i]);
			hash.allmovie.put(str, yourname[i]);
			hash.allmovie.put(str, thewastedtime[i]);
		}
		try {
			FileOutputStream fos = new FileOutputStream(name);
			ObjectOutputStream out=new ObjectOutputStream(fos);
		
			out.writeObject(hash);
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	
}

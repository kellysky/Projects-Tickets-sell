package cn.wsh.server;

import java.io.*;


public  class Movie {
	public YourName_Server[] yourname=new YourName_Server[15];;
   public void init(){
	for(int i=0;i<15;i++){
		yourname[i]=new YourName_Server();
	}
	
	
}
   public void file(){
		for(int i=0;i<15;i++){
			String str=String.valueOf(i);
		String name=".\\"+"yourname.dat";
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(name);
			ObjectOutputStream out=new ObjectOutputStream(fos);
			out.writeObject(yourname[i]);
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
}

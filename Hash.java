package cn.wsh.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Hash implements Serializable{

	public   Hashtable<String,YourName_Server> table;
	public   Hashtable<String,GreatWall> table2;
	public   Hashtable<String,TheWastedTime> table3;
	public   Hashtable<String,ClientsRecords> records;
	public   Hashtable<String,AllMovie>  allmovie;
	public   Hashtable<String,Customer>  list;
	public   ArrayList<Customer>  array;
	
	Hash(){
		 table=new Hashtable<String,YourName_Server>();
		 table2=new Hashtable<String,GreatWall>();
		 table3=new Hashtable<String,TheWastedTime>();
		 records=new Hashtable<String,ClientsRecords>();
		 allmovie=new Hashtable<String,AllMovie>();
		 list=new Hashtable<String,Customer>();	
		 array=new ArrayList<Customer>();
	}
}

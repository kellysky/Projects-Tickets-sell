package cn.wsh.server;

import java.io.Serializable;

public class GreatWall extends AllMovie implements Serializable{

    public static int number=100; //座位数量
	public static boolean[][][] seat=new boolean[3][10][10];   //不同场次的座位情况
	public int[] time=new int[3];          //不同场次的时间
    public int money=40;
    public String date;
	
    public GreatWall(){
	  for(int k=0;k<3;k++){
	       for(int i=0;i<10;i++){
		     for(int j=0;j<10;j++)
			    seat[k][i][j]=true;
  }
	   }

	time[0]=13;
	time[1]=21;
	time[2]=10;
	date="2016-12-12";
	money=40;
	
}
    public int getMoney(){
    	return this.money;
    }
    public boolean getSeat(int i,int j,int k){
 	   boolean contigo=false;
 	   if(this.seat[k][i][j]==true){
 		   contigo=true;
 	   }
 	   return contigo;
    }
    public void setSeat(int i,int j,int k){
    	this.seat[k][i][j]=false;
    }
    public void setNumber(){
 	   this.number--;
    }
    public String getDate(){
    	return this.date;
    }
    public int getTime(int k){
    	return this.time[k];
    }
}

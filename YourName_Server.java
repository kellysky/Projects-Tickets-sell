package cn.wsh.server;
import java.io.*;

public class YourName_Server extends AllMovie implements Serializable{
	
    public static int number=100; //座位数量
	public static boolean[][][] seat=new boolean[3][10][10];   //不同场次的座位情况
	public int[] time=new int[3];          //不同场次的时间
    public int money=40;
    public String date;
	
public YourName_Server(){
	for(int k=0;k<3;k++){
	       for(int i=0;i<10;i++){
		     for(int j=0;j<10;j++)
			    seat[k][i][j]=true;
}
	}

	time[0]=10;
	time[1]=15;
	time[2]=20;
	date="2016-12-20";
}



}

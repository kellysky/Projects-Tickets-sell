package cn.wsh.server;
import java.io.*;

public class YourName_Server implements Serializable{
	
    public static int number=100; //��λ����
	public static boolean[][][] seat=new boolean[3][10][10];   //��ͬ���ε���λ���
	public int[] time=new int[3];          //��ͬ���ε�ʱ��
    public int money=40;
	
	//����ͬ���ε�ʱ��  ��λ��ʼ��
	public void initialize(){
		for(int k=0;k<3;k++){
	       for(int i=0;i<10;i++){
		     for(int j=0;i<10;j++)
			    seat[k][i][j]=true;
	}
		}
		
		time[0]=10;
		time[1]=15;
		time[2]=20;
	}
public YourName_Server(){
	initialize();
}



}

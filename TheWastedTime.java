package cn.wsh.server;

import java.io.Serializable;

public class TheWastedTime implements Serializable{

    public static int number=100; //��λ����
	public static boolean[][][] seat=new boolean[3][10][10];   //��ͬ���ε���λ���
	public int[] time=new int[3];          //��ͬ���ε�ʱ��
    public int money=40;
	
    public TheWastedTime(){
	for(int k=0;k<3;k++){
	       for(int i=0;i<10;i++){
		     for(int j=0;j<10;j++)
			    seat[k][i][j]=true;
}
	}

	time[0]=16;
	time[1]=18;
	time[2]=14;
}

}

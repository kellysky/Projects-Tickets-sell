package cn.wsh.server;

import java.io.Serializable;

public class GreatWall implements Serializable{

    public static int number=100; //��λ����
	public static boolean[][][] seat=new boolean[3][10][10];   //��ͬ���ε���λ���
	public int[] time=new int[3];          //��ͬ���ε�ʱ��
    public int money=40;
	
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
}
}
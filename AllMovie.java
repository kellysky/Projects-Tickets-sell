package cn.wsh.server;

abstract public  class AllMovie {
public int number;
boolean[][][] seat;	
public int[] time;          //不同场次的时间
public int money;
public String date;
abstract int getMoney();
abstract boolean getSeat(int i,int j,int k);
abstract void setSeat(int i,int j,int k);
abstract void setNumber();
abstract String getDate();
abstract int getTime(int k);
}

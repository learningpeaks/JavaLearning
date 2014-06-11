package com.basics;

public class Adding2numbers {
	
	//instance method
	public int adding2numbers(int x,int y) {
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int x=10;
           int y=8;
           int result=x+y;
           System.out.println( result);
           
           Adding2numbers add = new Adding2numbers();
           System.out.println(add.adding2numbers(1,2));
           
           
           
	}

}

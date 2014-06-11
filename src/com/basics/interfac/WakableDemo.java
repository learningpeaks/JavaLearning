package com.basics.interfac;

public class WakableDemo implements Wakable {
	public void bmw() 
	{
		// TODO Auto-generated method stub
		System.out.println("bmw drives very fast");
		
	}

	public void benz() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Benz travels comfort and fast ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WakableDemo m = new WakableDemo();
	      m.bmw();
	      m.benz();
	}
}

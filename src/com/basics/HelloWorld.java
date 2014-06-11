package com.basics;

public class HelloWorld{
	
	public static String main(String str){
		System.out.println("Hello world " +str);
		//System.out.println("abc");
		return "hello world "+ str + "1";
	}
	
	public static void main(String[] args){
		 System.out.print("my first program");
		 //String strReturn = main("Madhavi");
		 //String val = "XYZ";
		 //System.out.println(strReturn);
		 System.out.println(main("Chandra"));
		 main("shreyas" ,"shry" ,"s");
		 
	 }
	public static void main(String str,String secstr ){
		System.out.print( str+secstr);
	}
	
	public static void main(String str,String secstr, String  thrdstr ){
		System.out.print( str+' ' +secstr+' '+thrdstr);
	}
}


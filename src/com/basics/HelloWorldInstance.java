package com.basics;

public class HelloWorldInstance {

	//Instance level variables non static
	public String publicStr="PUBLIC_INSTANCE_STRING";
	private String privateStr;
	
	public String instanceMethod() {
		return "Instance Method";
	}
	//Class level Variables
	public static String pubStaticStr="PUBLIC_STATIC_STRING";
	private static String priStaticStr="PRIVATE_STATIC_STRING";
	
	public static void main(String[] str) {
		System.out.println(pubStaticStr);
		System.out.println(priStaticStr);
		
		HelloWorldInstance hwi = new HelloWorldInstance();
		System.out.println(hwi.publicStr);
		hwi.instanceMethod();
	}
}

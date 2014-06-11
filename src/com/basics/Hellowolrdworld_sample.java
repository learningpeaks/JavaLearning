package com.basics;


public class Hellowolrdworld_sample {
	//instance varaible
	public String str = "fisrst sample";
	public String strk= "second sample";
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("My Practice");
          
          //creating a new class to call instance variable
          Hellowolrdworld_sample hwr= new Hellowolrdworld_sample();
                    
          
          //after creating a class calling that instance varible  str,strk by hwr
          System.out.println(hwr.str);
          System.out.println(hwr.strk);
          main("chandra","loveyou");
        		  
          }
	
	public static void main(String str,String strs){
	System.out.println("my fisrt sample"+' '+str+' '+strs);
	}

}

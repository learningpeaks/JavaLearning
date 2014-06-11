package com.basics.polymorphism;

public class CarDemo {

	public static void main(String[] args) {
		//Bmw c = new Bmw();
		//c.demo();
		//instanstiating a class
		CarDemo cd = new CarDemo();
		Car c =new Benz();
		Car b =new Bmw();
		cd.demoMoves(c);
		cd.demoMoves(b);
		//System.out.println("Before Checking ARGS >>>>");
		//String str = args[0];
		//if(!str.equals("bmw") && !str.equals("benz")){
			//System.out.println("PLS Enter Valid CAR");
		//}else if(str.equals("bmw")) {
			//cd.demoMoves(b);
		//}else{
			//cd.demoMoves(c);
		}
	
//instance method declaration
	void demoMoves(Car car)
	{
		car.move();
	}
	
}
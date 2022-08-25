package com.tnsif.lesson2;

class DemoOne {
	 static Integer firstNumber = 100;
	 static int displayNumber() {
		return firstNumber;
	}
}
public class StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.out.println("Number is "+DemoOne.displayNumber());
	}

}
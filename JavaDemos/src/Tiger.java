package com.tnsif.interface1;

public class Tiger implements Animal {
	public void eat() {
		System.out.println("Tiger eats meat, it carnivorous animal");
		
	}

	@Override
	public void makesSound() {
		System.out.println("Tiger roars");	
	}

}

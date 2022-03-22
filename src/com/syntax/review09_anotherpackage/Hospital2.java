package com.syntax.review09_anotherpackage;

import com.syntax.review09.Doctor;

public class Hospital2 {
	
	public static void main(String[] args) {
		
		Doctor doc=new Doctor("Volcan", "Dereli");
		doc.printInfo(); //public available everywhere
		//Doctor.work(); // protected method not available in different package
		// doc.hello();//default method not available in different package
		// doc.getPaid(); private method is not available in different classes
		
	}
}

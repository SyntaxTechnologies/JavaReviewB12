package com.syntax.review09;

public class Hospital {
	
	public static void main(String[] args) {
		
		Doctor doc=new Doctor("John", "Smith", "Surgeon");
		doc.printInfo();

		Doctor doc1=new Doctor("Jane", "Smith");
		doc1.printInfo();
		
		System.out.println(" changin value of instance variable");
		doc1.speciality="Dermatologyst";
		
		doc1.printInfo();
		doc.printInfo();
		
		System.out.println("Changing value of static variable");
		
		//static variable should access in static way -> by class name where variable is defined
		Doctor.hospital="Inova";
		doc.printInfo();
		doc1.printInfo();
		
		System.out.println(" -----------     ");
		doc1.hospital="Best Hospital";
		
		doc.printInfo();
		doc1.printInfo();
		
		
		/*
		 *   VARIABLES
		 *   optional         optional          must    must
		 * accessModifier  nonAccessModifier  dataType  name;
		 *  
		 *  
		 *  
		 *    METHODS
		 *  optional            optional         must     must
		 *  accessModifier  nonAccessModifier  returnType name()
		 * 
		 */
		
		/*
		 * from the most restrictive to less restrictive
		 * 
		 * private -> default -> protected -> public
		 */
		
	}
}

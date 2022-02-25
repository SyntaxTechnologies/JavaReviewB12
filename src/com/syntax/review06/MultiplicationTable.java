package com.syntax.review06;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int a = 1; a < 2; a++) {

			for (int b = 1; b < 10; b++) {

				for (int c = 0; c < 9; c++) {

					System.out.print((a + c) + " X " + b + " = " + (a + c) * b + "\t");
				}
				System.out.println();
			}
		}

	}
}

package com.syntax.review06;

public class Patterns {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {

			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {

			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {

			System.out.print("*");
		}

		System.out.println();

		System.out.println(" ------   BETTER WAY -----");

		for (int r = 1; r <= 4; r++) {

			for (int col = 1; col <= 5; col++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println(" 10X10  square ");

		for (int r = 1; r <= 10; r++) {

			for (int col = 1; col <= 10; col++) {

				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println(" ---------- ");

		for (int r = 1; r <= 4; r++) {

			for (int c = 1; c <= 5; c++) {
				System.out.print(r + " ");
			}

			System.out.println();
		}

		System.out.println(" ---------- ");
		
		for (int a = 5; a >= 1; a--) {
			
			for (int b = 1; b <= 4; b++) {
				
				System.out.print(a+" ");
			}
			
			System.out.println();
		}

	}
}

package com.syntax.review06;

public class MorePatterns {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {

				if (i == 1 || i == 4 || j == 1 || j == 5) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("----   Triangle ------  ");

		for (int k = 1; k <= 5; k++) {

			for (int g = 1; g <= k; g++) {

				System.out.print(k);
			}
			System.out.println("");
		}

	}
}

package com.blz.algorithm;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt("7");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
                  findNumber(range);
	}




public  static void findNumber(int range) {
		Scanner scanner = new Scanner(System.in);
		int lo = 0;
		int hi = range - 1;
		int mi = (lo + hi) / 2;

		System.out.println();
		System.out.println("Think of a number in your mind between 0 to " + (range - 1));

		while (lo < hi) {
			System.out.println("if your number is between " + lo + " to " + mi + " Press 1 ");
			System.out.println("if your number is between " + (mi + 1) + " to " + hi + " Press 2");

			int uservalue = scanner.nextInt();
			if (uservalue == 1) {

				hi = mi;
				mi = (lo + hi) / 2;

			} else if (uservalue == 2) {
				lo = mi + 1;
				mi = (lo + hi) / 2;
			} else {
				System.out.println("Wrong input ");
			}
		}

		System.out.println("Your number is :" + mi);
		scanner.close();

	}
}

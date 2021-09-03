package com.blz.algorithm;

public class Prime {
         
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) { {
				System.out.print(i + " ");
			}
			
		}

	}
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}

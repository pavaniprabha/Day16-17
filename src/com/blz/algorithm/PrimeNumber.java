package com.blz.algorithm;

import java.util.Scanner;

public class PrimeNumber {
         
	public static void primeNumber(int num) {
		boolean flag;
		if(num >= 2) {
			for (int i = 2; i <= num; i++) {
				flag = true;
				for (int j = 2; j <= i/2 ; j++) {
					if(i%j == 0) {
						flag = false;
					}
				}
				if(flag == true) {
					System.out.print(i+" ");
				}
			}
		}
	
	else {
			System.out.println(" Wrong Number ");
	}

}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print Prime Numbers");
		primeNumber(sc.nextInt());
		sc.close();
	}
}

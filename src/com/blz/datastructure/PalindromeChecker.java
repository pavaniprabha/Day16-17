package com.blz.datastructure;

import java.util.Scanner;

public class PalindromeChecker {
	
	public boolean ifPalindrome(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (string.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		PalindromeChecker check = new PalindromeChecker();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = sc.next();
		if (check.ifPalindrome(string)) {
			System.out.println(string + " is a palindrome");
		} else {
			System.out.println(string + " is not a palindrome");
		}
		sc.close();
	}
}	
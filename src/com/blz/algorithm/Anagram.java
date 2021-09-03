package com.blz.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter Ist string:");
		 String str1 = sc.next();
		 System.out.println("enter 2st string:"); 
		 String str2 = sc.next();
		 
//       String str1 = "heart";
//	     String str2 = "earth";
		 
	    str1 = str1.toLowerCase();
	    str2 = str2.toLowerCase();

	 
	    if(str1.length() == str2.length()) {

	      char[] string1 = str1.toCharArray();
	      char[] string2 = str2.toCharArray();

	     
	      Arrays.sort(string1);
	      Arrays.sort(string2);

	      boolean result = Arrays.equals(string1, string2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	        sc.close();
	      }
	    }
	}
}

package com.blz.algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = "/home/admin1/eclipse-workspace/BridgelabzSectionD/src/com/bridgelabz/files/names";
		String[] strArr = str.split(",");
		stringInsertionSort(strArr);
		printStringArr(strArr);
		System.out.println("Enter key to search");
		String key = scanner.next();
		int index = stringBinarySearch(strArr, key);
		if (index >= 0)
			System.out.println("Key found at index : " + index + " which is : " + strArr[index]);
		else if(index==-1) {
			System.out.println("Key not found");
		}
		
		scanner.close();
	}
	
	public static int stringBinarySearch(String[] arr, String key) {
		int start = 0, end = arr.length - 1, mid;
		while (start <= end) {
			mid = start + (end - start) / 2;

			if (arr[mid].equals(key))
				return mid;

			if (arr[mid].compareTo(key) > 0)
				start = mid + 1;

			else
				end = mid - 1;
		}
		return -1;
	}
	
	public static String[] stringInsertionSort(String[] arr) {
		String key;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	public static void printStringArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


}

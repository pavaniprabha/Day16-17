package com.blz.datastructure;

import java.util.Scanner;


public class DayOfWeek {
         
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int date = 0, month = 0, year = 0, d1 = 0;
		
		DayOfWeek.calculateDayOfWeek(d1, month, year);
		
		System.out.println("Enter Date: ");
		date = scanner.nextInt();
		System.out.println("Enter Month: ");
		month = scanner.nextInt();
		System.out.println("Enter Year: ");
		year = scanner.nextInt();

		d1 = calculateDayOfWeek(date, month, year);

		switch (d1) {
		case 0:
			System.out.println("Day is Sunday");
			break;
		case 1:
			System.out.println("Day is Monday");
			break;
		case 2:
			System.out.println("Day is Tuesday");
			break;
		case 3:
			System.out.println("Day is Wednesday");
			break;
		case 4:
			System.out.println("Day is Thursday");
			break;
		case 5:
			System.out.println("Day is Friday");
			break;
		case 6:
			System.out.println("Day is Saturday");
			break;
		}
		
		scanner.close();
	}

	private static int calculateDayOfWeek(int date, int month, int year) {
		
		int y1, x, m, d1;
		y1 = year - (14 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((14 - month) / 12) - 2;
		d1 = (date + x + 31 * m / 12) % 7;
		return d1;
	}

}


	
	
	
	
	
	
	

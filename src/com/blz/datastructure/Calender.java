package com.blz.datastructure;

import java.util.Scanner;

public class Calender {
	static int[][] calender = new int[5][7];
	static int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	static void initCal() {
		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = -10;
			}
		}
	}

	static void display(int m) {
		System.out.println(" 	Sun    Mon	Tue	Wed	Thu	Fri	Sat");

		for (int i = 0; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				if (calender[i][j] < 0 || calender[i][j] > month[m - 1]) {
					System.out.print("\t ");
				} else if (calender[i][j] > 0) {
					System.out.print("\t" + calender[i][j] + " ");
				}
			}
			System.out.println("\t");
		}
	}

	static void putCalender(int d) {
		int d1 = 1;
		for (int i = d; i < calender[0].length; i++) {
			// System.out.print(d1);
			calender[0][i] = d1++;
		}
		for (int i = 1; i < calender.length; i++) {
			for (int j = 0; j < calender[i].length; j++) {
				calender[i][j] = d1++;
			}
		}

	}

	static void dispCalender(int m, int y) {
		int d = dayOfWeek(m, y);
		initCal();
		putCalender(d);
		display(m);

	}

	static int dayOfWeek(int m, int y) {
		int d = 1;
		int y1 = y - (14 - m) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + (31 * m) / 12) % 7;
		return d;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter month");
		int m = s.nextInt();
		System.out.println("enter year");
		int y = s.nextInt();
		dispCalender(m, y);
	}
}

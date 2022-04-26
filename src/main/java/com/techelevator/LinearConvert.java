package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the length: ");
		double length = Double.parseDouble(input.nextLine());

		System.out.println("Is the measurement in (m)eter, or (f)eet? ");
		String unit = input.nextLine();
		//System.out.println("you entered "+unit);

		if (unit.equals("f")) {

			double convert = length * 0.3048;
			System.out.println(length + "f is " + convert + "m");
		} else if (unit.equals("m")) {
			double convert = length * 3.2808399;
			System.out.println(length + "m is " + convert + "f");
		}


		input.close();
	}
}

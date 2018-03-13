package com.kishore.java.core.basicprograms;

import java.util.Stack;

public class PlayingWithNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		PlayingWithNumbers numbers = new PlayingWithNumbers();
		// System.out.println("This is number prime or not  : " +
		numbers.primeNumberOrNot(997);
		System.out.println(numbers.findTheFactorialOfTheNumber(7));
		numbers.isAmstrongNumber(153);
		numbers.fibonicSerier(10);
		numbers.isPallindrom(1521);
	}

	public boolean isEvenNuber(int input) {

		if (input % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean primeNumberOrNot(int input) {

		int temp;
		boolean flag = true;
		// System.out.println("Math.sqrt(input) :" + Math.sqrt(input));

		if (input <= 1) {

			return false;
		}
		for (temp = 2; temp <= Math.sqrt(input); temp++) {

			if (input % temp == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public void printPrimeNumbersBetweenTwoNumbers(int start, int end) {
		System.out.println("Prime Numbers are : ");
		for (int n = start; n <= end; n++) {

			if (primeNumberOrNot(n)) {
				System.out.println(n + "\n");
			}
		}
	}

	// /4!= 4*3*2*1=24
	public int findTheFactorialOfTheNumber(int input) {

		int n = input;
		int result = 1;
		while (n >= 1) {
			result *= n;
			n--;
		}
		return result;
	}

	// 0 1 1 2 3 5 8 13 21
	public void fibonicSerier(int input) {

		int arr[] = new int[input];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < input; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public boolean isPallindrom(int input) {

		int n = input;
		int reverseNumber = 0;

		while (n > 0) {

			reverseNumber = (reverseNumber * 10) + (n % 10);
			n /= 10;
		}
		System.out.println("Original number is : " + input);
		System.out.println("Reverse number is : " + reverseNumber);

		if (input == reverseNumber) {
			System.out.println("So these are pallindrom are not  : " + (input == reverseNumber));
			return true;
		}

		return false;
	}

	/*
	 * Armstrong Number in Java: Armstrong number is a number that is equal to
	 * the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.
	 * 
	 * Let's try to understand why 153 is an Armstrong number.
	 * 
	 * 153 = (1*1*1)+(5*5*5)+(3*3*3) where: (1*1*1)=1 (5*5*5)=125 (3*3*3)=27 So:
	 * 1+125+27=153
	 */public boolean isAmstrongNumber(int input) {
		 
		 int n = input;

		int result = 0;

		int singleDigit = 0;
		while (n > 0) {
			singleDigit = (n % 10);
			result += (singleDigit * singleDigit * singleDigit);
			n = n/10;
		}
		if (result == input) {
			System.out.println("So these are armstrong number are not  : " + (input == result));
			return true;
		}
		return false;
	}

}

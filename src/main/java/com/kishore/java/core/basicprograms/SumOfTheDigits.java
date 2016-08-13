package com.kishore.java.core.basicprograms;


public class SumOfTheDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumOfTheDigits sumOfTheDigits = new SumOfTheDigits();
		System.out.println("Sum of the digits : " + sumOfTheDigits.sumOfTheDigits(5439));

		System.out.println("Reverse the number : " + sumOfTheDigits.reverseTheNumber(5439));

		System.out.println("Number Of Digits: " + sumOfTheDigits.noOfDigits(5439));

		sumOfTheDigits.multiplicationOfBetweenTwoNumber(2, 5,10);

	}

	public int sumOfTheDigits(int input) {

		int result = 0;

		while (input > 0) {
			result += input % 10;
			input = input / 10;
		}
		return result;
	}

	public int reverseTheNumber(int input) {

		int result = 0;

		while (input > 0) {
			result = (result * 10) + (input % 10);
			input = input / 10;
		}
		return result;
	}

	public int noOfDigits(int input) {

		int result = 0;
		while (input > 0) {
			input = input / 10;
			result++;
		}

		return result;

	}

	public void multiplicationOfTheNumber(int input, int howManyTimes) {

		int i = 0;
		while (i < howManyTimes) {
			System.out.println(input + " X " + ++i + " = " + input * i);
		}
	}

	public void multiplicationOfBetweenTwoNumber(int startNumber, int endNumber, int howManyTimes) {

		int i = 0;
		while (i < howManyTimes) {
			i++;

			int tempNumber = startNumber;
			while (tempNumber <= endNumber) {

				System.out.print(tempNumber + " X " + i + " = " + tempNumber * i + "\t");
				tempNumber++;
			}
			System.out.println("");

		}
	}

}

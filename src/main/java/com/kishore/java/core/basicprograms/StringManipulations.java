package com.kishore.java.core.basicprograms;

public class StringManipulations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringManipulations manipulations = new StringManipulations();
		System.out.println(manipulations.stringToInteger("4586"));
	}

	public int stringToInteger(String input) {

		int result = 0;
		int zeroASCIIintValue = (int) '0';

		for (int i = 0; i < input.length(); i++) {

			int digitASCIIValue = (int) input.charAt(i);

			if (digitASCIIValue < 48 || digitASCIIValue > 57) {
				throw new NumberFormatException("The string contains other than digits");
			}

			int tempValue = (int) input.charAt(i) - zeroASCIIintValue;

			System.out.println(tempValue);

			result = result * 10 + tempValue;
		}

		return result;
	}

}

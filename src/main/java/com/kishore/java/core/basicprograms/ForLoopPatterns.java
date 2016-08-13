package com.kishore.java.core.basicprograms;

public class ForLoopPatterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ForLoopPatterns forLoopPatterns=new ForLoopPatterns();
		//forLoopPatterns.leftTriangle(5);
		forLoopPatterns.printASCIIValues();
	}
	
	
	/*
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	*/
	
	
	public void leftTriangle(int inputSize) {

		int sizeOfTheTriangle;
		int triangleStratsWith = 1;
		while (triangleStratsWith <= inputSize) {
			sizeOfTheTriangle = 1;
			while (sizeOfTheTriangle <= triangleStratsWith) {
				System.out.print(sizeOfTheTriangle + " ");
				sizeOfTheTriangle++;
			}

			System.out.println();
			triangleStratsWith++;

		}

	}	
	
	public void printASCIIValues() {

		int i = -128;
		while (i <= 127) {

			System.out.println("ASCII Value of " + i + " : " + (char) i);
			i++;
		}
	
	}
	
	
	
	
	/*
	        1
	      1 2
	    1 2 3
	  1 2 3 4
	1 2 3 4 5
	*/

	
	
	/*
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
	*/

	
	/*
	1 2 3 4 5
	  1 2 3 4
	    1 2 3
	      1 2
	        1
	*/
	
	
	
	/*      1
	      1 2 1
	    1 2 3 2 1
	  1 2 3 4 3 2 1
	1 2 3 4 5 4 3 2 1
	  1 2 3 4 3 2 1
	    1 2 3 2 1
	      1 2 1
	        1
	*/


}
 
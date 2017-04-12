package com.fundingCircle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * The Class will print first n prime numbers and their multiplication table
 * 
 * If no input provided by default it will print first 10 prime multiplication
 * table
 * 
 * 
 * 
 *
 */
public class PrimeMultiplication {

	List<Integer> l = new ArrayList<Integer>();

	public static void main(String a[]) {

		PrimeMultiplication p = new PrimeMultiplication();
		p.begin();
		p.printTable(p.l);
	}

	public void begin() {
		int n;
		try {
			System.out.println("Enter the Number of Multiplication Table to be generated");
			n = new Scanner(System.in).nextInt();

		} catch (Exception e) {
			System.out.println("No Entry for the Number of Multiplication Table, Generating the default value");
			n = 10;
		}

		generatePrime(n);
	}

	public void generatePrime(int n) {
		int k = 2;
		while (l.size() < n && k < Integer.MAX_VALUE) {
			if (isPrime(k))
				l.add(k);
			k++;
		}
	}

	private void printTable(List<Integer> l) {

		System.out.println("********* Mutiplication Table **********");
		// Below loop will set the header i.e., the row for the Prime
		// Multiplication Table
		for (int n : l)
			System.out.print("\t |" + n);
		System.out.println();

		for (int i : l) {
			// The below output will set the Column Header
			System.out.print(i);
			for (int j : l)
				System.out.print("\t |" + i * j);

			System.out.println();
		}
	}

	public boolean isPrime(int num) {
		/**
		 * if the input number is divisible by any number between 1 and the
		 * Square root range of the number, then it fails to comply and ceases
		 * to be a PRIME.
		 */

		// Base Case
		if (num < 1)
			throw new InputMismatchException("Please enter an integer between 1 and " + Integer.MAX_VALUE);

		if (num == 1)
			return true;

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}
}

package com.excercise.primenumber;

public class PrimeNumberUsingWhileLoop {

	public static void main(String[] args) {

		int number = 4 ;
		int count = 0;

		int i = 2;
		while (i < number / 2) {
			if (number % i == 0) {
				count++;
				break;
			}
			i++;

		}
		System.out.println("Number of Iteration " + i);
		if (count == 0) {
			System.out.println("Number is prime ");
		} else {
			System.out.println("Number is not prime");
		}

	}

}

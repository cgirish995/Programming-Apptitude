package com.excercise.primenumber;

public class PrimeNumberUsingForLoop {

	public static void main(String[] args) {

		int number = 13;
		int count = 0;

		for (int i = 2; i < number; i++) {
			if (number % 2 == 0){
				count++;
			break;
		}
		}

		if (count == 0) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}

}

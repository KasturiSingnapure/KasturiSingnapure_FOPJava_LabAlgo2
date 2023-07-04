package com.greatlearning.TargetTransactions;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {
		int not; // Number of transactions
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transcation array: "); // 3
		not = sc.nextInt();

		System.out.println("Enter the values of array ");
		int values[] = new int[not];
		for (int i = 0; i < not; i++) {
			values[i] = sc.nextInt(); // Input values for the transaction array
		}

		System.out.println("Enter the total no of targets that needs to be achieved: ");
		int targets = sc.nextInt();

		for (int i = 1; i <= targets; i++) {
			System.out.println("Enter the value of target");
			int target = sc.nextInt();

			int flag = 0; // If target not achieved or not
			int sum = 0;

			for (int j = 0; j < values.length; j++) {
				sum = sum + values[j]; // Calculate the sum of transaction values

				if (sum >= target) {
					flag = 1; // Target achieved
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					break;
				}
			}

			if (flag == 0)
				System.out.println("Given target is not achieved");

		}

	}

}

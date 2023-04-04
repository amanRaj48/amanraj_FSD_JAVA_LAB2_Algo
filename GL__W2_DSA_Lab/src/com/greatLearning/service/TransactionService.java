package com.greatLearning.service;

public class TransactionService {

	public void checkTransactionTarget(int[] array, int target) {
		
		int totalCount = 0;
		boolean flag = false;
		// for loop looping through an array
		for (int i = 0; i < array.length; i++) {
			// count the value of transaction using a temporary variable
			totalCount = totalCount + array[i];
			// comparing the target and totalCount Value whether it met the target value or not
			if (totalCount > target) {
				// has met the target value.
				System.out.println("Target value achieved after " + i + " transactions");
				flag = true;
				break;
			} 
		}
		if(!flag) {
			System.out.println("Target value not achieved after "+ (array.length + 1) + " transactions");
		}
		
	}

	public void checkTransactionTarget(long[] array, long target) {
		
		long totalCount = 0;
		//for loop looping through an array
		for (long i = 0; i < array.length; i++) {
			// count the value of transaction using a temporary variable
			totalCount = totalCount + array[(int) i];
			// check if the value of total count has exceeded the target value
			if (totalCount < target) {
				continue;
			}
			System.out.println("Target value is  achieved after " + (i + 1) + " transactions");

		}
	}

}

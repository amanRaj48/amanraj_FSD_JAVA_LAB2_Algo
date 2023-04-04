package com.greatLearning.service;

import java.util.ArrayList;
import java.util.List;

public class CurrencyService {
	
	public void denominatonService(int denominations[], double amount) {

		boolean flag = true;
		List<String> result = new ArrayList<>();
		int temp; //temporary variable usage in bubble sort
		
		//Using Bubble Sort For sort in descending order
		for(int j=0;j<denominations.length-1;j++) {
			if((denominations[j])<(denominations[j+1])) {
			temp=denominations[j];
			denominations[j]=denominations[j+1];
			denominations[j+1]=temp;
			}
		}
		
		//Calculation of denominations for the amount entered
		while (flag) {
			for (int i = 0; i < denominations.length; i++) {
				int numberOfDenomination = 0;
				//Finding minimum number of denominations required
				while (amount >= denominations[i]) {
					amount = amount - denominations[i];
					numberOfDenomination++;
				}
				//concatenating the statements for final result
				if (numberOfDenomination != 0) {
					result.add("Number of denominatons : " + numberOfDenomination + " Currency: " + denominations[i]);
				}

			}
			flag = false;
		}

		System.out.println(result);

	}

}

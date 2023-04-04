/*
 * @author -- Aman Raj
 * Problem Statement: Finding the minimum number of denominations for the amount
 * Denominations is also explicitly entered of own choice
 */
package com.greatLearning.client;

import java.util.Scanner;

import com.greatLearning.service.CurrencyService;

public class CurrencyClient {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		CurrencyService currencyService = new CurrencyService();
		
		System.out.println("Enter the size of currency denominations : ");
		
		//Creating array for the denominations
		int sizeOfDenominations=s.nextInt();
		int[] denominations=new int[sizeOfDenominations];
		
		System.out.println("Enter the currency denominations value : ");
		//Populate the denominations array
		for(int i=0;i<denominations.length;i++) 
		{
				denominations[i]=s.nextInt();
				
		}
		
		//Asking for the transaction amount
		System.out.println("Enter the amount you want to pay: ");
	    double transactAmt=s.nextDouble();
		
		currencyService.denominatonService(denominations, transactAmt);
		s.close();
	}

}

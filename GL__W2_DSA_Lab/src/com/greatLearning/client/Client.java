/*
 * @author -- Aman Raj
 * Problem Statement: Transactions performed on daily basis and checking whether it 
 * meets daily target or not...
 */
package com.greatLearning.client;
import java.util.Scanner;
import com.greatLearning.service.TransactionService;

public class Client {
	
	public static void main(String[] args) {
		TransactionService transactService = new TransactionService();
		//ask for the number of transactions using system.in
		Scanner sc=new Scanner(System.in);

		int target;
		
		System.out.println("Enter the size of transaction array : ");

		//create an array of length
		
		int sizeOfTransaction=sc.nextInt();
		
		int[] inputTransactions=new int[] {};
		System.out.println("Enter the values of array : ");

		//populate the array with the values using scanner class
		for(int i=0;i<sizeOfTransaction;i++) {
			inputTransactions[i]=sc.nextInt();
		}
	
		
		System.out.println("Enter the value of target : ");
		target=sc.nextInt();
		sc.close();
		
		transactService.checkTransactionTarget(inputTransactions, target);
	}

}

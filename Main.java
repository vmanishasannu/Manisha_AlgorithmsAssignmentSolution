package com.greatLearning_stockers;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of companies");
		Integer company=sc.nextInt();
		boolean[] compareStock=new boolean[company];
		double[] currentStock=new double[company];
		for(int i=0;i<company;i++) {
			System.out.println("Enter current stock price of the company "+(i+1));
				currentStock[i]=sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			 	compareStock[i]=sc.nextBoolean();
			
		}
		
			getInput(currentStock,compareStock);
			sc.close();
			
	}
	public static void getInput(double[] currentStock,boolean[] compareStock){
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the operation that you want to perform"+
		"\n1. Display the companies stock prices in ascending order"+
		"\n2. Display the companies stock prices in descending order"+
		"\n3. Display the total no of companies for which stock prices rose today"+
		"\n4. Display the total no of companies for which stock prices declined today"+
		"\n5. Search a specific stock price"+
		"\n6. press 0 to exit");
		System.out.println("-----------------------------");
		Integer choice= sc.nextInt();
		switch (choice) {
		case 1: System.out.println("Stock prices in ascending order are :\n"); 
				QuickSort.sortStockInAscending(currentStock,"asc");
				getInput(currentStock,compareStock);
	    		break; 
		case 2: System.out.println("Stock prices in descending order are :");  
				QuickSort.sortStockInAscending(currentStock,"desc");
				getInput(currentStock,compareStock);
	    		break; 
		case 3: 
				StockRise.StockRiseData(compareStock,"rise");	
				getInput(currentStock,compareStock);
	    		break; 
		case 4: 
				StockRise.StockRiseData(compareStock,"decline");
				getInput(currentStock,compareStock);
	    		break; 
		case 5: System.out.println("enter the key value"); 
				double keyVal= sc.nextDouble();
				SearchStock.searchData(keyVal,currentStock);
				getInput(currentStock,compareStock);
	    		break; 
		case 6: System.out.println("Exited successfully");  
				break;  
		default:System.out.println("Exited successfully");  
				break; 	
		}
		sc.close();
	}
}

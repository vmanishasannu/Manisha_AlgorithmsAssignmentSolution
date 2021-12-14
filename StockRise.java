package com.greatLearning_stockers;

public class StockRise {
public static void StockRiseData(boolean[] currentStock,String stockType) {
		int riseDataCount=0;
		int declineDataCount=0;
		
	for(int i = 0; i < currentStock.length; i++)
		if(currentStock[i]==true) {
			riseDataCount++;
		}else {
			declineDataCount++;
		}
	if(stockType=="rise") {
		System.out.println("Total no of companies whose stock price rose today :"+riseDataCount);
	}else {
		System.out.println("Total no of companies whose stock price declined today :"+declineDataCount);
	}
	}
}

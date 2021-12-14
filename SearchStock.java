package com.greatLearning_stockers;

public class SearchStock {
	public static void searchData(double keyVal,double[] currentStock) {
		boolean keyfound=false;
	for(int i = 0; i < currentStock.length; i++) {
		if(currentStock[i]==keyVal) {
			System.out.println("Stock of value "+keyVal+" is present "); 
			keyfound=true;
		}
	}
	if(keyfound==false) {
		System.out.println("Value not found");
	}
	}
}

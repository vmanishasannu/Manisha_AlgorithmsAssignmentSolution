package com.greatLearning_stockers;
public class QuickSort {

	public static void swap(double[] arr, int i, int j){
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
}

	public static int partitionAsc(double[] arr, int low, int high){
		double pivot = arr[high];	
		int i = (low - 1);
		for(int j = low; j <= high - 1; j++)
		{
			if (arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
}
	public static int partitionDesc(double[] arr, int low, int high) {
		double pivot = arr[high];	
		int i = (low);
		for(int j = high; j >= low ; j--)
		{
			if (arr[j] > pivot)
			{
				
				swap(arr, i, j);
				i++;
			}
		}
		swap(arr, i, high);
	    return i;
	}

	public static void quickSort(double[] arr, int low, int high,String sortType){
		if (low < high)
		{
			int pi=0 ;
			if(sortType=="asc") {
				pi=partitionAsc(arr, low, high);
			}else if(sortType=="desc") {
				pi=partitionDesc(arr, low, high);
			}

			quickSort(arr, low, pi - 1,sortType);
			quickSort(arr, pi + 1, high,sortType);
		}
	}

	public static void printArray(double[] arr, int size){
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
			
		System.out.println();
	}

	public static void sortStockInAscending(double[] currentStock,String sortType) {
		
		int n = currentStock.length;
		
		quickSort(currentStock, 0, n - 1,sortType);
		System.out.println("Sorted array: ");
		printArray(currentStock, n);
		
	}
	}
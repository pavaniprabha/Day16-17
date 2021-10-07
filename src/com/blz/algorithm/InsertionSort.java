package com.blz.algorithm;

public class InsertionSort {

	public static void main(String[] args){
		String[] arr ={"America","New York","Delhi","london","SanFrancisco", "Kerala", "tamilNadu"};
		int count = 0;
		String sortedArray[] = sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
		}
		
		InsertionSort insertionSort = new InsertionSort();
		int arr1[] = {64, 34, 25, 12, 22, 11};
		insertionSort.insertionSorting(arr1);
		}
	
		/*insertion sort for strings*/
	
		public static String[] sort_sub(String array[], int m){
		String temp="";
		for(int i=0;i<m;i++){
		for(int j=i+1;j<m;j++){
		if(array[i].compareToIgnoreCase(array[j])>0){
		temp = array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		}
		}
		return array;
		}
	
		/*insertion sort for integers*/
		
	   public void insertionSorting(int arr[]){
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp ) {
					arr[j+1] = arr[j];
					j--;
			}
			arr[j+1] = temp;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}


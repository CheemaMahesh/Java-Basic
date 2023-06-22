package javaRevisionPartOne;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]= {1,4,2,7,3,9,6,0};
	int []krr=selectionSort(arr);
	for(int i=0;i<krr.length;i++) {
		System.out.println(krr[i]);
	}

	}
	 public static int[] selectionSort(int[] arr) {
	    	//Your code goes here
	   for(int i=0;i<arr.length-1;i++){
	       for(int j=i;j<arr.length;j++){
	           if(arr[i]>arr[j]){
	               int s=arr[i];
	               arr[i]=arr[j];
	               arr[j]=s;
	           }
	       }
	   }
	   return arr;
	    }   

}

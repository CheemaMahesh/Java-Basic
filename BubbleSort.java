package javaRevisionPartOne;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {8,0,2,4,1,5,4,7,5};
		int []bbl=bubble(arr);
		for(int i=0;i<bbl.length;i++) {
			System.out.println(bbl[i]);
		}
	}
	public static int[]bubble(int[]arr){
//		int n=arr.length;
//		for(int a=0;a<n-1;a++) {
//			for(int i=1;i<n;i++) {
//				if(arr[i-1]>arr[i]) {
//					int k=arr[i-1];
//					arr[i-1]=arr[i];
//					arr[i]=k;
//				}
//			
//		}
//		
//		
//		}
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int k=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=k;
				}
			}
		}
		
		return arr;
	}

}

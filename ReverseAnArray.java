package javaRevisionPartOne;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr= {1,2,3,4,5};
			
			int krr[]=rev(arr);
			for(int i=0;i<krr.length;i++) {
				System.out.println(krr[i]);			}
			
					}
	public static int[]rev(int[]arr){
		int a=0;
		int b[]=new int[arr.length];
		
		for(int i=arr.length-1,j=0;i>=0;i--,j++) {
			
			b[j]=arr[i];
		}
		return b;
	}

}

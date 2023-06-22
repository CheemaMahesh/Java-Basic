package javaRevisionPartOne;
import java.util.Arrays;

public class FindDupFromArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int []arr= {1,2,3,6,8,3,5,7};
			System.out.println(duplicateNumber(arr));
	}
	public static int duplicateNumber(int arr[]) {
		int ans=0;
		Arrays.sort(arr);
		 
		for(int i=0;i<arr.length;i+=2) {
			if(arr[i]==arr[i+1]) {
				ans=arr[i];
				return ans;
			}
			
		}
		return ans;
		
    	
    }

}

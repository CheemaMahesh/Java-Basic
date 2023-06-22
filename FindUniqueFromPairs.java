package javaRevisionPartOne;
import java.util.Arrays;
public class FindUniqueFromPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1};
	System.out.println(findUnique(arr));
		

	}
	public static int findUnique(int[] arr){
	Arrays.sort(arr);
		int ans=arr[0];
		int j=0;
		for(int i=1;i<arr.length;) {
			if(arr[j]!=arr[i]) {
				ans=arr[j];
			}
			i=i+2;
			j=j+2;
		}
		
		return ans;
	     
	      }	      
	      
	      

	    }



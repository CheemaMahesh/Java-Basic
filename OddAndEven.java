package javaRevisionPartOne;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=221;

		int[] arr=new int[n];
		int[] ans=arrange(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(ans[i]);
		}
		

	}
	public static int[] arrange(int[] arr, int n) {
		
		int a=0;int b=1;int c=0;
		if(n%2==0) {
			a=n/2;
		}else {
			a=(n/2)+1;
		}
		
		for(int i=0;i<a;i++) {
			arr[i]=b;
			b=b+2;
		}
		
		if(n%2==0) {
			b=b-1;
		}else {
			b=b-3;
		}
		
		for(int i=a;i<n;i++) {
			arr[i]=b;
			b=b-2;
		}
		
		return arr;
	}
	}

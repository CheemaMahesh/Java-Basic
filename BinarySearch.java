package javaRevisionPartOne;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {7};
		System.out.print(binarySearch(arr,7));

	}
	 public static int binarySearch(int[] arr, int x) {
			int N=arr.length;
			int ans=-1;
			
			if(N==1&&arr[0]==x){
				return 0;
			}else if(N==0){
				return -1;
			}
			int s=0,e=N-1;
			while(s<e){
					int m=(s+e)/2;
				if(arr[m]==x){
					ans=m;
					return ans;
				}else if(x<arr[m] ){
					e=m;
				}else if(x>arr[m]){
					s=m;
				}
			}
			return ans;
			}

}

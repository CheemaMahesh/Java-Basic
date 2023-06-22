package javaRevisionPartOne;

public class SwapAlternative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {1,2,3,4,5,6};
			for(int i=0,j=1;j<arr.length;){
			    int a=arr[i];
			    int b=arr[j];
			    arr[i]=b;
			    arr[j]=a;
			    j=j+2;
			    i=i+2;
			}
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
	}

}

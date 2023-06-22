package lecture9;

public class SwapingArray {
	public static void swapAlternate(int arr[]) {

    	//Your code goes here
        int n=arr.length;
        int []krr=new int[arr.length];
        int k;
        if(n!=0){
            
            if(n%2==0){
                k=n;
                for(int i=0;i<k/2;i=i+2){
                    arr[i]=krr[i+1];
                    arr[i+1]=krr[i];
                }
            }else{
                k=n-1;
                for(int i=0;i<k/2;i=i+2){
                    arr[i]=krr[i+1];
                    arr[i+1]=krr[i];
                    arr[k]=krr[k];
                }
            }
        }
    }

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		swapAlternate(a);
		//System.out.println(swapAlternate(arr));
	}

}

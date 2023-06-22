package lecture9;

public class FindingOriginal {

	 
	    
	    /*  
	        The given approach is not the best possible solution. 
	        A better way will be taught later in the course once we
	        cover the Time/Space Complexity in the Data Structures and 
	        Algorithms part
	    */
	    
	    public static int findUnique(int[] arr){
	    	int z=0;
	        for(int i = 0; i < arr.length; i++) {
	            int j;
	            for(j = 0; j < arr.length; j++) {
	                if(i != j) {
	                    if(arr[i] == arr[j]) {
	                        break;
	                    }
	                }
	            }
	            if(j == arr.length) {
	                return arr[i];
	            }
	        }

	        /*
		    	The function would never return from this line 
	    		since the input array always contains a unique value. 

	    		To avoid the ambiguity at the compile time,
	    		the function necessarily has to return a value in case
	    		the line number 22 doesn't return the desired value during
	    		the execution of the for loop.
	        */
	      //  return Integer.MAX_VALUE;
	        return z;
	    }
	    public static void main(String[] args) {
			int a[]= {1,2,6,3,3,2,1};
			int k=findUnique(a);
			System.out.println(k);
			System.out.println(Integer.MAX_VALUE);
		}
	}



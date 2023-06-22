package javaRevisionPartOne;

public class InterSectionPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5,7,8,9,7,8,9};
		int arr2[]= {4,6,7,2,9 };
		intersections(arr1,arr2);
	}
	public static void intersections(int arr1[], int arr2[]) {
	
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
					arr1[i]=Integer.MIN_VALUE;
					arr2[j]=Integer.MAX_VALUE;
				}
			}
		} 
		   
    }

}

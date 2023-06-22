package lecture9;
import java.util.Scanner;
public class largestAmongThem {
	
	public static int k(int kk[]) {
		int n=kk.length;
		int b=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(kk[i]>b) {
				b=kk[i];
				
			}
			
		}
		return b;
	}
 public static int[] taking() {
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++) {
		 a[i]=s.nextInt();
	 }
	 return a;
 }
 public static void main(String[] args) {
	int mahi[]=taking();
	   int k=k(mahi);
	   System.out.println(k);
}
	
}

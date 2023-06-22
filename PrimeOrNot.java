package javaRevisionPartOne;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(primeOrNot(n)+" :-"+n);
	}
		

	
	public static String primeOrNot(int n) {
		String ans="NaN";
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
//				return true;
				ans="This is Not a Prime Number";
				return ans;
			}else {
//				return false;
				ans="This is a Prime Number";
				return ans;
			}	
		}
		if(n==2) {
			ans="This is a Prime Number";
		}
//		return true;
		return ans;
		
	}

}

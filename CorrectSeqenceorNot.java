package javaRevisionPartOne;
import java.util.Scanner;

public class CorrectSeqenceorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] N = new int[n];
		for(int i=0;i<n;i++){
			N[i]=s.nextInt();
		}
		boolean ans=true;
		int a=0;
		int b=0;
//		int count=0;
		int m=0;
		if(n>2){
//			ans=true;
			m=N[2]-N[1];
//			System.out.print("m="+m);
		}

		for(int i=0;i<n;i++){

			b=N[i];
			
//			System.out.print("b="+b);
//			System.out.print("a="+a);
//			System.out.println();

				if(b-a!=m) {
					ans=false;
//					count++;
//					System.out.print("false in loop");
				}

			
			a=b;
			
		}
		
		
		if(n==2){
			ans=true;

		}
		System.out.println(ans);
		

	}

}

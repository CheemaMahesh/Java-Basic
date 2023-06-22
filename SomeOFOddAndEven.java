package javaRevisionPartOne;
import java.util.Scanner;

public class SomeOFOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	int N=s.nextInt();
	int A=0;
//	int B=0;
	int odd=0;
	int even=0;
	for(;N>0;) {
		A=N%10;
		if(A%2==0) {
//			A=even+A;
			even+=A;
		}else {
			odd+=A;
		}
		N=N/10;
	}
	System.out.println(even+" "+odd);
	

	}

}

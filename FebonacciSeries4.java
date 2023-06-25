package test1;
import java.util.Scanner;
public class FebonacciSeries4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		step 1 : initilize a = 0 and b = 1
//				step 2 : for i = 1 to i = n:
//				print(a)
//				temp = a+b
//				a = b
//				b = temp
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1;
		int i=1;
		
		for(;i<=n;i++) {
			int b=i;
			int j=i;
			for(;j<=n;j++) {
				b=b*i;
				System.out.println(b);
			}
			
		}
	
		
		    } 
	}



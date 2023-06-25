package test1;
import java.util.Scanner;
public class FebonacciSeries {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

//		step 1 : initilize a = 0 and b = 1
//				step 2 : for i = 1 to i = n:
//				print(a)
//				temp = a+b
//				a = b
//				b = temp
		 static int fib(int n) 
		    { 
		    if (n <= 1) 
		       return n; 
		    return fib(n-1) + fib(n-2); 
		    } 
		       
		    public static void main (String args[]) 
		    { 
		         Scanner sc=new Scanner(System.in);
		          int n=sc.nextInt();
		    System.out.println(fib(n)); 
		    } 
	}



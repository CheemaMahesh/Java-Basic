package test1;
import java.util.Scanner;
public class FebonacciSeries5 {

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
		int result=1;
        for(int i=1;i<=n;i++)
        {
            result=result*i;
        }
        System.out.println(result);            
    }
    
    
      
    }



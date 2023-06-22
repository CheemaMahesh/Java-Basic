package javaRevisionPartOne;
import java.util.Scanner;
public class Sqares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	       int x=s.nextInt();
	       int y=s.nextInt();
	       int ans=x;
	       for(;y>1;){
	       ans=ans*x;
//	       x=ans;
	       y--;

	       }
	       System.out.println(ans);
	}

}

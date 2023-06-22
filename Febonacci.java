package javaRevisionPartOne;

public class Febonacci {

	public static void main(String[] args) {
		fb(6);	
	}
	public static void fb(int n) {
		int a=0,b=1,c;
		for(int i=0;i<n;i++) {
			System.out.println(a);
			a+=b;
			c=a;
			a=b;
			b=c;
		}
	}

}

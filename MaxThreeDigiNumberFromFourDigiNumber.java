package javaRevisionPartOne;

public class MaxThreeDigiNumberFromFourDigiNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=1111;
			System.out.print(mahi(n));
	}
	public static int mahi(int n) {
		
		int k=n;
		int ans=0;
		for(int i=0;i<1;i++) {
			int a=k%10;
			k=k/10;
			int b=k%10;
			k=k/10;
			int c=k%10;
			k=k/10;
			int d=k%10;
//			for(int j=0;j<4;j++) {
//				
//			}
			if(a<b&&a<c&&a<d) {
//				a=0;
				ans=(d*100)+(c*10)+b;	
			}else if(b<a&&b<c&&b<d||a==b&&b<c&&b<d) {
				ans=(d*100)+(c*10)+b;	
			}else if(c<a&&c<b&&c<d) {
				ans=(d*100)+(b*10)+a;
			}else if(d<a&&d<b&&d<c) {
				ans=(c*100)+(b*10)+a;
			}else if(a==b&&b==c&&c==d) {
//				ans=()
				ans=(d*100)+(c*10)+b;	
			}else if(a==b&&b<c&&b<d) {
				ans=(d*100)+(c*10)+b;	
			}
			
		}
		
		return ans;
	}

}

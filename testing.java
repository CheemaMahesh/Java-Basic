package lecture7;
import java.util.Scanner;
public class testing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      
		int x=sc.nextInt();
	int i=1,sum;
	int n=1;
	while(n<=x&&n<=1000) {
		sum=(3*i)+2;
		if(sum%4!=0) {
			System.out.print(sum+" ");
			n++;
		}
		i++;
	}
	}}

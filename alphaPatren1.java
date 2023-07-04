//HERE WE ARE PRINTING THE ALPHABETS 

package patrenPrint;
import java.util.Scanner;
public class alphaPatren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int i=1;
int n=s.nextInt();
while(i<=n) {
	int j=1;
while(j<=i) {
	char jdk=(char)('A'+i-1);
	System.out.print(jdk);
	j++;
}
System.out.println();
i++;
}



}}



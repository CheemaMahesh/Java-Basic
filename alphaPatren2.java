//HERE WE ARE PRINTING THE INTRESTING ALPHABETS 

package patrenPrint;
import java.util.Scanner;
public class alphaPatren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n = s.nextInt();
int i = 1;
int h = n ;
while(i <= n ){
    
    int  j = 1 ;
int   Start =  'A'+h-1;    
    while( j<=i ){
    System.out.print((char)(Start));
        j++;
        Start++;
    }
    System.out.println();
   h--;
    i++;
}
}}



package javaRevisionPartOne;
import java.util.Scanner;

public class FahrenheitToCelsiusTable {
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			//   Formula:-°C = (°F - 32) * 5/9
			int S=s.nextInt();
			int E=s.nextInt();
			int W=s.nextInt();
				int k=E/W;
				for(;S<=E;){
					System.out.println(S+" "+((S-32)*5/9));
					S=S+W;	
				}
				}
		}

	




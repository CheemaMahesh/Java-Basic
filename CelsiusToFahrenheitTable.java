package javaRevisionPartOne;
import java.util.Scanner;

public class CelsiusToFahrenheitTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        
	        System.out.print("Enter temperature in Celsius: ");
	        double celsius = s.nextDouble();
	        
	        double fahrenheit = (celsius * 9/5) + 32;
	        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

		
		

	}

}

package lecture9;

public class PREMITIVEandNONpRIMITIVEaRRAYS2 {
	public static void calculate(int a[]) {
		a=new int[7];
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+1;
		}
	}
	public static void print(int input[]) {
		
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
calculate(a);
print(a);

		
		
	}

}

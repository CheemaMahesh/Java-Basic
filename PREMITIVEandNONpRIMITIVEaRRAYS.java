package lecture9;

public class PREMITIVEandNONpRIMITIVEaRRAYS {
	public static void calculate(int a[]) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+1;
		}
	}
	public static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3,4,5};
calculate(a);
print(a);

		
		
	}

}

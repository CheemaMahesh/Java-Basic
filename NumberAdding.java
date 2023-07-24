package addingNumber;
import java.util.Scanner;
public class NumberAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
//int ts;
int bs=s.nextInt();
double hra=(double)(bs*0.50);
double da=(double)(bs*0.20);
double pf=(double)(bs*0.11);
int allow=0;
char a=s.next().charAt(0);
if (a=='A') {
	allow=1700;
}else if(a=='B') {
	allow=1500;
}else {
	allow=1300;
}
double ts=(double)(bs)+hra+da+(double)(allow)-pf;
//ts=bs+(int)(hra)+(int)(da)+allow-(int)(pf);
int p=(int)(ts);
System.out.println(p);
	}

}

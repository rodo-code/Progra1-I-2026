import java.util.Scanner;
public class TerminoFibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1,c=0;
		if(n==0 || n==1) {
			System.out.println(n);
		}
		else {
			for(int i=2;i<=n;i++) {
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println(c);
		}
		sc.close();
	}

}

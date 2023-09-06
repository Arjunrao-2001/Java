import java.util.Scanner;

public class GcdApp 
	{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int m=scan.nextInt();
		int n=scan.nextInt();
		Gcd gcd=new Gcd();
		int res = gcd.findGcd(m, n);
		System.out.println("GCD is "+res);
		
	}
}

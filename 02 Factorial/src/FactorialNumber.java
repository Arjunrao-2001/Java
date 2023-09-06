import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter N");
		int n =scan.nextInt();
		int pro=1;
		
		for(int i=1;i<=n;i++)
		{
			pro=pro*i;
		}
		System.out.println("Factorial is "+pro);
		scan.close();
	}
}

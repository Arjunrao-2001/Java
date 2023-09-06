import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Before swapping "+a+ " and "+b);
		int c;
		c=a;
		a=b;
		b=c;
	
		System.out.println("After swapping "+a+ " and "+b);
		scan.close();
	}
}

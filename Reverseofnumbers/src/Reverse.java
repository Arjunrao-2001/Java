import java.util.Scanner;

public class Reverse 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter value of n");
		int n=scan.nextInt();
		ReverseApp reverseApp=new ReverseApp();
		int rev = reverseApp.reverseNumber(n);
		System.out.println("Reverse of number "+n+" is Palindrome");
		scan.close();
		if(n==rev)
		{
			System.out.println("Entered Number "+n+" is palindrome ");
		}
		else
		{
		System.out.println("Entered Number "+n+" is Not palindrome ");
		}
	}
}

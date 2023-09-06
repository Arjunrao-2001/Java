import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of N");
		int n = scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) 
		{
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
		scan.close();
	}
}

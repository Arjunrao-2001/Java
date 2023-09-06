import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		boolean isPrime=false;
		if (n<2)
		{
			System.out.println("Entered number"+n+" is not prime");
		}
		else
		{
			for(int i=2;i*i<=n;i++)
			{
				if(n%i!=0)
				{
					isPrime=true;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.println("Entered number "+n+" is prime");
			}
			else 
			{
				System.out.println("Entered number"+n+" is not prime");
			}
		}
		scan.close();
	}
}

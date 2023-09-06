import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of n greater than 100");
		int n= scan.nextInt();
		DivisibilityByFive(n);
		scan.close();
}
	public static void DivisibilityByFive(int n)
 	{
 		for(int i=0;i<=n;i++)
 		{
 			if(i%5==0)
 			{
 				System.out.println("Number "+n+" is divisible by 5");
 			}
 		}
 	}
 	
}
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of n greater than 100");
		int n= scan.nextInt();
		DivisibilityByThree(n);
		scan.close();
}
	public static void DivisibilityByThree(int n)
 	{
 		for(int i=0;i<=n;i++)
 		{
 			if(i%3==0)
 			{
 				System.out.println("Number "+n+" is divisible by 3");
 			}
 		}
 	}
}

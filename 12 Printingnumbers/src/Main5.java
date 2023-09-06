import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=Scan.nextInt();
		DivisibleByThreeAndFive(n);
		Scan.close();
	}
	
	public static void DivisibleByThreeAndFive(int n) {
		for(int i=0;i<=n;i++)
		{
			if(i%3==0&&i%5==0)
			{
				System.out.println("Number "+n+" is divisible by 3 and is multiple of 5");
			}
			else
			{
				System.out.println("Number "+n+" is not divisible by 3 and is multiple of 5");
			}
		}
		
	}
}

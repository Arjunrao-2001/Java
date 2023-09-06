import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		float arr[]=new float[7];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Elelments");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter height of player"+i);
			arr[i]=scan.nextFloat();
		}
		System.out.println("Array elements are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}

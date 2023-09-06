import java.util.Scanner;

public class ArraySumapp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in array");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements of the array is " + sum);
		
		scan.close();
	}
}

package Level1;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a value for length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the  elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array elements are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}

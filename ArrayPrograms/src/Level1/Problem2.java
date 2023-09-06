package Level1;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of Array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements for "+arr.length+" ");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("The array elements are ......");
		for(int a:arr)
		{
			System.out.print(a+5+" ");
		}
		scan.close();
	}
}

import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr.length+" Elements to store in array");
		for(int i=0;i<=arr.length-1;i++)
		{
		arr[i]=scan.nextInt();
		}
		System.out.println("Enter target to search in array");
		int key=scan.nextInt();
		Search search=new Search();
		boolean res =search.isPresent(arr, key);
		if(res=true)
		{
			System.out.println("Target is found");
		}
		 else 
		 {
			 System.out.println("Target is not found");
		 }
		scan.close();
	}
}

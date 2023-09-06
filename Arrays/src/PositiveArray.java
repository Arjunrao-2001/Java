import java.util.Iterator;
import java.util.Scanner;

public class PositiveArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter "+arr.length+"elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for (int x : arr) 
		{
			if(int x=0)
			{
				System.out.println(x);
			}
			
		}
		
	}
	
}

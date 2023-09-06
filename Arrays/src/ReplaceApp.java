import java.util.Scanner;

public class ReplaceApp {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter "+ arr.length+ "elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before replacing negative numbers with zero");
		for (int x : arr) {
			System.out.println(x);
		}
		Replace replace=new Replace();
		replace.replaceZero(arr);
		System.out.println("Array elements after replacing negative numbers with zero");
		for (int x : arr) {
			System.out.println(x);
		}
		
		scan.close();
	}
}

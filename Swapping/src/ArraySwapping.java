import java.util.Scanner;

public class ArraySwapping {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+ " elements");

	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("Before swapping");
	for (int i : arr) {
		System.out.println(i+" ");
	}
	System.out.println("Enter indexes to swap");
	int x=scan.nextInt();
	int y=scan.nextInt();
	int help;
	help=arr[x];
	arr[x]=arr[y];
	arr[y]=help;
	System.out.println("After swapping");
	for (int i : arr) {
		System.out.println(i+" ");
	}
	
	scan.close();
}
}

import java.util.Scanner;

public class MergeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array-1 length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr1.length+"elements of array 1 ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter array-2 length");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter "+arr2.length+"elements of array 1 ");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		System.out.println("Array-1 ===> ");
		for (int i : arr1) 
		{
		System.out.println(i+" ");	
		}
		System.out.println("Array-2 ===> ");
		for (int i : arr2) 
		{
		System.out.println(i+" ");	
		}
		Merge merge=new Merge();
		int res[] = merge.mergeArray(arr1, arr2);
		System.out.println("Array-3 ===> ");
		for (int i : res) 
		{
		System.out.println(i+" ");	
		}
		scan.close();
	}
}

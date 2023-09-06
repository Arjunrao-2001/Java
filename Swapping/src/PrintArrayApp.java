import java.util.Scanner;

public class PrintArrayApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array length");
	int arr[]=new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+ " elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		arr[i]=scan.nextInt();
	}
	PrintArray pArray=new PrintArray();
	pArray.arrayPrint(arr);
	scan.close();
}
}


public class PrintArray {
	 public void arrayPrint( int arr[]) 
	 {
		System.out.println("Array Contents in forward direction");
		for (int i:arr)
		 {
			 System.out.println(i+" ");
		 }
		System.out.println();
		System.out.println("Array Contents in reverse direction");
		for (int i=arr.length;i>=0;i--)
		 {
			 System.out.println(arr[i]+" ");
		 }
	 }
}

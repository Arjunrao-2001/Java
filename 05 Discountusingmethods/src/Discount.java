import java.util.Scanner;
   	public class Discount{
   		public static void main(String[] args) 
   		{
   			Scanner scan=new Scanner(System.in);
   			System.out.println("Enter purchase amount");
   			double amount=scan.nextDouble();
   			checkDiscount(amount);
   			scan.close();
   		}
   		
   		
   		public static void checkDiscount(double amount)
   		{ 
   			if(amount>100)
   			{
   				System.out.println("Discount applicable");
   			}
   			else
   			{
   				System.out.println("Discount not applicable");
   			}
   		}
}


    	
    


import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int age =scan.nextInt();
		categorizeAge(age);
		scan.close();
	}
	
	public static void categorizeAge(int age)
	{
	if(age>=0 && age<=12)
	{
		System.out.println("He/she is a child");
	}
	else if (age>=13 && age<=19)
	{
		System.out.println("He/she is a teen");
	}
	else if (age>=20 && age<=59)
	{
		System.out.println("He/she is an adult");
	}
	else
	{
		System.out.println("He/she is a Senior");
	}
}


}
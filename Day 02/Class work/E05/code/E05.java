import java.util.Scanner;
class E05
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter an integer:");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}
}
			
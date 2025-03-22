import java.util.Scanner;
class HW01
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter num1:");
		int n1=sc.nextInt();
		System.out.println("num1="+n1);
		
		System.out.println("Enter num2:");
		int n2=sc.nextInt();
		System.out.println("num2="+n2);
		
		if(n1>n2)
		{
			System.out.println("num1 is the maximum number");
		}
		else
		{
			System.out.println("num2 is the maximum number");
		}
	}
}
			
			
		
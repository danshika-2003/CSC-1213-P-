import java.util.Scanner;
class HW02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int n=sc.nextInt();
		System.out.println("number="+n);
		
		if((n%11==0)&&(n%5==0))
		{
			System.out.println("it is divisible by 11 and 5");
		}
		else
		{
			System.out.println("it is not divisible by 11 and 5");
		}
	}
}
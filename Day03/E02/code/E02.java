import java.util.Scanner;
class E02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("the number is:"+num1);
		int num2=sc.nextInt();
		System.out.println("the number is:"+num2);
		int num3=sc.nextInt();
		System.out.println("the number is:"+num3);
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("maximum number is :"+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("maximum number is:" +num2);
			
		}
		else 
		{
			System.out.println("maximum number is:" +num3);
		}
	}
}

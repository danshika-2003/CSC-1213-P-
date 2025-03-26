import java.util.Scanner;
class E01
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("the number is:"+num);
		
		if(num>0)
		{
			System.out.println("it is positive number");
		}
		else if(num<0)
		{
			System.out.println("it is negative number");
			
		}
		else
		{
			System.out.println("it is zero");
		}
	}
}
			
			
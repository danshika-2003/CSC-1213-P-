import java.util.Scanner;
public class E02
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		char control=' ';
		int sum=0;
		do
		{
			System.out.println("enter the number to find the summation: ");
		    int num=sc.nextInt();
			sum=sum+num;
			System.out.println("do you want to continue:");
			control=sc.next().charAt(0);
		}
		while(control=='Y');
		System.out.println("summation of numbers"+sum);
		
	}
}
			
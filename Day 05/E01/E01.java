import java.util.Scanner;
public class E01
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int array[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the integer:");
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		System.out.println("sum is:"+sum);
	}
}

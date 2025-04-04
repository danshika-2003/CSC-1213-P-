import java.util.Scanner;
public class Ex01
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("the number is:");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=num)
		{
			sum=sum+i;
			i++;
			
		}
		System.out.println("the sum is:"+sum);
	}
}
		
			
	
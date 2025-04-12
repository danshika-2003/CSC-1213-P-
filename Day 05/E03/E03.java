import java.util.Scanner;
public class E03
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int array[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the integer:");
			array[i]=sc.nextInt();
		}
		for(int number:array)
		{
			System.out.println(number+"\t");
		}
		System.out.println( );
		
		
		int min=array[0];
		int max=array[0];
		for(int i=0;i<5;i++)
		{
			
		if(array[i]>max)
		{
			max=array[i];
		}
		if(array[i]<min)
		{
			min=array[i];
		}
		}
		System.out.println("maximum number is:"+max);
		System.out.println("minimum number is:"+min);
		
		
	}
}

import java.util.Scanner;
public class E02
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("enter the integer:");
			array[i]=sc.nextInt();
		}
		for(int number:array)
		{
			System.out.println(number+"\t");
		}
		System.out.println( );
		String days[]= new String[7];
		days[0]="monday";
		days[1]="tuesday";
		days[2]="wednesday";
		days[3]="thursday";
	    days[4]="friday";
		days[5]="saturday";
		days[6]="sunday";
		for(String day:days)
		{
			System.out.println(day+"\t");
		}
		
		
		
		
	}
}
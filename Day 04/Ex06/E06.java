import java.util.Scanner;
class E06
	{
		public static void main(String arg[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.print("enter the size of array:");
			int size=sc.nextInt();
			int numbers[]=new int[size];
			
			for(int i=0;i<size;i++)
			{
				System.out.print("enter the element"+(i+1)+":");
				numbers[i]=sc.nextInt();
			}
			System.out.println();
			System.out.print("elements of the array:");
			for(int number:numbers)
			{
				System.out.print(number+"\t");
			}
		}
	}
	
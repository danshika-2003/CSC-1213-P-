import java.util.Scanner;
class E04
	{
		public static void main(String arg[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.print("enter the size of array:");
			int size=sc.nextInt();
			int number1[]=new int[size];
			
			for(int i=0;i<number1.length;i++)
			{
				System.out.print("enter the element"+(i+1)+":");
				number1[i]=sc.nextInt();
			}
			System.out.print("\nArray elements:");
			for(int i=0;i<number1.length;i++)
			{
				System.out.print(number1[i]+"\t");
			}
			int max=number1[0]=45;
			int min=number1[0]=45;
			int sum=0;
			double average;
			
			for(int i=0;i<number1.length;i++)
			{
				if(number1[i]>max)
				{
					max=number1[i];
				}
				if(number1[i]<min)
				{
					min=number1[i];
				}
				sum +=number1[i];
			}
			average=(double)sum/number1.length;
			System.out.println("\n\nmaximum element: "+max);
			System.out.println("minimum element: "+min);
			System.out.println("summation: "+sum);
			System.out.println("average: "+average);
			System.out.print("\nenter the element you want to search:");
			int searchelement=sc.nextInt();
			boolean found=false;
			
			for(int i=0;i<number1.length;i++)
			{
				if(number1[i]==searchelement)
				{
					System.out.println("element found at position:"+(i+1));
					found=true;
					break;
				}
			}
			if(!found)
			{
				System.out.println("element not found");
			}
			boolean isunique=true;
			for(int i=0;i<number1.length;i++)
			{
				for(int j=0;j<number1.length;j++)
				{
					if(number1[i]==number1[j])
					{
						isunique=false;
						break;
					}
				}
				if(!isunique)
				{
				break;
				}
			}
			if(isunique)
			{
				System.out.println("all elements are unique");
			}
			else
			{
				System.out.println("not unique-duplicate elements exist");
			}
		}
	}
					
import java.util.Scanner;
public class E06
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the raw:");
		int row=sc.nextInt();
		System.out.println("enter the size of the column:");
		int column=sc.nextInt();
		
		int marks[][]=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("enter the integer:");
			    marks[i][j]=sc.nextInt();
			}
		}
			int sum=0;
			int maximum=marks[0][0];
			for(int i=0;i<row;i++)
		     {
			  for(int j=0;j<column;j++)
			   {
				   System.out.print(marks[i][j]+" ");
				   sum=sum+marks[i][j];
				   if(marks[i][j]>maximum)
				   {
					   maximum=marks[i][j];
				   }
			   }
               System.out.println();
			 }
             System.out.println("Total is:"+sum);
			 System.out.println("Maximum is:"+maximum);
	}
}

			 
            			 
			
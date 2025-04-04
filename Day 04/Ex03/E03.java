import java.util.Scanner;
public class E03
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		char control=' ';
		int EvenCounter=0,OddCounter=0;
		int Sumeven=0;
		do
		{
			System.out.println("enter the number to find the summation: ");
		    int num=sc.nextInt();
			if(num%2==0)
				EvenCounter=EvenCounter+1;
			else
				OddCounter=OddCounter+1;
			
			System.out.println("do you want to continue:");
			control=sc.next().charAt(0);
		}
		while(control=='Y'|| control=='y');
		System.out.println("count the even numbers of user has entered is:"+EvenCounter);
		System.out.println("count the odd numbers of user has entered is:"+OddCounter);
	}
}
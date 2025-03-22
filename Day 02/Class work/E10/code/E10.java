import java.util.Scanner;
class E10
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Input the side length of values:");
		double val=sc.nextDouble();
		System.out.printf("Square:%.2f\n",val*val);
		System.out.printf("cube:%2f\n",val*val);
		System.out.printf("Fourth power:%.2f\n",Math.pow(val,4));
	}
}
		
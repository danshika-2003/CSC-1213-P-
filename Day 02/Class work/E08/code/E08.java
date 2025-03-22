public class E08
{
	public static void main(String args[])
	{
		int num=5004;
		
		double doublenum=(double)num;
		System.out.println("The value of "+num+"after converting to double is "+doublenum);
		
		int num1=(int)doublenum;
		System.out.println("The value of "+doublenum+"after converting to int is "+num1);
	}
}
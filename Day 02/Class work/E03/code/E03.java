import java.util.Scanner;
class E03
{
	public static void main(String args[])
	{
		String fname;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your first name:");
		fname=sc.nextLine();
		System.out.println("Enter your last name:");
		String Lname=sc.next();
		System.out.println("Enter your marks:");
		int marks=sc.nextInt();
		
		System.out.println("full name:"+fname+" "+Lname+"\n"+"marks is:"+marks);
	}
}
		
		
		
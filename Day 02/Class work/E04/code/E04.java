import java.util.Scanner;
class E04
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
		
		System.out.println("Enter your Reg no:");
		String regno=sc.next();
		
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter your sex:");
		char sex=sc.next().charAt(0);
		
		System.out.println("Enter your mobile no:");
		long phoneno=sc.nextLong();
		
		System.out.println("Enter your GPA:");
		double gpa=sc.nextDouble();
		
		
		System.out.println("full name:"+fname+" "+Lname+"\n"+"marks is:"+marks+"\n"+"reg no is:"+regno+"\n"+"Age is:"+age+"\n"+"sex is:"+sex+"\n"+"mobile no is:"+phoneno+"\n"+"gpa is:"+gpa);
	}
}
import java.util.Scanner;
class E04
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		System.out.println("the letter is:"+letter);
		switch(letter)
		{
			case 'a':System.out.println("it is vowel");
			       break;
		    case 'e' :System.out.println("it is vowel");
			       break;
			case 'i' :System.out.println("it is vowel");
			       break;
			case 'o' :System.out.println("it is vowel");
			       break;
			case 'u' :System.out.println("it is vowel");
			       break;
			case 'A':System.out.println("it is vowel");
			       break;
		    case 'E' :System.out.println("it is vowel");
			       break;
			case 'I' :System.out.println("it is vowel");
			       break;
			case 'O' :System.out.println("it is vowel");
			       break;
			case 'U' :System.out.println("it is vowel");
			       break;
		   
			default:System.out.println(" not invalid ");
		}
		
	}
}
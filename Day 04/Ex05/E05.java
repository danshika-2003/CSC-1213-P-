class E05
{
	public static void main(String arg[])
	{
		int numbers[]=new int[10];
		numbers[0]=24;
		numbers[1]=24;
		numbers[2]=24;
		numbers[3]=24;
		numbers[4]=24;
		numbers[5]=24;
		numbers[6]=24;
		numbers[7]=24;
		numbers[8]=24;
		numbers[9]=24;
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]+"\t");
		}
		System.out.println("********************************");
		
		int numbers2[]={1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<numbers2.length;i++)
		{
			System.out.println(numbers2[i]+"\t");
		}
		System.out.println("###########################################33");
		String days[]={"monday ","tuesday ","wednesday ","thursday ","friday ","saturday ","sunday "};
		for(String day:days)
		{
			System.out.println(day+"\t");
		}
	}
}

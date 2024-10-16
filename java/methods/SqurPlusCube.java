import java.util.*;
class SqurPlusCube
{
	static int op;
	static//block
	{
		System.out.println("Enter the Number: ");
		Scanner as=new Scanner(System.in);
		System.out.print("Enter the num1 :" );
		int num=as.nextInt();
		int sqr=square(num);
		int cube =cube(num);
		op=sqr+cube;
	}
	public static void main(String[] args) 
	{
		System.out.println(" Hello from main method");
		System.out.println("The output is : " + op);
	}
	public static int square(int num)
	{
		System.out.println("Hello from square()");
		int sqr=num*num;
		return sqr;
	}
	public static int cube(int num)
	{
		System.out.println("Hello from cube()");
		int cube=1;
		for(int i=1; i<=3; i++)
		{
			cube *=num;
		}
		return cube;
	}
}
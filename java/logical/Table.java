import java.util.*;
class Table
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=as.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+ i + "=" +num*i);
		}
	}
}
import java.util.*;
class KrishNumber
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int num=as.nextInt();
		int dup=num;
		int sum=0;
		
		while(num>0)
		{
			int rem=num % 10;
			int fact=1;
			for(int i=1; i<=rem; i++)
			{
				fact *=i;
			}
			sum += fact;
			num /=10;
		}
		System.out.println(sum==dup ? dup + " is Krish Number " : dup + " is not a Krish Number");
		
	}
}
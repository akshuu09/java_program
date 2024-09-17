import java.util.*;
class SumOfDigit
{
	public static void main(String args[])
	{
		Scanner as =new Scanner(System.in);
		System.out.print("Enter the digit : ");
		int num=as.nextInt();
		int sum=0;
		for(int i=num; i>0; i/=10)
		{
			int rem = i%10;
			sum+=rem;
		}
		System.out.print("Sum of digit " + num + "is" +sum);
	}
}
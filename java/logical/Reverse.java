import java.util.*;
class Reverse
{
	public static void main(String args[])
	{
		Scanner as = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = as.nextInt();
		int rev = 0;
		 for(int i= num; i>0; i/=10)
		{
			int rem = i%10;
			rev=rev*10+rem;
		}
		System.out.print(rev);
	}
}
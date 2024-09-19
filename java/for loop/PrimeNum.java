import java.util.*;
class PrimeNum
{
	public static void main(String args[])
	{
		Scanner as=new Scanner (System.in);
		System.out.print("Enter the number :");
		boolean flag=true;
		int num=as.nextInt();
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=false;
					break;
				
			}
		}
		System.out.println((flag) ? (num + "is prime " ):( num + " is not prime "));
	}
}
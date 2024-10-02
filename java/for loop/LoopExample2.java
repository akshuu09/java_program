import java.util.*;
class LoopExample2
{
	public static void main(String args[])
	{
		Scanner as=new Scanner (System.in);
		System.out.print("Enter a number : ");
		int num=as.nextInt();
		int prevPrime=0;
		int nextPrime=0;
		
		// before prime
		for(int i=num-1; i>=2; i--)
		{
			boolean flag=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				prevPrime = i;
				break;
			}
		}
		// after prime
		for(int i=num+1; true; i++)
		{
			boolean flag=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				nextPrime=i;
				break;
			}
		}
		if((num-prevPrime)<(nextPrime-num))
			System.out.print(prevPrime + " " + num);
		else if((num-prevPrime)>(nextPrime-num))
		System.out.print(num + " " + nextPrime);
		else
			System.out.print(prevPrime + " " +num+ " " +nextPrime);
	}
}
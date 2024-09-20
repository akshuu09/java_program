import java.util.*;
class FactorOfNum
{
	public static void main(String args[])
	{
		Scanner as=new Scanner (System.in);
		System.out.print("Enter the number : ");
		int count=0;
		int num=as.nextInt();
		 for(int i=2; i<num; i++)
		{
			if(num % i==0)
			{
				
				System.out.println(i);
			}
		}
		
	}
}
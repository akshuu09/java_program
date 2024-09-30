import java.util.*;
class NeonNumber
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num=as.nextInt();
		int sqr=num*num;
		int sum=0;
		while(sqr>0)
		{
			int rem=sqr%10;
		     sqr/=10;
			 sum+=rem;
		 
		}
		if(sum==num)
		{
			System.out.println("neon number");
		}
		else
			System.out.println("not neon");
		
	}
}

/*  9-->(9*9)81
    8 + 1 =9
	
	9 = 9
	
	*/

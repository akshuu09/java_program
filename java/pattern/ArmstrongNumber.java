import java.util.*;
class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int num=as.nextInt();
		int dup=num;
		int dup1=num;
		int count=0;
		int sum=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		while(dup>0)
		{
			int rem=dup%10;
			int op=1;
			for(int i=1; i<=count; i++)
			{
				op=op*rem;
			}
			sum +=op;
			dup/=10;
		}
		if(dup1==sum)
		{
			System.out.println( dup1 + " is Armstrong Number. ");
		}
		else
			System.out.println(dup1 + " is not Armstrong Number. ");
	}
}

// 153 is a armgstrong number.
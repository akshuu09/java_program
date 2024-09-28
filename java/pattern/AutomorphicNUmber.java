import java.util.*;
class AutomorphicNUmber
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		
		int num=as.nextInt();
		int dup=num;
		int count=0;
		
		while(num>0)
		{
			count++;
			num/=10;       //num=num*num /10
		}
		int div =1;
		for(int i=1; i<=count; i++)
		{
			div = div * 10;
		}
		System.out.println(((dup*dup)%div)==dup ? dup+ "is Automorphic Number " : dup + " is not Automorphic Number ");
	}
}

// 5776
class SpyNumber
{
	public static void main(String args[])
	{
		int num=123;
		int num1=num;
		int sum=0;
		int product=1;
		
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			product*=rem;
			num/=10;
		}
		if(sum==product)
			System.out.println(num1 + " is a spy number ");
		else
			System.out.println(num1 + " is not a spy number ");
	}
}
class TechNumber2
{
	public static void main(String args[])
	{
		int num=2025;
		int num1=num;
		int count=0;
		 while(num>0)
		{
			count++;
			num/=10;
		}
		if(count%2==0)
		{
			int div=1;
			for(int i=1; i<=(count/2); i++)
				div*=10;
			
		int firstHalf=num1/div;
		int secondHalf=num1/div;
		int add=firstHalf+secondHalf;
		int sqr=add*add;
		if(sqr==num1)
			{
				System.out.println("Tech Number");
			}
			else
			{
				System.out.println("Not Tech Number");
			}
		}
		else
		{
			System.out.println("Not Tech Number");
		}
	}
}
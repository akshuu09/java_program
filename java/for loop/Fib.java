class Fib
{
	public static void main(String  ags[])
	{
		int num = 76324985;
		int sum = 0;
		int length=0;
		for(int i=num; i>0; i/=10)
		
			length++;
			if(length%2==0)
				num/=10;
		for(int i = num; i>0; i/=100)
			sum +=(i%10);
		System.out.println(sum);
	}
}
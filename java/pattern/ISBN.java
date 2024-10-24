class ISBN
{
	public static void main(String args[])
	{
		long num=1259060977l;
		long num1=num;
		int pos=1; //1
		long sum=0; //7
		while(num>0) // 1259060977l >0 (true)
		{
			long rem=num%10; // num%10 =>7
			sum+= (rem*pos++); //7*2(3)
			num/=10; // num/10 -> 125906097
		}
		
		System.out.println(( sum%11 ) == 0 ? num1 + " is valid ISBN number" : num1 + " is not a valid ISBN number");
		
	}
}







































































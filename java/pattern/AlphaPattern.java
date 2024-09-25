class AlphaPattern
{
	public static void main(String args[])
	{
		/* 
		abcde
		fghij
		klmno
		pqrst
		*/
		char ch='a';
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
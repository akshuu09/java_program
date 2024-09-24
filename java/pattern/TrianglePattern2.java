class TrianglePattern2
{
	public static void main(String args[])
	{
		/* 
		   * * * * *
		     * * * *
			   * * *
			     * * 
				   *
	*/
	
	//reverse i loop 5 to 1
	for(int i=5; i>=1; i--)
		{
			//loop tp print a space
			for(int j=1; j<=(5-i) ; j++)
				System.out.print("  ");
			
			// loop for printing stars
			for(int j=1; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
	
	}
}
import java.util.*;
class NamePattern
{
	public static void main (String args[])
	{
		System.out.print("Enter a name");
		String name=new Scanner(System.in).next();
		 int len = name.length();
		 for(int i=1; i<=len; i++)
		{
			for(int j=1; j<=len; j++)
			{
				System.out.print(name.charAt(j-1) + " ");
			}
			System.out.println();
		}
	}
}
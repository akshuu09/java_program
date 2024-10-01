import java.util.*;
class SqrtOfNumber
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=as.nextInt();
		int sqrt=0;
		for(int i=1; i<=(num/2); i++)
		{
			int pro=i*i;
			if(pro==num)
			{
				sqrt=i;
				break;
			}
			if(pro>num)
			break;
		}
		if(sqrt!=0)
		System.out.println( num + "perfect sqrt is " + sqrt);
		else
			System.out.println( num + " doesn't hava a perfect sqrt" + sqrt);
	}
}
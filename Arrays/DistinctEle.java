
import java.util.*;
class DistinctEle
{
	public static void main(String[] args) 
	{
		int [] a ={1,2,3,4,5,1,2,3,7,5,8,9,1,2};
		boolean [] b=new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			int cnt = 0;
			for(int j=0; j< a.length; j++)
			{
				if(a[i]==a[j] && b[j]==false)
				{
					cnt++;
					b[j]=true;
				}
				
			}
		
		if(cnt >0
	)
		{
			System.out.println(a[i] + " " + cnt );
		}
		}
	}
}

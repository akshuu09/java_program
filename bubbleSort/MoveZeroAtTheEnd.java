import java.util.*;
class MoveZeroAtTheEnd
{
	public static void main(String[] args) 
	{
	   int a [] = {2,0,4,1,0,3,0};
	   	System.out.println("Original Array:"+Arrays.toString(a));

	   	moveZerosToEnd(a);
	   	System.out.println("Arrays after moving zeros at the end :"+ Arrays.toString(a));
	}

	public static void moveZerosToEnd(int [] a)
	{
		int n=a.length;
		int lastInd=0;
		for (int i=0; i<n; i++ ) 
		{
			if (a[i]!=0) 
			{
			 int temp=a[i];
			 a[i]=a[lastInd];
			 a[lastInd]=temp;
			 lastInd++;
			}
		}
	}
}
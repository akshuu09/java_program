import java.util.*;
class ReverseArray
{
	public static void main(String[] args) 
	{
	   int [] a={1,2,3,4,5,6,7,8};
	   System.out.println(Arrays.toString(a));
	   int len=a.length;
	   for(int k=1,i=0,j=len-1;k<=(len/2);k++,i++,j--)	
	   {
	   	int temp=a[j];
	   	a[j]=a[i];
	   	a[i]=temp;
	   	System.out.println(k+""+Arrays.toString(a));
	   }
	   System.out.println(Arrays.toString(a));
	}
}
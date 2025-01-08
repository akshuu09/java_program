import java.util.*;
class StoreTheElement
{
	public static void main(String[] args) 
	{
	   int [] arr = {10,11,23,43,56,87,24,98,34};
	   System.out.println(Arrays.toString(arr));
	   int evenCnt =0;
	   int oddCnt=0;
	   for(int i:arr)
	   if(i%2==0)
	     evenCnt++;
	   else
	     oddCnt++;
	   int [] evenArr = new int[evenCnt];
	   int [] oddArr = new int[oddCnt];

	   for(int i=0, ei=0,oi=0; i<arr.length; i++)
	     int ele = arr[i];
	         if(ele %2==0)
	           evenArr[ei++]=ele;
	         else
	           oddArr[oi++]=ele;	
	  System.out.println(evenArr);
	  System.out.println(oddArr);
	}
}
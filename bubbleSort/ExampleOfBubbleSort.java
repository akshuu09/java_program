import java.util.*;
class ExampleOfBubbleSort
{
	public static void main(String[] args)
	{
		int [] arr ={5,4,6,3,7,2,8};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int [] arr,int len)
	{
		for (int i=1; i<len ;i++ )
		{
		   for (int j=i+1; i<len ;j++ ) 
		   {
		     if(arr[i]>arr[j])
		     {
		     	int temp =arr[i];
		     	arr[i]=arr[j];
		     	arr[j]=temp;
		     }		
		   }	
		   System.out.println(i + " : " + Arrays.toString(arr));
		}
	}
}
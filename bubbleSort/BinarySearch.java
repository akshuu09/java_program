import java.util.*;
class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[20];
		for(int i=1; i<=20; i++)
			arr[i-1]=i;
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the value you shoud target : ");
		int target=sc.nextInt();
		System.out.println(binarySearch(arr,target));
	}
	public static int binarySearch(int [] arr,int target)
	{
		int min=0;
		int max=arr.length-1;
		while(min<=max)
		{
			int mid=min-(max+min)/2;
			if(target>arr[mid])
				min=mid+1;
			else if (target<arr[mid]) 
				max=mid-1;
			else
				return mid;
				
		}
		return -1;
	}
}
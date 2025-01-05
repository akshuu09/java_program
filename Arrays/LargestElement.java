import java.util.*;
class LargestElement
{
	public static void main(String[] args)
	 {
		int [] arr = {1,3,5,7,9,2,4,6,8};
		System.out.println(Arrays.toString(arr));
        System.out.println("LargestElement : " + findLargest(arr));
	}
	public static int findLargest(int [] arr)
	{
		int largest = Integer.MIN_VALUE;
		for(int ele:arr)
			if(largest < ele)
				largest=ele;
			return largest;
	}
}
import java.util.*;
class SumOfElements
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		int op=sumOfElements(arr);
		System.out.println("Sum of elements is " + op);
	}
	public static int sumOfElements(int [] arr)
	{
		int sum=0;
		for(int i:arr)
			sum+=i;
		return sum;
	}
}
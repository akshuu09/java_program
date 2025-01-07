import java.util.*;
class ProductOfElement
{
	public static void main(String[] args) 
	{
		int [] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(arr));
		int op=proOfElements(arr);
		System.out.println("Sum of elements is " + op);
	}
	public static int proOfElements(int [] arr)
	{
		int pro=1;
		for(int i:arr)
			pro *=i;
		return pro;
	}
}
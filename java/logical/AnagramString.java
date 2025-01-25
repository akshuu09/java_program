import java.util.*;
class AnagramString
{
	public static void main(String[] args) 
	{
		String str="hello";
		String str1="helloworld";
		

	
		if(str.length()!=str1.length())
		{ 
			System.out.println("it is not anagram");
			return ;
		}

		char[] arr1=str.toCharArray();
		char[]  arr2=str1.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag=true;
		for (int i=0; i<str1.length() ;i++ ) 
		{
		   if(!(arr1[i]==arr2[i]))	
		}
	}
}
import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner as=new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name=as.next();
		int len =name.length();
		String rev = "";
		
		for(int i=0; i<len; i++)
		{
			char  ch = name.charAt(i);
			rev = ch + rev;
		}
		System.out.println(rev.equals(name)? name+"is palindrome" : name + "is not palindrome");
	}
}
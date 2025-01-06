class PalindromeArray 
{
	public static void main(String[] args) 
	{
		String[] strings = {"ramesh","hello","nitin","suresh","121","naman","madam"};
		for(String ele:strings)
		{
			if(isPalindrome(ele+""))
				System.out.println(ele+" ");
		}
	}
	public static boolean isPalindrome(String str)
	{
		//return (str.contentEquals(new StringBuffer(str).reverse()))? true :false;
		String rev = "";
		for(int i=0; i<str.length(); i++)
			rev = str.charAt(i)+rev;
		return str.equals(rev)?true:false;
	}
}
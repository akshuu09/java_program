import java.util.*;
class LengthExample1
{
  public static void main(String[] args) 
  {
  	Scanner as=new Scanner(System.in);
  	int [] arr = new int [5];
  	System.out.println(Arrays.toString(arr));
  	for(int i=0; i<arr.length;i++)
  	{
  		System.out.println("Enter the "+ (i+1) +"element");
  		arr[i] = as.nextInt();
  	}
  	System.out.println();
  	System.out.println(Arrays.toString(arr));
  }
}
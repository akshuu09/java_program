import java.util.*;
class AntiClockWiseArray
{
	public static void main(String[] args) 
	{

		int [] a={1,2,3,4,5,6};
		System.out.println(Arrays.toString(a));
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Rotation you want : " ); */
		int rotation= 5 ;  //scanner.nextInt();
	

		for(int i=1; i<=rotation;i++)
		{
			int temp=a[a.length-1];
			for (int j=a.length-2;j>=0 ;j-- ) 
			{
			  a[j+1]=a[j];

			}
			a[0]=temp;
			System.out.println(i+""+Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}
}
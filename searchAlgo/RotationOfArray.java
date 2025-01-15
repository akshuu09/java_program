import java.util.*;
class RotationOfArray
{
	public static void main(String[] args) 
	{
		//Scanner scanner=new Scanner(System.in);
		int rot=2;
		//scanner.nextInt();
		System.out.println("Enter the Rotation");
		int [] arr ={1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		for(int i=1; i<=rot;i++)
		{
			int temp =arr[0];
			for (int j=1;j<arr.length ;j++ ) 
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
			System.out.println(i+" "+Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
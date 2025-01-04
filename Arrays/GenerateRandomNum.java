import java.util.*; 
class GenerateRandomNum
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int len = sc.nextInt();
		int [] arr = new int [len];
		System.out.println(Arrays.toString(arr));
		generateRandomNum();
		for(int i = 0; i<len;i++)
		{
			arr[i] = generateRandomNum();
		}
		System.out.println(Arrays.toString(arr));
	}
	public static int generateRandomNum()
	{
		for(;;)
		{
			int num = (int)(Math.random()*100);
			if(num>0 && num >9)
				return num;
		}
	}
}
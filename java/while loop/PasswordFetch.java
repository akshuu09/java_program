import java.util.*;
class PasswordFetch
{
	public static void main(String args[]) throws InterruptedException
	{
		Scanner as=new Scanner(System.in);
		int pin1 = 1234;
		int duration = 2000;
		outerLoop:
			for(; ;)
		{
			int attempt = 3;
			 do
			 {
				 System.out.println();
				 System.out.print("Enter your pin :");
				 int pin2 = as.nextInt();
				 System.out.println();
				 
				 if(pin1==pin2)
				 {
					System.out.println("PHONE UNLOCKED");
					break outerLoop;
				 }
				 System.out.println("Wrong pin entered");
				 System.out.println("You have" +(attempt-1)+ "attempt left");
				 attempt--;
			 }
			 while (attempt>0);
			 System.out.println("Your phone has been locked for" +(duration)/1000 + "seconds");
			 Thread.sleep(duration);
			 duration*=2;
		}
		
		
	}
}
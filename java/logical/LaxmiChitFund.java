import java.util.*;
class LaxmiChitFund
{
	static String username;
	static long mobile;
	static String pan;
	static long adhar;
	static String address;
	static  int pin;
	static double bal;
	final static long accountnumber=123123123123l;
	final static String ifscCode="LCF1234";
	static ArrayList<String> statement = new ArrayList<>();
  public static void main(String args[])
  {
     welcome();
  }

  public static void welcome()
  {
  	for(; ;)
  	{
  		Scanner sc = new Scanner(System.in);
  		System.out.println();
  		System.out.println("             ***** welcome *****");
  		System.out.println("                    LAXMI CHIT FUND         ");
  		System.out.println();
  		System.out.println("1.Exsisting User");
  		System.out.println("2. create Bank Account");
  		System.out.println();
  		System.out.println("Enter an option : ");
  		int opt = sc.nextInt();
  		switch(opt)
  		{
  		case 1:login(sc);
  			break;
  		case 2:createAccount(sc);
  			break;
  		default:System.out.println("Wrong option entered");
  		}
  	}
  }

  public static void login(Scanner sc)
  {
  	if(username!=null)
  	{
  		for(int i=1; i<=3; i++)
  		{
  			System.out.println();
  			System.out.println("     **** LOGIN MODULE ****");
  			System.out.println();
  			System.out.println("Mobile : ");
  			long mobile1=sc.nextLong();
  			System.out.println("Pin : ");
  			int pin1 = sc.nextInt();
  			if((mobile==mobile1)&&(pin==pin1))
  			{
  				homePage(sc);
  			}
  			else
  			{
  				System.out.println();
  				System.out.println("Wrong Credentials entered");
  				System.out.println();
  			}
  		}
  		System.exit(0);
  	}
  	else{
  		System.out.println();
  		System.out.println("Create your Account first");
  		System.out.println();
  	}
  }

  public static void createAccount(Scanner sc)
  {
  	System.out.println();
  	System.out.println("   ***** Account Creation module *****");
  	System.out.println();
  	System.out.println("Username : ");
  	sc.nextLine();
  	username=sc.nextLine();
  	System.out.println("Mobile : ");
  	mobile = sc.nextLong();
  	System.out.println("Adhar : ");
  	adhar=sc.nextLong();
  	System.out.println("pancard : ");
  	pan = sc.next();
  	System.out.println("Address : ");
  	sc.nextLine();
  	address = sc.nextLine();
  	System.out.println("Enter the amount to deposit : ");
  	bal=sc.nextDouble();
  	statement.add("deposit : "+ bal);

  	System.out.println();
  	System.out.println("Account Created Successfully");
  	System.out.println();
  }

  public static void homePage(Scanner sc)
  {
  	for(; ;)
  	{
  		System.out.println();
  		System.out.println("   ****** HOME PAGE MODULE ******");
  		System.out.println();
  		System.out.println("1. Deposit Amount");
  		System.out.println("2. withdraw Amount");
  		System.out.println("3. Check Balance");
  		System.out.println("4. Statement");
  		System.out.println("5. Edit profile");
  		System.out.println("6. Logout");
  		System.out.println();
  		System.out.println("Enter an option");
  		int option = sc.nextInt();
  		System.out.println();
  		switch(option)
  		{
  		case 1: deposit(sc);
  			break;
  		case 2: withdraw(sc);
  			break;
  		case 3: checkBalance(sc);
  			break;
  		case 4: statement();
  			break;
  		case 5: editProfile(sc);
  			break;
  		case 6: System.exit(0);
  		default: System.out.println("Wrong option entered");
  		}
  	}
  }

  public static void deposit(Scanner sc)
  {
  	System.out.println(" *****Deposit Amount *****");
  	System.out.println();
  	System.out.println("Enter the amount");
  	double depositAmount = sc.nextDouble();
  	bal += depositAmount;
  	statement.add("Deposit : "+ depositAmount);
  	System.out.println();
  	System.out.println("Amount Deposited Successfully");
  }

  public static void withdraw(Scanner sc)
  {
  	for(int i=1; i<=3; i++)
  	{
  		System.out.println("******* Withdraw Amount*******");
  		System.out.println();
  		System.out.println("Enter the amount : ");
  		double withdrawAmount = sc.nextDouble();
  		System.out.println("Enter your pin : ");
  		int pin1= sc.nextInt();
  		if(pin==pin1)
      {
         if(withdrawAmount<=bal)
         {
            bal-=withdrawAmount;
            statement.add("withdraw :" + withdrawAmount);
            System.out.println("Amount debited Successfully");
         }
         else{
            System.out.println("Insufficients Funds");
         }
         return;
      }
      else{
         System.out.println();
         System.out.println("Wrong pin Entered");
      }
  	}
   System.out.println();
   System.out.println("Your Account has been deactivated for 24 hours");
   System.exit(0);
  }

  public static void statement()
  {
   System.out.println("*******Statement********");
   System.out.println();
   for(String tran : statement)
   {
      System.out.println(tran);
   }
  }

  public static void editProfile(Scanner sc)
  {
   System.out.println("**Edit Profile");
  }
}
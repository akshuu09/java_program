import java .util.*;
class Restraurant
{
	static String username;
	static String password;//null
	static String phone;//null
	static ArrayList<String> cart = new ArrayList<>();
	static double bill;//0.0
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		for(; ;)
		{
			System.out.println();
			System.out.println("    ***** WELCOME TO ATITHI *****");
			System.out.println();
			System.out.println("1. Sign In");
			System.out.println("2. Sign Up");
			System.out.println();
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			switch(option)
			{
			 case 1: createAccount(sc);
			 	break;
			 case 2: login(sc);
			 	break;
			 default :
			 	System.out.println("Wrong Option Entered");
			}
		}
	}

	public static void createAccount(Scanner sc)
	{
		System.out.println();
		System.out.println("Create Account");
		System.out.println();
		System.out.print("Username : ");
		sc.nextLine();
		username = sc.nextLine();
		System.out.print("Password : ");
		password = sc.next();
		System.out.print("Contact Number : ");
		phone = sc.next();
		System.out.println();
		System.out.println("Account Created ");
		System.out.println();
	}

	public static void login(Scanner sc)
	{
		if(username!=null)
		{
			for(int i=1; i<=3; i++)
			{
				System.out.println(" ");
				System.out.println("Login Page");
				System.out.println();
				System.out.print("Username/Contact : ");
				sc.nextLine();
				String un1 = sc.nextLine();
				System.out.print("Password : ");
				String pass1 = sc.next();

				if(((un1.equals(username)) || (un1.equals(phone))) && (pass1.equals(password)))
				{
					homePage(sc);
				}
				else
				{
					System.out.println();
					System.out.println("Wrong Credentials Entered");
					System.out.println();
				}
			}
			System.exit(0);
		}
		else{
			System.out.println("Create Your Account First");
		}
	}

	public static  void homePage(Scanner sc)
	{
		for(; ;)
		{
			System.out.println();
			System.out.println("HOME PAGE");
			System.out.println();
			System.out.println("1.VEG MENU");
			System.out.println("2.NON-VEG MENU");
			System.out.println("3.Checkout");
			System.out.println("4.Logout");
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			switch(option)
			{
			case 1: vegMenu(sc);
				break;
			case 2: nonVegMenu(sc);
				break;
			case 3: checkout(sc);
				break;
			case 4: System.exit(0);
			System.out.println("YOU ARE NOT ORDERED ANYTHING");
			break;
			default:
			System.out.println("Wrong option");
			break; 
			}
		}
	}

	public static void vegMenu(Scanner sc)
	{
		for(; ;)
		{
			System.out.println();
			System.out.println("VEG DISHES");
			System.out.println("101. Panner Tikka : 200");
			System.out.println("102. Kaju Curry : 300");
			System.out.println("103. Veg Maratha : 350");
			System.out.println("104. Dal Tadka : 200");
			System.out.println("105. Veg Biryani : 400");
			System.out.println("106. MENU");
			System.out.println();
			System.out.println("Enter a Dish Id");
			int id = sc.nextInt();
			switch(id)
			{
			case 101:cart.add("PannerTikka : 200");
				bill +=200;
				System.out.println("Panner Tikka Added inside the cart");
				break;
			case 102:cart.add("KajuCurry : 300");
				bill +=300;
				System.out.println("Kaju Curry Added inside the cart");
				break;
			case 103:cart.add("VegMaratha : 350");
				bill +=350;
				System.out.println("Veg Maratha Added inside the cart");
				break;
			case 104:cart.add("DalTadka : 200");
				bill +=200;
				System.out.println("Dal Tadka Added inside the cart");
				break;
			case 105:cart.add("VegBiryani : 400");
				bill +=400;
				System.out.println("Veg Biryani Added inside the cart");
				break;
			case 106: return;
			default:
				System.out.println("wrong Dish Id");
			}

		}

	}
	public static void nonVegMenu(Scanner sc)
	{
		for(; ;)
		{
			System.out.println();
			System.out.println("NON-VEG DISHES");
			System.out.println("107. Chicken Tikka : 200");
			System.out.println("108. Chicken Curry : 300");
			System.out.println("109. Fish Fry : 350");
			System.out.println("110. Fish Curry : 200");
			System.out.println("111. Chicken Biryani : 400");
			System.out.println("106. MENU");
			System.out.println();
			System.out.println("Enter a Dish Id");
			int id = sc.nextInt();
			switch(id)
			{
			case 107:cart.add("ChickenTikka : 200");
				bill +=200;
				System.out.println("Chicken Tikka Added inside the cart");
				break;
			case 108:cart.add("ChickenCurry: 300");
				bill +=300;
				System.out.println("Chicken Curry Added inside the cart");
				break;
			case 109:cart.add("FishFry  : 350");
				bill +=350;
				System.out.println("Fish Fry  Added inside the cart");
				break;
			case 110:cart.add("FishCurry : 200");
				bill +=200;
				System.out.println("Fish Curry Added inside the cart");
				break;
			case 111:cart.add("ChickenBiryani : 400");
				bill +=400;
				System.out.println("Chicken Biryani Added inside the cart");
				break;
			case 106: return;
			default:
				System.out.println("wrong Dish Id");
		
			}
		}

	}

	public static void cart(Scanner sc)
	{
		System.out.println("YOU PURCHASED FOOD");
		System.out.println();
		for(String food : cart)
		{
			System.out.println(food);
		}
		System.out.println();
		System.out.println("Your total bill is : "+ bill + "rs");
		System.out.println();
	}

	public static void checkout(Scanner sc)
	{
		System.out.println("CHECKOUT ...");
		cart(sc);
	}
}
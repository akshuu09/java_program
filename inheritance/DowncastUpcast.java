import java.util.*;
class Payment
{
	void checkPaymentMode(Payment obj)
	{
		if(obj instanceof GooglePay)
		{
			GooglePay obj1 = (GooglePay)obj;
			System.out.println(obj1.str);
		}
		else if(obj instanceof PhonePay)
		{
			PhonePay obj1=(PhonePay)obj;
			System.out.println(obj1.str);
		}
		else {
			Paytm obj1 =(Paytm)obj;
			System.out.println(obj1.str);
		}
	}
}
class GooglePay extends Payment{
	String str="GOOGLE PAY";
}
class PhonePay extends Payment{
	String str="PHONE PAY";
}
class Paytm extends Payment{
	String str="PAYTM";
}

class DowncastUpcast
{
	public static void main(String[] args) 
	{
		System.out.println("WELCOME TO PAYMENT MODULE");
		System.out.println("1.Google pay");
		System.out.println("2.Phone pay");
		System.out.println("3.Paytm");
		System.out.println("4.COD");
		System.out.println("Enter an option");
		int opt=new Scanner(System.in).nextInt();
		switch(opt)
		{
		    case 1:
			{
				GooglePay obj1 = new GooglePay();
				obj1.checkPaymentMode(obj1);
				break;
			}
			case 2 :
				{
					PhonePay obj1=new PhonePay();
					obj1.checkPaymentMode(obj1);
					break;
				}
			case 3:
				{
					Paytm obj1 = new Paytm();
					obj1.checkPaymentMode(obj1);
					break;
				}
			case 4:
				{
					System.out.println("COD keep your cash ready");
				}
			default:
				System.out.println("Wrong Option entered");
		}
	}
}
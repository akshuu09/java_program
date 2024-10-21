class NonStatic
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		ArithmaticOperation obj1 = new ArithmaticOperation();
		System.out.println(obj1.addition(10,20));
		System.out.println(obj1.multiplication(10,20));

		LogicalOperation obj2 = new LogicalOperation();
		System.out.println(obj2.and(true,false));
		System.out.println(obj2.or(true,false));
	}
}
class ArithmaticOperation
{
	int addition(int num1, int num2)
	{
		return num1+num2;
	}
	int multiplication(int num1, int num2)
	{
		return num1*num2;
	}
}
class LogicalOperation
{
	boolean and(boolean ip1 , boolean ip2)
	{
		return (ip1&&ip2);
	}
	boolean or(boolean ip1 , boolean ip2)
	{
		return (ip1 || ip2);
	}
}
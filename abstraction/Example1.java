abstract class Parent
{
	abstract void m1();
	void m2()
	{
		System.out.println("m2() from parent");
	}
}
 abstract class Child1 extends Parent
 {
 	abstract void m3();
 }
 class Child2 extends Parent
 {
     void m1()
     {
     	System.out.println("m1() from child2");
     }
 }
class GrandChild1 extends Child1
{
	void m1()
	{
		System.out.println("m1() from GrandChild1");
	}
	void m3()
	{
		System.out.println("m3() from GrandChild1");
	}
}
class GrandChild2 extends Child1
{
	void m1()
	{
		System.out.println("m1() from GrandChild2");
	}
	void m3()
	{
		System.out.println("m3() from GrandChild2");
	}
}
class GrandChild3 extends Child2
{

}

class Example1
{
	public static void main(String[] args) 
	{
		Child1 obj=new GrandChild1();
		obj.m1();
		obj.m2();
		obj.m3();
		Child1 obj2 = new GrandChild2();
		obj2.m2();
		obj2.m3();
		Child2 obj3 = new Child2();
		obj3.m1();

	}
}
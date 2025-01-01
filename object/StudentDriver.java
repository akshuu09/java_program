class Student
{
	String name;
	String nativePlace;
	String education;
	long contactNo;
	int yop;
	double cgpa;
	 void display()
	{
		System.out.println("Name : " + name);
		System.out.println(" NativePlace : " + nativePlace);
		System.out.println(" Education : " + education);
		System.out.println("contactNo : " + contactNo);
		System.out.println("YOP :" + yop);
		System.out.println("CGPA : " + cgpa);
		System.out.println();
	}
}
class StudentDriver
{
	public static void main(String[] args)
	 {
		Student obj = new Student();
		obj.name="Akash";
		obj.nativePlace="Pune";
		obj.education="B.tech";
		obj.contactNo=8725628481l;
		obj.cgpa=9.17;
		obj.yop=2024;
		obj.display();
	}
}
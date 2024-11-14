class Google
{
	String username;
	String password;
	String email;
	String dob;
	String gender;

	Google(String username,String password, String email,String dob,String gender)
	{
		this.username=username;
		this.password=password;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
	}

	void displayGoogle()
	{
		System.out.println("Details of Google ");
		System.out.println("UserName : "+ username);
		System.out.println("Password : " + password);
		System.out.println("Email : " + email);
		System.out.println("Date Of Birth : " + dob);
		System.out.println("Gender : " + gender);
	}
}

class GooglePay extends Google
{
	String upiId;
	long accountNumber;
	long mobile;
	String ifscCode;
	long debitCard;

	GooglePay(String upiId,long accountnumber,long mobile,String ifscCode,long debitCard,
              String username,String password, String email,String dob,String gender)
	{
		super(username,password,email,dob,gender);
		this.upiId=upiId;
		this.accountNumber=accountNumber;
		this.mobile=mobile;
		this.ifscCode=ifscCode;
		this.debitCard=debitCard;
	}

	void displayGooglePay()
	{
		System.out.println("Google PAy");
		System.out.println("UPI ID : " + upiId);
		System.out.println("AccountNumber: " + accountNumber);
		System.out.println("Mobile : " + mobile);
		System.out.println("IFSC Code: " + ifscCode);
		System.out.println("Debit Card: " + debitCard);
	}
} 

class GoogleClassroom extends Google
{
	String name;
	String subject;
	String classroomCode;
	int student;
	String teacherName;

	GoogleClassroom(String name,String subject,String classroomCode,int student,String teacherName,
                     String username,String password, String email,String dob,String gender)
	{
		super(username,password,email,dob,gender);
		this.name=name;
		this.subject=subject;
		this.classroomCode=classroomCode;
		this.student=student;
		this.teacherName=teacherName;
	}

	void displayGoogleClassroom()
	{
		System.out.println("Details of Classroom");
		System.out.println("Name : " + name);
		System.out.println("Subject : " + subject);
		System.out.println("ClassroomCode : " + classroomCode);
		System.out.println("Students : " + student);
		System.out.println("teacherName: " + teacherName);
		

	}
}


class GoogleMeet extends Google
{
	String hostName;
	String meetLink;
	String dataTime;
	int attend;

	GoogleMeet(String hostName,String meetLink,String dataTime,int attend,
                String username,String password, String email,String dob,String gender)
	{
		super(username,password,email,dob,gender);
		this.hostName=hostName;
		this.meetLink=meetLink;
		this.dataTime=dataTime;
		this.attend=attend;
	}

	void displayGoogleMeet()
	{
		System.out.println("Details of Meet");
		System.out.println("HostName : " + hostName);
		System.out.println("MeetLink: " + meetLink);
		System.out.println("Data And Time : " + dataTime);
		System.out.println("attend : " + attend);
	}
}

class GoogleDrive extends Google
{
	double totalStorage;
	double occupiedStorage;
	//double available = totalStorage-occupiedStorage;
	String lastUpdate;
	int files;

	GoogleDrive(double totalStorage,double occupiedStorage,String lastUpdate,int files,
                  String username,String password, String email,String dob,String gender)
	{
		super(username,password,email,dob,gender);
		this.totalStorage=totalStorage;
		this.occupiedStorage=occupiedStorage;
		//this.available=available;
		this.lastUpdate=lastUpdate;
		this.files=files;
	}
	double getAvailableStorage() {
        return totalStorage - occupiedStorage;
    }

	void displayGoogleDrive()
	{
		System.out.println("Details of drive");
		System.out.println("Total Storage : " +totalStorage+"GB");
		System.out.println("Occupied Storage : " +occupiedStorage+"GB");
		System.out.println("Available :" +getAvailableStorage()+"GB");
		System.out.println("Last update :" +lastUpdate);
		System.out.println("Files:"+files);
	}
}

class HierarchicalInheritance
{
	public static void main(String[] args)
	{

//String upiId,long accountnumber,long mobile,String ifscCode,long debitCard,

		GooglePay obj1 = new GooglePay("ABC1234", 123412341234l, 987654321l, "SBI00021", 9876543219L,
                                        "Ramesh Kumar", "ramesh123", "ramesh@gmail.com", "01/10/2000", "male");
        obj1.displayGooglePay();

        GoogleClassroom classroom = new GoogleClassroom("Room1", "Java", "C123", 150, "Suresh Kumar",
                                                        "Ramesh Kumar", "ramesh123", "ramesh@gmail.com", "01/10/2000", "male");
        classroom.displayGoogleClassroom();

        GoogleMeet meet = new GoogleMeet("Mukesh Kumar", "https://meet", "13/11/24 - 10:00 AM", 120,
                                          "Ramesh Kumar", "ramesh123", "ramesh@gmail.com", "01/10/2000", "male");
        meet.displayGoogleMeet();

        GoogleDrive drive = new GoogleDrive(15, 10, "10/10/24", 20, "Ramesh Kumar", "ramesh123", "ramesh@gmail.com", "01/10/2000", "male");
        drive.displayGoogleDrive();

	}
}
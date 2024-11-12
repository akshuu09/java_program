class Country
{
	String name;
	double area;
	long pop;
	int countryCode;
	String capital;
	int states;
	String lang;
	double gdp;
	String president;
	String primeMinister;

	Country(String name,double area,long pop,int countryCode,String capital,int states,String lang,double gdp,
		     String president,String primeMinister)
	{
		this.name=name;
		this.area=area;
		this.pop=pop;
		this.countryCode=countryCode;
		this.capital=capital;
		this.states=states;
		this.lang=lang;
		this.gdp=gdp;
		this.president=president;
		this.primeMinister=primeMinister;
	}

	void displayCountry()
	{
		System.out.println("All About Country :");
		System.out.println("Name of the Country is :"+name);
		System.out.println("Area is "+area);
		System.out.println("Population is "+pop);
		System.out.println("countryCode is :"+countryCode);
		System.out.println("Capital is "+capital);
		System.out.println("States is :"+states);
		System.out.println("Languages are "+lang);
		System.out.println("GDP"+gdp);
		System.out.println("President is :"+president);
		System.out.println("primeMinister: "+primeMinister +"trillion");
	}


}

class State extends Country
{
    String name;
    String cm;
    String capital;
    int pop;
    int districts;
    String lang;

    State(String name, String cm,String capital,int pop,int districts,String lang,
          String cname,double area,long cpop,int countryCode,String ccapital,int states,String clang,double gdp,
		     String president,String primeMinister)
    {
    	super(cname,area,cpop,countryCode,ccapital,states,clang,gdp,president,primeMinister);
   
    	this.name=name;
    	this.cm=cm;
    	this.capital=capital;
    	this.pop=pop;
    	this.districts=districts;
    	this.lang=lang;
    }

    void displayState()
    {
    	System.out.println("Name:"+name);
    	System.out.println("CM"+cm);
    	System.out.println("Capital is"+capital);
    	System.out.println("Population"+pop);
    	System.out.println("Districts"+districts);
    	System.out.println("Lang"+lang);
    }
}
class SingleLevelInheritance
{
	public static void main(String[] args) 
	{
		State obj=new State("MAharastra","Eknath Shinde","Mumbai",12374333,36,"Marathi",
	                      "India",328763,1428627663,91,"Delhi",29,"Hindi",3.889d,"Droupadi Murmu","Narendra Modi");

		obj.displayCountry();
		obj.displayState();
	}

}
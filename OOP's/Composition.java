class Plant
{
    String type; // fruit
    String roots; // storage roots
    String stems; // underground stems
    String leaves; // simple leaf
    Soil soil;

    Plant(String type, String roots,String stems,String leaves,Soil soil)
    {
    this.type=type;
    this.roots=roots;
    this.stems=stems;
    this.leaves=leaves;
    this.soil=soil;
    }
    public void displayPlant()
    {
    	System.out.println("Details of plants : ");
    	System.out.println("type : " + type);
    	System.out.println("roots : "+ roots);
    	System.out.println("stems : "+ stems);
    	System.out.println("leaves : "+ leaves);

    }

}
class Soil
{
	String type;
	String color;
	int organic ;  // soil organic matter -> 3 & 6% 
	String livingOrganisms; // bacteria,ants,earthworms
	String gas; // nitrogen,oxygen,carbon dioxide
	
	Soil(String minerals,int organic,String livingOrganisms,String gas,String water)
	{
		this.type=type;
		this.color=color;
		this.minerals=minerals;
		this.organic=organic;
		this.livingOrganisms=livingOrganisms;
		this.gas=gas;
		
	}
	public void displaySoil()
	{
		System.out.println("Soil Details : ");
		System.out.println("Type : "+ type);
		System.out.println("Color : "+ color);
		System.out.println("Organic :"+ organic);
		System.out.println("LivingOrganism :"+ livingOrganisms);
		System.out.println(" Soil Contains Gas : " + gas);
	}
}
class Composition
{
	public static void main(String[] args) 
	{
		Plant p1=new Plant("fruits","storage roots","underground stems","simple leaf",("chalk","whitish",6,"bacteria","nitrogen"));
		Plant.displayPlant();
		Plant.Soil.displaySoil();
	}
}

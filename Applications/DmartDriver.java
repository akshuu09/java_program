import java.util.*;
class Dmart
{
	String address;
	long contact;
	String email;
	String website;
    ArrayList<Product> productList = new ArrayList<>();
    Cashier cashier ;
    Customer customer;
    Cart cart;
	Dmart(String address,long contact,String email,String website)
	{
		this.address=address;
		this.contact=contact;
		this.email=email;
		this.website=website;
	}
	public void displayDmart()
	{
		System.out.println("Dmart [Address :"+address + "Contact : "+contact + "Email :"+email+ "website : " + website + "]");
		
	}
    public void addProduct(String category,String name,double orgPrice,Barcode barcode)
    {
        Product product = new Product(category,name,orgPrice,barcode);
        productList.add(product);
    }
    public void addCart(String type,double capacity)
    {
        cart = new Cart(type,capacity);
    }
    public void addCashier(String name,String id,long contact,int counterNumber)
    {
        cashier = new Cashier(name,id,contact,counterNumber);
    }
    public void addCustomer(String name, long contact,String paymentMode,String billNo,double totalBill)
    {
        if(cashier !=null && productList.size()!=0)
        {
            customer = new Customer(name,contact,paymentMode,billNo,totalBill);
        }
        else {
            System.out.println("Add cashier and product first");
        }
    }
}
class Product
{
    String category;
    String name;
    double orgPrice;
    Barcode barcode;

    Product(String category,String name,double orgPrice,Barcode barcode)
    {
    	this.category=category;
    	this.name=name;
    	this.orgPrice=orgPrice;
    	this.barcode=barcode;
    }

    public void displayProduct()
    {
    	System.out.println("Barcode [ category : "+category + "Name : "+name+ "original Price : "+orgPrice+"]");
        
    }
    public void addBarcode(String productId,double dmartPrice)
    {
        barcode =new Barcode(productId,dmartPrice);
    }
}
class Barcode
{
    String productId;
    double dmartPrice;

    Barcode(String productId,double dmartPrice)
    {
    	this.productId=productId;
    	this.dmartPrice=dmartPrice;
    }
    public void displayBarcode()
    {
    	System.out.println("Here is the Details Of Barcode [productId : "+",Dmart Price : "+ dmartPrice +"] ");
    }
}
class Customer
{
    String name;
    long contact;
    String paymentMode;
    String billNo;
    double totalBill;
    

    Customer(String name,long contact,String paymentMode,String billNo,double totalBill)
    {

	this.name=name;
    this.contact=contact;
	this.paymentMode=paymentMode;
    this.billNo=billNo;
    this.totalBill=totalBill;
	
    }
    public void displayCustomer()
    {
    	System.out.println("Customer Details [Name : "+name+ ", Contact :" + contact + 
            " paymentMode : " + " Bill No : " + billNo + " Total Bill " + totalBill + "]");
    }
}
class Cashier
{
   String name;
   String id;
   long contact;
   int counterNumber;

   Cashier(String name,String id, long contact,int counterNumber)
   {
   	this.name=name;
   	this.id=id;
   	this.contact=contact;
    this.counterNumber=counterNumber;
   }
    public void displayCashier()
    {
    	System.out.println("Cashier DEtails [ Name :" + name + " ID " + id + " Contact " + contact + " Counter Number : " + counterNumber + "]");
    	
    }
}
class Cart
{
    String type;
    double capacity;
   ArrayList<Product> cart = new ArrayList<>();



    Cart(String type,double capacity)
    {
    	this.type=type;
    	this.capacity=capacity;

    }


     public void displayCart()
     {
        System.out.println("Cart Type :" + type + " Capacity : " + cart.size());
        for(Product i : cart)
        {
            i.displayProduct();
            i.barcode.displayBarcode();
        }
     }
}

class DmartDriver
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);

		Dmart dmart = new Dmart("Deccan", 9876543210l,"dmart@gmail.com","www.dmart.com");
        dmart.displayDmart();
        for(int i=1; i<=5; i++)
        {
            System.out.println("Add Product " + i + ":");
            System.out.println("Enter Category :");
            String category=sc.nextLine();
            System.out.println("Enter Product Name :");
            String name=sc.nextLine();
            System.out.println("Enyter original price :");
            double orgPrice=sc.nextDouble();
            sc.nextLine();
            System.out.println("Barcode ID");
            String productId=sc.nextLine();
            System.out.println("Dmart Price :");
            double dmartPrice=sc.nextDouble();
            sc.nextLine();

            Barcode barcode = new Barcode(productId,dmartPrice);
            dmart.addProduct(category,name,orgPrice,barcode);
        }
        System.out.println("\nProducts in Dmart:");
        for (Product product : dmart.productList) {
            product.displayProduct();
            product.barcode.displayBarcode();
        }

        for(Product i : dmart.productList)
        {
            i.displayProduct();
            i.barcode.displayBarcode();
        }
        dmart.addCashier("ramesh kumar","DCAsh123",9874665244l,2);
        dmart.cashier.displayCashier();
	}
}
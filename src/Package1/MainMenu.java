package Package1;
import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
	
	public static int price;
	public static int quantity;
	Subcatagories sub= new Subcatagories();
	public static int counter=0;
	public static ArrayList<Subcatagories> cart=new ArrayList<Subcatagories>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("<<<<<===============Welcome to the E-Commerce Website===============>>>>>");
		System.out.println("Categories");
		System.out.println("1.Electronics");
		System.out.println("2.Groceries");
		System.out.println("3.Clothing");
		System.out.println("4.Shoes");
		System.out.println("5.Toys");
		System.out.println("6.View Cart");
		System.out.println("7.Quit");
		System.out.println("==========================================================================");
		int ans=scan.nextInt();
		Categories categories=new Categories();
		switch(ans)
		{
			case 1:
			{
				categories.Electronics();
			}
				break;
			case 2:
			{
				categories.Groceries();
			}
				break;
			case 3:
			{
				categories.Clothing();
			}
				break;
			case 4:
			{
				categories.Shoes();
			}
				break;
			case 5:
			{
				categories.Toys();
			}
				break;
			case 6:
				viewcart();
				break;
			case 7:
			{
				System.out.println("Thank you for Shopping with us....");
				System.exit(0);
			}
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
		}
	}
	
    public static void viewcart()
    {
    	try {
    		Scanner scan=new Scanner(System.in);
    		System.out.println("<<<<<===================Cart========================>>>>>");
    		System.out.println("Prod.Code         Name             Price         Quantity");
    		System.out.println("---------------------------------------------------------");
    		for(int i=0;i<cart.size();i++)
    		{
    			Subcatagories s = cart.get(i);
    			System.out.println(s.getProdId()+"           "+s.getName()+"            "+s.getPrice()+"          "+s.getQuantity());
    		}
    		System.out.println("1.Confirm order                   2.Remove Items");
    		int ans=scan.nextInt();
    		if(ans==1)
    		{
    			purchasebillcart(cart);
    		}
    		else
    		{
    			System.out.println("Enter the Product Id of the item to be removed");
    			//cart.remove()
    		}
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
    
    public static void purchasebill(Subcatagories sub)
    {
    	try {
    		System.out.println("<<<<<===================Bill========================>>>>>");
    		System.out.println("Prod.Code         Name             Price         Quantity");
    		System.out.println("---------------------------------------------------------");
    		System.out.println(sub.ProdId+"           "+sub.Name+"             "+sub.Price+"         "+sub.Quantity);
    		System.out.println("Invoice Total :"+sub.Price*sub.Quantity);
    		System.out.println("---------------------------------------------------------");
    		System.out.println("<<<<<=========Thank you for shopping with us========>>>>>");
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }

    public static void purchasebillcart( ArrayList<Subcatagories> cart)
    {
    	int invoicetotal=0;
    	try {
    		System.out.println("<<<<<===================Bill========================>>>>>");
    		System.out.println("Prod.Code         Name             Price         Quantity");
    		System.out.println("---------------------------------------------------------");
    		for(int i=0;i<cart.size();i++)
    		{
    			Subcatagories s = cart.get(i);
    			System.out.println(s.getProdId()+"           "+s.getName()+"            "+s.getPrice()+"          "+s.getQuantity());
    			invoicetotal+=s.getPrice()*s.getQuantity();
    		}
    		System.out.println("Invoice Total :"+invoicetotal);
    		System.out.println("---------------------------------------------------------");
    		System.out.println("<<<<<=========Thank you for shopping with us========>>>>>");
    	}
    	catch(Exception ex)
    	{
    		throw ex;
    	}
    }
}

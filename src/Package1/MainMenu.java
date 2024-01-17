package Package1;
import java.util.Scanner;

public class MainMenu {
	
	public static int price;
	public static int quantity;
	
	//public static 

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

}

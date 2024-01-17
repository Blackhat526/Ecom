package Package1;
import java.io.Console;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
public class Categories {
	
	public static void Electronics()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Electronics");
			System.out.println("1.SmartPhones ");
			System.out.println("2.Laptops ");
			System.out.println("3.Televisions ");
			System.out.println("4.AirConditionaries ");
			System.out.println("5.Refridgerators ");
			System.out.println("6.Main Menu ");
			System.out.println("==========================================================================");
			int ans=scan.nextInt();
			MainMenu menu=new MainMenu();
			Subcatagories sub=new Subcatagories();
			switch(ans)
			{
				case 1:
					sub.Smartphones();
					break;
					
				case 2:
					sub.Laptops();
					break;
					
				case 3:
					sub.Televisions();
					break;
					
				case 4:
					sub.AirConditionaries();
					break;
					
				case 5:
					sub.Refridgerators();
					break;
					
				case 6:
					MainMenu menu1 = new MainMenu();
					menu1.main(null);
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public static void Groceries()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Groceries");
			System.out.println("1.Frozen Food ");
			System.out.println("2.Dry Fruits ");
			System.out.println("3.Fruits ");
			System.out.println("4.Food Grains ");
			System.out.println("5.Vegitables ");
			System.out.println("6.Main Menu ");
			System.out.println("===========================================================");
			MainMenu menu=new MainMenu();
			int ans=scan.nextInt();
			Subcatagories sub=new Subcatagories();
			switch(ans)
			{
				case 1:
					sub.FrozenFood();
					break;
					
				case 2:
					sub.DryFruits();
					break;
					
				case 3:
					sub.Fruits();
					break;
					
				case 4:
					sub.FoodGrains();
					break;
					
				case 5:
					sub.Vegitables();
					break;
					
				case 6:
					menu.main(null);
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex){
			throw ex;
		}
	}

	public static void Clothing()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Clothing");
			System.out.println("1.T-Shits ");
			System.out.println("2.Trousers ");
			System.out.println("3.Shits ");
			System.out.println("4.Formals ");
			System.out.println("5.Shorts ");
			System.out.println("6.Main Menu ");
			System.out.println("===========================================================");
			MainMenu menu=new MainMenu();
			int ans=scan.nextInt();
			Subcatagories sub=new Subcatagories();
			switch(ans)
			{
				case 1:
					sub.TShirts();
					break;
					
				case 2:
					sub.Trousers();
					break;
					
				case 3:
					sub.Shirts();
					break;
					
				case 4:
					sub.Formals();
					break;
					
				case 5:
					sub.Shorts();
					break;
					
				case 6:
					menu.main(null);
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public static void Shoes()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Shoes");
			System.out.println("1.Addidas ");
			System.out.println("2.Nike ");
			System.out.println("3.Puma ");
			System.out.println("4.New Balance ");
			System.out.println("5.Under Armour ");
			System.out.println("6.Main Menu ");
			System.out.println("===========================================================");
			MainMenu menu=new MainMenu();
			int ans=scan.nextInt();
			Subcatagories sub=new Subcatagories();
			switch(ans)
			{
				case 1:
					sub.Addidas();
					break;
					
				case 2:
					sub.Nike();
					break;
					
				case 3:
					sub.Puma();
					break;
					
				case 4:
					sub.NewBalance();
					break;
					
				case 5:
					sub.UnderArmour();
					break;
					
				case 6:
					menu.main(null);
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex){
			throw ex;
		}
	}
	
	public static void Toys()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Toys");
			System.out.println("1.Cycles ");
			System.out.println("2.PS ");
			System.out.println("3.Toy cars ");
			System.out.println("4.Color Pens ");
			System.out.println("5.Drawing Books ");
			System.out.println("6.Main Menu ");
			System.out.println("===========================================================");
			MainMenu menu=new MainMenu();
			int ans=scan.nextInt();
			Subcatagories sub=new Subcatagories();
			switch(ans)
			{
				case 1:
					sub.Cycles();
					break;
					
				case 2:
					sub.PS();
					break;
					
				case 3:
					sub.Toycars();
					break;
					
				case 4:
					sub.ColorPens();
					break;
					
				case 5:
					sub.DrawingBooks();
					break;
					
				case 6:
					menu.main(null);
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex){
			throw ex;
		}
	}

	public static void ViewCart()
	{
		try {
			
		}
		catch(Exception ex){
			throw ex;
		}
	}
}

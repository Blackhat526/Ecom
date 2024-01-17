package Package1;
import java.util.Scanner;
public class Subcatagories {
      
	
	public static void Smartphones()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Smartphones------------------------>>>>");
			System.out.println("Prod.Code       Name               Description                  Price   ");
			System.out.println("************************************************************************");
			System.out.println("101            iPhone 13         Camera 12mp,4000 mah Battery   50,000/-");
			System.out.println("102            Samsung S23       Camera 64mp,5000 mah Battery   70,000/-");
			System.out.println("103            Mi 10 pro         Camera 32mp,3000 mah Battery   20,000/-");
			System.out.println("104            Sony z flip       Camera 40mp,4000 mah Battery   30,000/-");
			System.out.println("105            Google Pixel      Camera 56mp,4400 mah Battery   75,000/-");
			System.out.println("106            Back                                                     ");
			System.out.println("************************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 101:
					System.out.println("Please enter Quantity: ");
					
				break;
				
				case 102:
					break;
					
				case 103:
					break;
					
				case 104:
					break;
					
				case 105:
					break;
					
				case 106:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}

	public static void Laptops()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Laptops------------------------>>>>");
			System.out.println("Prod.Code       Name               Description              Price   ");
			System.out.println("********************************************************************");
			System.out.println("201            Lenovo Thinkpad     Ram 8GB,512GB HDD        40,000/-");
			System.out.println("202            MSI Gaming          Ram 12GB,512GB SSD       60,000/-");
			System.out.println("203            Dell Gaming         Ram 12GB,512GB SSD       70,000/-");
			System.out.println("204            Asus Gaming         Ram 8GB,512GB HDD   	    50,000/-");
			System.out.println("205            Hp Gaming      	   Ram 32GB,1TB SSD         75,000/-");
			System.out.println("206            Back                                                 ");
			System.out.println("********************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 201:
					
				break;
				
				case 202:
					break;
					
				case 203:
					break;
					
				case 204:
					break;
					
				case 205:
					break;
					
				case 206:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	public static void Televisions()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Televisions--------------------->>>>");
			System.out.println("Prod.Code       Name              Description                Price   ");
			System.out.println("*********************************************************************");
			System.out.println("301            Sony Bravia        32 inch LCD Display        40,000/-");
			System.out.println("302            Samsung Smart TV   42 inch LED Display        60,000/-");
			System.out.println("303            LG Smart TV        42 inch LED Display        55,000/-");
			System.out.println("304            OnePlus Smart TV   64 inch Amoled Display   	 70,000/-");
			System.out.println("305            Mi Smart TV        32 inch LCD Display        25,000/-");
			System.out.println("306            Back                                                  ");
			System.out.println("*********************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 301:
					
				break;
				
				case 302:
					break;
					
				case 303:
					break;
					
				case 304:
					break;
					
				case 305:
					break;
					
				case 306:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	public static void AirConditionaries()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------AirConditionaries------------------>>>>");
			System.out.println("Prod.Code      Name               Description             Price   ");
			System.out.println("******************************************************************");
			System.out.println("401            Voltas             Turbo fan               20,000/-");
			System.out.println("402            Onida              Power Cooler            25,000/-");
			System.out.println("403            LG                 Twin Turbo              55,000/-");
			System.out.println("404            Samsung            Premium cooler          60,000/-");
			System.out.println("405            Sony               Twin Turbo Premium      85,000/-");
			System.out.println("406            Back                                               ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 401:
					
				break;
				
				case 402:
					break;
					
				case 403:
					break;
					
				case 404:
					break;
					
				case 405:
					break;
					
				case 406:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}
	
	public static void Refridgerators()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------Refridgerators--------------------->>>>");
			System.out.println("Prod.Code      Name               Description             Price   ");
			System.out.println("******************************************************************");
			System.out.println("501            Voltas             Single door             20,000/-");
			System.out.println("502            Onida              Power Cooler            25,000/-");
			System.out.println("503            LG                 Twin Door               55,000/-");
			System.out.println("504            Samsung            Premium cooler          60,000/-");
			System.out.println("505            Sony               Twin Door freezer       85,000/-");
			System.out.println("506            Back                                               ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 501:
					
				break;
				
				case 502:
					break;
					
				case 503:
					break;
					
				case 504:
					break;
					
				case 505:
					break;
					
				case 506:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}

	public static void DryFruits()
	{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------DryFruits------------------------->>>>");
			System.out.println("Prod.Code      Name               Description             Price  ");
			System.out.println("*****************************************************************");
			System.out.println("601            Cashew             Salted                  250/kg ");
			System.out.println("602            Almonds            Chocolate               200/kg ");
			System.out.println("603            Walnuts            Roasted                 300/kg ");
			System.out.println("604            Pista              American                600/kg ");
			System.out.println("605            Apricots           Sun Dried               400/kg ");
			System.out.println("606            Back                                              ");
			System.out.println("*****************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 601:
					
				break;
				
				case 602:
					break;
					
				case 603:
					break;
					
				case 604:
					break;
					
				case 605:
					break;
					
				case 606:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
	}

    public static void Fruits()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------Fruits----------------------------->>>>");
			System.out.println("Prod.Code      Name               Description             Price   ");
			System.out.println("******************************************************************");
			System.out.println("701            Apples             Kashmiri                   55/kg");
			System.out.println("702            Banannas           Kerala                     20/kg");
			System.out.println("703            Oranges            Nashik                     30/kg");
			System.out.println("704            Mangoes            Alphonso                  150/kg");
			System.out.println("705            Watermellons       Red                        70/kg");
			System.out.println("706            Back                                               ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 701:
					
				break;
				
				case 702:
					break;
					
				case 703:
					break;
					
				case 704:
					break;
					
				case 705:
					break;
					
				case 706:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void FrozenFood()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------FrozenFood------------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price   ");
			System.out.println("******************************************************************");
			System.out.println("801            Fries             McCane                   55/Pack ");
			System.out.println("802            Noodles           Maggie                   20/Pack ");
			System.out.println("803            Mushrooms                                  300/Pack");
			System.out.println("804            BabyCorn                                   150/Pack");
			System.out.println("805            Icecream          Vanilla                   70/Pack");
			System.out.println("806    		   Back												  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 801:
					
				break;
				
				case 802:
					break;
					
				case 803:
					break;
					
				case 804:
					break;
					
				case 805:
					break;
					
				case 806:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void FoodGrains()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------FoodGrains----------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price ");
			System.out.println("****************************************************************");
			System.out.println("901            Rice              Basmati                  55/kg ");
			System.out.println("902            Wheat                                      30/kg ");
			System.out.println("903            Barly                                      30/kg ");
			System.out.println("904            Corn                                       15/kg ");
			System.out.println("905            Ragi                                       30/kg ");
			System.out.println("906 		   Back												");
			System.out.println("****************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 901:
					
				break;
				
				case 902:
					break;
					
				case 903:
					break;
					
				case 904:
					break;
					
				case 905:
					break;
					
				case 906:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
					default: 
						System.out.println("Invalid Input");
						break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Vegitables()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------Vegitables------------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price   ");
			System.out.println("******************************************************************");
			System.out.println("1001           Bringal                                      55/kg ");
			System.out.println("1002           Carrots                                      30/kg ");
			System.out.println("1003           Tomatos                                      30/kg ");
			System.out.println("1004           Potatos                                      15/kg ");
			System.out.println("1005           Onions                                       30/kg ");
			System.out.println("1006 		   Back												  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1001:
					
				break;
				
				case 1002:
					break;
					
				case 1003:
					break;
					
				case 1004:
					break;
					
				case 1005:
					break;
					
				case 1006:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
					default: 
						System.out.println("Invalid Input");
						break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void TShirts()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------T-Shirts--------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price   ");
			System.out.println("******************************************************************");
			System.out.println("1101           Nike              Blue Color                799/-  ");
			System.out.println("1102           Adiddas           Black Color               599/-  ");
			System.out.println("1103           Levis                                      1200/-  ");
			System.out.println("1104           Arrow                                      1299/-  ");
			System.out.println("1105           Flying Machine                             1399/-  ");
			System.out.println("1106 		   Back												  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1101:
					
				break;
				
				case 1102:
					break;
					
				case 1103:
					break;
					
				case 1104:
					break;
					
				case 1105:
					break;
					
				case 1106:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Shirts()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Shirts----------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price   ");
			System.out.println("******************************************************************");
			System.out.println("1201           Nike              Blue Color                799/-  ");
			System.out.println("1202           Adiddas           Black Color               599/-  ");
			System.out.println("1203           Levis                                      1200/-  ");
			System.out.println("1204           Arrow                                      1299/-  ");
			System.out.println("1205           Flying Machine                             1399/-  ");
			System.out.println("1206 		   Back												  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1201:
					
				break;
				
				case 1202:
					break;
					
				case 1203:
					break;
					
				case 1204:
					break;
					
				case 1205:
					break;
					
				case 1206:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Trousers()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Trousers--------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price   ");
			System.out.println("******************************************************************");
			System.out.println("1301           Nike              Blue Color                799/-  ");
			System.out.println("1302           Adiddas           Black Color               599/-  ");
			System.out.println("1303           Levis                                      1200/-  ");
			System.out.println("1304           Arrow                                      1299/-  ");
			System.out.println("1305           Flying Machine                             1399/-  ");
			System.out.println("1306 		   Back 											  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1301:
					
				break;
				
				case 1302:
					break;
					
				case 1303:
					break;
					
				case 1304:
					break;
					
				case 1305:
					break;
					
				case 1306:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Formals()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-------------------------Formals-------------------------->>>>");
			System.out.println("Prod.Code      Name              Description              Price   ");
			System.out.println("******************************************************************");
			System.out.println("1401           Blackberrys       Blue Color                799/-  ");
			System.out.println("1402           Manyavar          Black Color               599/-  ");
			System.out.println("1403           Levis                                      1200/-  ");
			System.out.println("1404           Arrow                                      1299/-  ");
			System.out.println("1405           Flying Machine                             1399/-  ");
			System.out.println("1406 		   Back												  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1401:
					
				break;
				
				case 1402:
					break;
					
				case 1403:
					break;
					
				case 1404:
					break;
					
				case 1405:
					break;
					
				case 1406:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Shorts()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-------------------------Shorts--------------------------->>>>");
			System.out.println("Prod.Code      Name          Description              		Price ");
			System.out.println("******************************************************************");
			System.out.println("1501           Addidas       Blue Color                    799/-  ");
			System.out.println("1502           Nike          Black Color                   599/-  ");
			System.out.println("1503           Puma                                       1200/-  ");
			System.out.println("1504           Umbro                                      1299/-  ");
			System.out.println("1505           Castore       White Color                  1399/-  ");
			System.out.println("1506 		   Back												  ");
			System.out.println("******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1501:
				break;
				
				case 1502:
					break;
					
				case 1503:
					break;
					
				case 1504:
					break;
					
				case 1505:
					break;
					
				case 1506:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }
 
    public static void Addidas()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<----------------------------Addidas----------------------------->>>>");
			System.out.println("Prod.Code      Name               Description                   Price   ");
			System.out.println("************************************************************************");
			System.out.println("1601           Addidas X1         Blue Color                    1799/-  ");
			System.out.println("1602           Addidas Zoom       Black Color                   2599/-  ");
			System.out.println("1603           Addidas Level                                    1200/-  ");
			System.out.println("1604           Addidas Smooth                                   1399/-  ");
			System.out.println("1605           Addidas Running    White Color                   1099/-  ");
			System.out.println("1606 		   Back														");
			System.out.println("************************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1601:
				break;
				
				case 1602:
					break;
					
				case 1603:
					break;
					
				case 1604:
					break;
					
				case 1605:
					break;
					
				case 1606:
					Categories Shoes=new Categories();
					Shoes.Shoes();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Nike()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<----------------------------Nike-------------------------------->>>>");
			System.out.println("Prod.Code      Name              Description                    Price   ");
			System.out.println("************************************************************************");
			System.out.println("1701           Nike X1           Blue Color                     1799/-  ");
			System.out.println("1702           Nike Zoom         Black Color                    2599/-  ");
			System.out.println("1703           Nike Level                                       1200/-  ");
			System.out.println("1704           Nike Smooth                                      1399/-  ");
			System.out.println("1705           Nike Running      White Color                    1099/-  ");
			System.out.println("1706 		   Back														");
			System.out.println("************************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1701:
				break;
				
				case 1702:
					break;
					
				case 1703:
					break;
					
				case 1704:
					break;
					
				case 1705:
					break;
					
				case 1706:
					Categories Shoes=new Categories();
					Shoes.Shoes();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Puma()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Puma------------------------------->>>>");
			System.out.println("Prod.Code      Name              Description                    Price   ");
			System.out.println("************************************************************************");
			System.out.println("1801           Puma X1           Blue Color                     1799/-  ");
			System.out.println("1802           Puma Zoom         Black Color                    2599/-  ");
			System.out.println("1803           Puma Level                                       1200/-  ");
			System.out.println("1804           Puma Smooth                                      1399/-  ");
			System.out.println("1805           Puma Running      White Color                    1099/-  ");
			System.out.println("1806 		   Back														");
			System.out.println("************************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1801:
				break;
				
				case 1802:
					break;
					
				case 1803:
					break;
					
				case 1804:
					break;
					
				case 1805:
					break;
					
				case 1806:
					Categories Shoes=new Categories();
					Shoes.Shoes();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void NewBalance()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-------------------------NewBalance----------------------------->>>>");
			System.out.println("Prod.Code      Name              Description                    Price   ");
			System.out.println("************************************************************************");
			System.out.println("1901           NewBalance X1           Blue Color               1799/-  ");
			System.out.println("1902           NewBalance Zoom         Black Color              2599/-  ");
			System.out.println("1903           NewBalance Level                                 1200/-  ");
			System.out.println("1904           NewBalance Smooth                                1399/-  ");
			System.out.println("1905           NewBalance Running      White Color              1099/-  ");
			System.out.println("1906 		   Back														");
			System.out.println("************************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 1901:
				break;
				
				case 1902:
					break;
					
				case 1903:
					break;
					
				case 1904:
					break;
					
				case 1905:
					break;
					
				case 1906:
					Categories Shoes=new Categories();
					Shoes.Shoes();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void UnderArmour()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------UnderArmour------------------------->>>>");
			System.out.println("Prod.Code      Name                     Description              Price   ");
			System.out.println("*************************************************************************");
			System.out.println("2001           UnderArmour X1           Blue Color               1799/-  ");
			System.out.println("2002           UnderArmour Zoom         Black Color              2599/-  ");
			System.out.println("2003           UnderArmour Level                                 1200/-  ");
			System.out.println("2004           UnderArmour Smooth                                1399/-  ");
			System.out.println("2005           UnderArmour Running      White Color              1099/-  ");
			System.out.println("2006 		   Back														 ");
			System.out.println("*************************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 2001:
				break;
				
				case 2002:
					break;
					
				case 2003:
					break;
					
				case 2004:
					break;
					
				case 2005:
					break;
					
				case 2006:
					Categories Shoes=new Categories();
					Shoes.Shoes();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Cycles()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-------------------------------Cycles------------------------->>>>");
			System.out.println("Prod.Code      Name                 Description              Price    ");
			System.out.println("**********************************************************************");
			System.out.println("2101           Firefox X1           Blue Color               17990/-  ");
			System.out.println("2102           Hercules Zoom        Black Color              25990/-  ");
			System.out.println("2103           Hero Level                                    12000/-  ");
			System.out.println("2104           Trek Smooth                                   13990/-  ");
			System.out.println("2105           Bwin                 White Color              10990/-  ");
			System.out.println("2106 		   Back													  ");
			System.out.println("**********************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 2101:
				break;
				
				case 2102:
					break;
					
				case 2103:
					break;
					
				case 2104:
					break;
					
				case 2105:
					break;
					
				case 2106:
					Categories toys=new Categories();
					toys.Toys();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void PS()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<--------------------------------PS---------------------------->>>>");
			System.out.println("Prod.Code      Name                 Description              Price    ");
			System.out.println("**********************************************************************");
			System.out.println("2201           PS 1                         				 17990/-  ");
			System.out.println("2202           PS 2                         				 25990/-  ");
			System.out.println("2203           PS 3                                     	 12000/-  ");
			System.out.println("2204           PS 4                                   		 13990/-  ");
			System.out.println("2205           PS 5                             			 10990/-  ");
			System.out.println("2206 		   Back													  ");
			System.out.println("**********************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 2201:
				break;
				
				case 2202:
					break;
					
				case 2203:
					break;
					
				case 2204:
					break;
					
				case 2205:
					break;
					
				case 2206:
					Categories toys=new Categories();
					toys.Toys();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void Toycars()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<-----------------------------Toycars------------------------->>>>");
			System.out.println("Prod.Code      Name              Description                 Price   ");
			System.out.println("*********************************************************************");
			System.out.println("2301           Bmw                          				 1799/-  ");
			System.out.println("2302           Audi                          				 2599/-  ");
			System.out.println("2303           Porsche                                       1200/-  ");
			System.out.println("2304           Mercedes                                    	 1399/-  ");
			System.out.println("2305           Honda                              			 1099/-  ");
			System.out.println("2306 		   Back													 ");
			System.out.println("*********************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 2301:
				break;
				
				case 2302:
					break;
					
				case 2303:
					break;
					
				case 2304:
					break;
					
				case 2305:
					break;
					
				case 2306:
					Categories toys=new Categories();
					toys.Toys();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void ColorPens()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<--------------------------- DryFruits---------------------->>>>");
			System.out.println("Prod.Code      Name             Description                  Price ");
			System.out.println("*******************************************************************");
			System.out.println("2401           Fibre Castle                          		 170/- ");
			System.out.println("2402           Apsara                          				 250/- ");
			System.out.println("2403           Natraj                                        120/- ");
			System.out.println("2404           Renoylds                                    	 100/- ");
			System.out.println("2405           Boylds                              			 100/- ");
			System.out.println("2406           Back												   ");
			System.out.println("*******************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 2401:
				break;
				
				case 2402:
					break;
					
				case 2403:
					break;
					
				case 2404:
					break;
					
				case 2405:
					break;
					
				case 2406:
					Categories toys=new Categories();
					toys.Toys();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }

    public static void DrawingBooks()
    {
    	try {
			Scanner scan = new Scanner(System.in);
			System.out.println("<<<<---------------------------DrawingBooks--------------------->>>>");
			System.out.println("Prod.Code      Name            Description                   Price  ");
			System.out.println("********************************************************************");
			System.out.println("2501           Classmate                          			 170/-  ");
			System.out.println("2502           Natraj                          				 250/-  ");
			System.out.println("2503           Apsara                                        120/-  ");
			System.out.println("2504           ITC                                    	     130/-  ");
			System.out.println("2505           Renoylds                              		 100/-  ");
			System.out.println("2506 		   Back													");
			System.out.println("********************************************************************");
			int ans=scan.nextInt();
			switch(ans)
			{
				case 2501:
				break;
				
				case 2502:
					break;
					
				case 2503:
					break;
					
				case 2504:
					break;
					
				case 2505:
					break;
					
				case 2506:
					Categories toys=new Categories();
					toys.Toys();
					break;
					
				default: 
					System.out.println("Invalid Input");
					break;
			}
		}
		catch(Exception ex)
		{
			throw ex;
		}
    }
}

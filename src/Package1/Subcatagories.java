package Package1;
import java.util.Scanner;
public class Subcatagories {
	
	public  int Quantity;
	public  int ProdId;
	public  String Name;
	public  int Price;
	public int SlNo;
	
	public int getSlNo() {
		return SlNo;
	}

	public void setSlNo(int slNo) {
		SlNo = slNo;
	}

	public  int getQuantity() {
		return Quantity;
	}

	public  void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public  int getProdId() {
		return ProdId;
	}

	public  void setProdId(int prodId) {
		ProdId = prodId;
	}

	public  String getName() {
		return Name;
	}

	public  void setName(String name) {
		Name = name;
	}

	public  int getPrice() {
		return Price;
	}

	public  void setPrice(int price) {
		Price = price;
	}

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
					int qty101=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub101=new Subcatagories();
					sub101.ProdId=101;
					sub101.Name="iPhone 13";
					sub101.Quantity=qty101;
					sub101.Price=50000;
					int ans101=scan.nextInt();
					if(ans101==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub101);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub101);
						Smartphones();
					}
					
				break;
				
				case 102:
					System.out.println("Please enter Quantity: ");
					int qty102=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub102=new Subcatagories();
					sub102.ProdId=102;
					sub102.Name="Samsung S23";
					sub102.Quantity=qty102;
					sub102.Price=70000;
					int ans102=scan.nextInt();
					if(ans102==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub102);
						
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub102);
						
						Smartphones();
					}
					break;
					
				case 103:
					System.out.println("Please enter Quantity: ");
					int qty103=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub103=new Subcatagories();
					sub103.ProdId=103;
					sub103.Name="Mi 10 pro";
					sub103.Quantity=qty103;
					sub103.Price=20000;
					int ans103=scan.nextInt();
					if(ans103==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub103);
						
					}
					else
					{
						//Add to cart;
						MainMenu.cart.add(sub103);
						//MainMenu.counter++;
						Smartphones();
					}
					break;
					
				case 104:
					System.out.println("Please enter Quantity: ");
					int qty104=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub104=new Subcatagories();
					sub104.ProdId=104;
					sub104.Name="Sony z flip";
					sub104.Quantity=qty104;
					sub104.Price=30000;
					int ans104=scan.nextInt();
					if(ans104==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub104);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub104);
						Smartphones();
					}
					break;
					
				case 105:
					System.out.println("Please enter Quantity: ");
					int qty105=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub105=new Subcatagories();
					sub105.ProdId=105;
					sub105.Name="Google Pixel";
					sub105.Quantity=qty105;
					sub105.Price=75000;
					int ans105=scan.nextInt();
					if(ans105==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub105);
					}
					else
					{
						//Add to cart;
						MainMenu.counter++;
						MainMenu.cart.add(sub105);
						Smartphones();
					}
					break;
					
				case 106:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Smartphones();
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
					System.out.println("Please enter Quantity: ");
					int qty201=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub201=new Subcatagories();
					sub201.ProdId=201;
					sub201.Name="Lenovo Thinkpad";
					sub201.Quantity=qty201;
					sub201.Price=40000;
					int ans201=scan.nextInt();
					if(ans201==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub201);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub201);
						Laptops();
					}
				break;
				
				case 202:
					System.out.println("Please enter Quantity: ");
					int qty202=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub202=new Subcatagories();
					sub202.ProdId=202;
					sub202.Name="MSI Gaming";
					sub202.Quantity=qty202;
					sub202.Price=60000;
					int ans202=scan.nextInt();
					if(ans202==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub202);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub202);
						Laptops();
					}
					break;
					
				case 203:
					System.out.println("Please enter Quantity: ");
					int qty203=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub203=new Subcatagories();
					sub203.ProdId=203;
					sub203.Name="Dell Gaming";
					sub203.Quantity=qty203;
					sub203.Price=70000;
					int ans203=scan.nextInt();
					if(ans203==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub203);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub203);
						Laptops();
					}
					break;
					
				case 204:
					System.out.println("Please enter Quantity: ");
					int qty204=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub204=new Subcatagories();
					sub204.ProdId=204;
					sub204.Name="Asus Gaming";
					sub204.Quantity=qty204;
					sub204.Price=50000;
					int ans204=scan.nextInt();
					if(ans204==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub204);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub204);
						Laptops();
					}
					break;
					
				case 205:
					System.out.println("Please enter Quantity: ");
					int qty205=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub205=new Subcatagories();
					sub205.ProdId=205;
					sub205.Name="Hp Gaming";
					sub205.Quantity=qty205;
					sub205.Price=75000;
					int ans205=scan.nextInt();
					if(ans205==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub205);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub205);
						Laptops();
					}
					break;
					
				case 206:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Laptops();
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
					System.out.println("Please enter Quantity: ");
					int qty301=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub301=new Subcatagories();
					sub301.ProdId=301;
					sub301.Name="Sony Bravia";
					sub301.Quantity=qty301;
					sub301.Price=40000;
					int ans301=scan.nextInt();
					if(ans301==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub301);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub301);
						Televisions();
					}
				break;
				
				case 302:
					System.out.println("Please enter Quantity: ");
					int qty302=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub302=new Subcatagories();
					sub302.ProdId=302;
					sub302.Name="Samsung Smart TV";
					sub302.Quantity=qty302;
					sub302.Price=60000;
					int ans302=scan.nextInt();
					if(ans302==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub302);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub302);
						Televisions();
					}
					break;
					
				case 303:
					System.out.println("Please enter Quantity: ");
					int qty303=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub303=new Subcatagories();
					sub303.ProdId=303;
					sub303.Name="LG Smart TV";
					sub303.Quantity=qty303;
					sub303.Price=55000;
					int ans303=scan.nextInt();
					if(ans303==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub303);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub303);
						Televisions();
					}
					break;
					
				case 304:
					System.out.println("Please enter Quantity: ");
					int qty304=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub304=new Subcatagories();
					sub304.ProdId=304;
					sub304.Name="OnePlus Smart TV";
					sub304.Quantity=qty304;
					sub304.Price=70000;
					int ans304=scan.nextInt();
					if(ans304==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub304);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub304);
						Televisions();
					}
					break;
					
				case 305:
					System.out.println("Please enter Quantity: ");
					int qty305=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub305=new Subcatagories();
					sub305.ProdId=305;
					sub305.Name="Mi Smart TV ";
					sub305.Quantity=qty305;
					sub305.Price=25000;
					int ans305=scan.nextInt();
					if(ans305==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub305);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub305);
						Televisions();
					}
					break;
					
				case 306:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Televisions();
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
					System.out.println("Please enter Quantity: ");
					int qty401=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub401=new Subcatagories();
					sub401.ProdId=401;
					sub401.Name="Voltas";
					sub401.Quantity=qty401;
					sub401.Price=20000;
					int ans401=scan.nextInt();
					if(ans401==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub401);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub401);
						AirConditionaries();
					}
				break;
				
				case 402:
					System.out.println("Please enter Quantity: ");
					int qty402=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub402=new Subcatagories();
					sub402.ProdId=402;
					sub402.Name="Onida";
					sub402.Quantity=qty402;
					sub402.Price=25000;
					int ans402=scan.nextInt();
					if(ans402==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub402);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub402);
						AirConditionaries();
					}
					break;
					
				case 403:
					System.out.println("Please enter Quantity: ");
					int qty403=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub403=new Subcatagories();
					sub403.ProdId=403;
					sub403.Name="LG";
					sub403.Quantity=qty403;
					sub403.Price=55000;
					int ans403=scan.nextInt();
					if(ans403==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub403);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub403);
						AirConditionaries();
					}
					break;
					
				case 404:
					System.out.println("Please enter Quantity: ");
					int qty404=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub404=new Subcatagories();
					sub404.ProdId=404;
					sub404.Name="Samsung";
					sub404.Quantity=qty404;
					sub404.Price=60000;
					int ans404=scan.nextInt();
					if(ans404==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub404);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub404);
						AirConditionaries();
					}
					break;
					
				case 405:
					System.out.println("Please enter Quantity: ");
					int qty405=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub405=new Subcatagories();
					sub405.ProdId=405;
					sub405.Name="Sony";
					sub405.Quantity=qty405;
					sub405.Price=85000;
					int ans405=scan.nextInt();
					if(ans405==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub405);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub405);
						AirConditionaries();
					}
					break;
					
				case 406:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					AirConditionaries();
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
					System.out.println("Please enter Quantity: ");
					int qty501=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub501=new Subcatagories();
					sub501.ProdId=501;
					sub501.Name="Voltas";
					sub501.Quantity=qty501;
					sub501.Price=20000;
					int ans501=scan.nextInt();
					if(ans501==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub501);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub501);
						Refridgerators();
					}
				break;
				
				case 502:
					System.out.println("Please enter Quantity: ");
					int qty502=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub502=new Subcatagories();
					sub502.ProdId=502;
					sub502.Name="Onida";
					sub502.Quantity=qty502;
					sub502.Price=25000;
					int ans502=scan.nextInt();
					if(ans502==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub502);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub502);
						Refridgerators();
					}
					break;
					
				case 503:
					System.out.println("Please enter Quantity: ");
					int qty503=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub503=new Subcatagories();
					sub503.ProdId=503;
					sub503.Name="LG";
					sub503.Quantity=qty503;
					sub503.Price=55000;
					int ans503=scan.nextInt();
					if(ans503==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub503);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub503);
						Refridgerators();
					}
					break;
					
				case 504:
					System.out.println("Please enter Quantity: ");
					int qty504=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub504=new Subcatagories();
					sub504.ProdId=504;
					sub504.Name="Samsung";
					sub504.Quantity=qty504;
					sub504.Price=60000;
					int ans504=scan.nextInt();
					if(ans504==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub504);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub504);
						Refridgerators();
					}
					break;
					
				case 505:
					System.out.println("Please enter Quantity: ");
					int qty505=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub505=new Subcatagories();
					sub505.ProdId=505;
					sub505.Name="Samsung";
					sub505.Quantity=qty505;
					sub505.Price=60000;
					int ans505=scan.nextInt();
					if(ans505==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub505);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub505);
						Refridgerators();
					}
					break;
					
				case 506:
					Categories elctronics=new Categories();
					elctronics.Electronics();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Refridgerators();
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
					System.out.println("Please enter Quantity: ");
					int qty601=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub601=new Subcatagories();
					sub601.ProdId=601;
					sub601.Name="Cashew";
					sub601.Quantity=qty601;
					sub601.Price=250;
					int ans601=scan.nextInt();
					if(ans601==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub601);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub601);
						DryFruits();
					}
				break;
				
				case 602:
					System.out.println("Please enter Quantity: ");
					int qty602=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub602=new Subcatagories();
					sub602.ProdId=602;
					sub602.Name="Almonds";
					sub602.Quantity=qty602;
					sub602.Price=200;
					int ans602=scan.nextInt();
					if(ans602==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub602);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub602);
						DryFruits();
					}
					break;
					
				case 603:
					System.out.println("Please enter Quantity: ");
					int qty603=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub603=new Subcatagories();
					sub603.ProdId=603;
					sub603.Name="Walnuts";
					sub603.Quantity=qty603;
					sub603.Price=300;
					int ans603=scan.nextInt();
					if(ans603==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub603);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub603);
						DryFruits();
					}
					break;
					
				case 604:
					System.out.println("Please enter Quantity: ");
					int qty604=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub604=new Subcatagories();
					sub604.ProdId=604;
					sub604.Name="Pista";
					sub604.Quantity=qty604;
					sub604.Price=600;
					int ans604=scan.nextInt();
					if(ans604==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub604);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub604);
						DryFruits();
					}
					break;
					
				case 605:
					System.out.println("Please enter Quantity: ");
					int qty605=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub605=new Subcatagories();
					sub605.ProdId=605;
					sub605.Name="Apricots";
					sub605.Quantity=qty605;
					sub605.Price=400;
					int ans605=scan.nextInt();
					if(ans605==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub605);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub605);
						DryFruits();
					}
					break;
					
				case 606:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					DryFruits();
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
					System.out.println("Please enter Quantity: ");
					int qty701=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub701=new Subcatagories();
					sub701.ProdId=701;
					sub701.Name="Apples";
					sub701.Quantity=qty701;
					sub701.Price=55;
					int ans701=scan.nextInt();
					if(ans701==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub701);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub701);
						Fruits();
					}
				break;
				
				case 702:
					System.out.println("Please enter Quantity: ");
					int qty702=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub702=new Subcatagories();
					sub702.ProdId=702;
					sub702.Name="Banannas";
					sub702.Quantity=qty702;
					sub702.Price=20;
					int ans702=scan.nextInt();
					if(ans702==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub702);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub702);
						Fruits();
					}
					break;
					
				case 703:
					System.out.println("Please enter Quantity: ");
					int qty703=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub703=new Subcatagories();
					sub703.ProdId=703;
					sub703.Name="Oranges";
					sub703.Quantity=qty703;
					sub703.Price=30;
					int ans703=scan.nextInt();
					if(ans703==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub703);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub703);
						Fruits();
					}
					break;
					
				case 704:
					System.out.println("Please enter Quantity: ");
					int qty704=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub704=new Subcatagories();
					sub704.ProdId=704;
					sub704.Name="Mangoes";
					sub704.Quantity=qty704;
					sub704.Price=150;
					int ans704=scan.nextInt();
					if(ans704==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub704);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub704);
						Fruits();
					}
					break;
					
				case 705:
					System.out.println("Please enter Quantity: ");
					int qty705=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub705=new Subcatagories();
					sub705.ProdId=705;
					sub705.Name="Watermellons";
					sub705.Quantity=qty705;
					sub705.Price=70;
					int ans705=scan.nextInt();
					if(ans705==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub705);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub705);
						Fruits();
					}
					break;
					
				case 706:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Fruits();
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
					System.out.println("Please enter Quantity: ");
					int qty801=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub801=new Subcatagories();
					sub801.ProdId=801;
					sub801.Name="Noodles";
					sub801.Quantity=qty801;
					sub801.Price=55;
					int ans801=scan.nextInt();
					if(ans801==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub801);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub801);
						FrozenFood();
					}
				break;
				
				case 802:
					System.out.println("Please enter Quantity: ");
					int qty802=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub802=new Subcatagories();
					sub802.ProdId=802;
					sub802.Name="Fries";
					sub802.Quantity=qty802;
					sub802.Price=20;
					int ans802=scan.nextInt();
					if(ans802==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub802);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub802);
						FrozenFood();
					}
					break;
					
				case 803:
					System.out.println("Please enter Quantity: ");
					int qty803=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub803=new Subcatagories();
					sub803.ProdId=803;
					sub803.Name="Mushrooms";
					sub803.Quantity=qty803;
					sub803.Price=300;
					int ans803=scan.nextInt();
					if(ans803==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub803);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub803);
						FrozenFood();
					}
					break;
					
				case 804:
					System.out.println("Please enter Quantity: ");
					int qty804=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub804=new Subcatagories();
					sub804.ProdId=804;
					sub804.Name="BabyCorn";
					sub804.Quantity=qty804;
					sub804.Price=150;
					int ans804=scan.nextInt();
					if(ans804==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub804);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub804);
						FrozenFood();
					}
					break;
					
				case 805:
					System.out.println("Please enter Quantity: ");
					int qty805=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub805=new Subcatagories();
					sub805.ProdId=805;
					sub805.Name="Icecream";
					sub805.Quantity=qty805;
					sub805.Price=70;
					int ans805=scan.nextInt();
					if(ans805==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub805);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub805);
						FrozenFood();
					}
					break;
					
				case 806:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					FrozenFood();
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
					System.out.println("Please enter Quantity: ");
					int qty901=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub901=new Subcatagories();
					sub901.ProdId=901;
					sub901.Name="Rice";
					sub901.Quantity=qty901;
					sub901.Price=55;
					int ans901=scan.nextInt();
					if(ans901==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub901);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub901);
						FoodGrains();
					}
				break;
				
				case 902:
					System.out.println("Please enter Quantity: ");
					int qty902=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub902=new Subcatagories();
					sub902.ProdId=902;
					sub902.Name="Wheat";
					sub902.Quantity=qty902;
					sub902.Price=30;
					int ans902=scan.nextInt();
					if(ans902==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub902);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub902);
						FoodGrains();
					}
					break;
					
				case 903:
					System.out.println("Please enter Quantity: ");
					int qty903=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub903=new Subcatagories();
					sub903.ProdId=903;
					sub903.Name="Barly";
					sub903.Quantity=qty903;
					sub903.Price=30;
					int ans903=scan.nextInt();
					if(ans903==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub903);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub903);
						FoodGrains();
					}
					break;
					
				case 904:
					System.out.println("Please enter Quantity: ");
					int qty904=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub904=new Subcatagories();
					sub904.ProdId=904;
					sub904.Name="Corn";
					sub904.Quantity=qty904;
					sub904.Price=15;
					int ans904=scan.nextInt();
					if(ans904==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub904);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub904);
						FoodGrains();
					}
					break;
					
				case 905:
					System.out.println("Please enter Quantity: ");
					int qty905=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub905=new Subcatagories();
					sub905.ProdId=905;
					sub905.Name="Ragi";
					sub905.Quantity=qty905;
					sub905.Price=30;
					int ans905=scan.nextInt();
					if(ans905==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub905);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub905);
						FoodGrains();
					}
					break;
					
				case 906:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					FoodGrains();
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
					System.out.println("Please enter Quantity: ");
					int qty1001=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1001=new Subcatagories();
					sub1001.ProdId=1001;
					sub1001.Name="Bringal";
					sub1001.Quantity=qty1001;
					sub1001.Price=55;
					int ans1001=scan.nextInt();
					if(ans1001==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1001);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1001);
						Vegitables();
					}
				break;
				
				case 1002:
					System.out.println("Please enter Quantity: ");
					int qty1002=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1002=new Subcatagories();
					sub1002.ProdId=1002;
					sub1002.Name="Carrots";
					sub1002.Quantity=qty1002;
					sub1002.Price=30;
					int ans1002=scan.nextInt();
					if(ans1002==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1002);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1002);
						Vegitables();
					}
					break;
					
				case 1003:
					System.out.println("Please enter Quantity: ");
					int qty1003=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1003=new Subcatagories();
					sub1003.ProdId=1003;
					sub1003.Name="Tomatos";
					sub1003.Quantity=qty1003;
					sub1003.Price=30;
					int ans1003=scan.nextInt();
					if(ans1003==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1003);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1003);
						Vegitables();
					}
					break;
					
				case 1004:
					System.out.println("Please enter Quantity: ");
					int qty1004=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1004=new Subcatagories();
					sub1004.ProdId=1004;
					sub1004.Name="Potatoes";
					sub1004.Quantity=qty1004;
					sub1004.Price=15;
					int ans1004=scan.nextInt();
					if(ans1004==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1004);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1004);
						Vegitables();
					}
					break;
					
				case 1005:
					System.out.println("Please enter Quantity: ");
					int qty1005=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1005=new Subcatagories();
					sub1005.ProdId=1005;
					sub1005.Name="Onions";
					sub1005.Quantity=qty1005;
					sub1005.Price=30;
					int ans1005=scan.nextInt();
					if(ans1005==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1005);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1005);
						Vegitables();
					}
					break;
					
				case 1006:
					Categories grociers=new Categories();
					grociers.Groceries();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Vegitables();
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
					System.out.println("Please enter Quantity: ");
					int qty1101=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1101=new Subcatagories();
					sub1101.ProdId=1101;
					sub1101.Name="Nike";
					sub1101.Quantity=qty1101;
					sub1101.Price=799;
					int ans1101=scan.nextInt();
					if(ans1101==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1101);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1101);
						TShirts();
					}
				break;
				
				case 1102:
					System.out.println("Please enter Quantity: ");
					int qty1102=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1102=new Subcatagories();
					sub1102.ProdId=1102;
					sub1102.Name="Adiddas";
					sub1102.Quantity=qty1102;
					sub1102.Price=599;
					int ans1102=scan.nextInt();
					if(ans1102==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1102);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1102);
						TShirts();
					}
					break;
					
				case 1103:
					System.out.println("Please enter Quantity: ");
					int qty1103=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1103=new Subcatagories();
					sub1103.ProdId=1103;
					sub1103.Name="Levis";
					sub1103.Quantity=qty1103;
					sub1103.Price=1200;
					int ans1103=scan.nextInt();
					if(ans1103==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1103);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1103);
						TShirts();
					}
					break;
					
				case 1104:
					System.out.println("Please enter Quantity: ");
					int qty1104=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1104=new Subcatagories();
					sub1104.ProdId=1104;
					sub1104.Name="Arrow";
					sub1104.Quantity=qty1104;
					sub1104.Price=1299;
					int ans1104=scan.nextInt();
					if(ans1104==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1104);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1104);
						TShirts();
					}
					break;
					
				case 1105:
					System.out.println("Please enter Quantity: ");
					int qty1105=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1105=new Subcatagories();
					sub1105.ProdId=1105;
					sub1105.Name="Flying Machine";
					sub1105.Quantity=qty1105;
					sub1105.Price=1399;
					int ans1105=scan.nextInt();
					if(ans1105==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1105);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1105);
						TShirts();
					}
					break;
					
				case 1106:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					TShirts();
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
					System.out.println("Please enter Quantity: ");
					int qty1201=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1201=new Subcatagories();
					sub1201.ProdId=1201;
					sub1201.Name="Nike";
					sub1201.Quantity=qty1201;
					sub1201.Price=799;
					int ans1201=scan.nextInt();
					if(ans1201==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1201);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1201);
						Shirts();
					}
				break;
				
				case 1202:
					System.out.println("Please enter Quantity: ");
					int qty1202=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1202=new Subcatagories();
					sub1202.ProdId=1102;
					sub1202.Name="Adiddas";
					sub1202.Quantity=qty1202;
					sub1202.Price=599;
					int ans1202=scan.nextInt();
					if(ans1202==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1202);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1202);
						Shirts();
					}
					break;
					
				case 1203:
					System.out.println("Please enter Quantity: ");
					int qty1203=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1203=new Subcatagories();
					sub1203.ProdId=1203;
					sub1203.Name="Levis";
					sub1203.Quantity=qty1203;
					sub1203.Price=1200;
					int ans1203=scan.nextInt();
					if(ans1203==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1203);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1203);
						Shirts();
					}
					break;
					
				case 1204:
					System.out.println("Please enter Quantity: ");
					int qty1204=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1204=new Subcatagories();
					sub1204.ProdId=1204;
					sub1204.Name="Arrow";
					sub1204.Quantity=qty1204;
					sub1204.Price=1299;
					int ans1204=scan.nextInt();
					if(ans1204==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1204);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1204);
						Shirts();
					}
					break;
					
				case 1205:
					System.out.println("Please enter Quantity: ");
					int qty1205=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1205=new Subcatagories();
					sub1205.ProdId=1205;
					sub1205.Name="Flying Machine";
					sub1205.Quantity=qty1205;
					sub1205.Price=1399;
					int ans1205=scan.nextInt();
					if(ans1205==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1205);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1205);
						Shirts();
					}
					break;
					
				case 1206:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Shirts();
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
					System.out.println("Please enter Quantity: ");
					int qty1301=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1301=new Subcatagories();
					sub1301.ProdId=1201;
					sub1301.Name="Nike";
					sub1301.Quantity=qty1301;
					sub1301.Price=799;
					int ans1301=scan.nextInt();
					if(ans1301==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1301);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1301);
						Trousers();
					}
				break;
				
				case 1302:
					System.out.println("Please enter Quantity: ");
					int qty1302=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1302=new Subcatagories();
					sub1302.ProdId=1302;
					sub1302.Name="Adiddas";
					sub1302.Quantity=qty1302;
					sub1302.Price=599;
					int ans1302=scan.nextInt();
					if(ans1302==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1302);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1302);
						Trousers();
					}
					break;
					
				case 1303:
					System.out.println("Please enter Quantity: ");
					int qty1303=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1303=new Subcatagories();
					sub1303.ProdId=1203;
					sub1303.Name="Levis";
					sub1303.Quantity=qty1303;
					sub1303.Price=1200;
					int ans1303=scan.nextInt();
					if(ans1303==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1303);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1303);
						Trousers();
					}
					break;
					
				case 1304:
					System.out.println("Please enter Quantity: ");
					int qty1304=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1304=new Subcatagories();
					sub1304.ProdId=1204;
					sub1304.Name="Arrow";
					sub1304.Quantity=qty1304;
					sub1304.Price=1299;
					int ans1304=scan.nextInt();
					if(ans1304==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1304);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1304);
						Trousers();
					}
					break;
					
				case 1305:
					System.out.println("Please enter Quantity: ");
					int qty1305=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1305=new Subcatagories();
					sub1305.ProdId=1305;
					sub1305.Name="Flying Machine";
					sub1305.Quantity=qty1305;
					sub1305.Price=1399;
					int ans1305=scan.nextInt();
					if(ans1305==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1305);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1305);
						Trousers();
					}
					break;
					
				case 1306:
					Categories clothing=new Categories();
					clothing.Clothing();
					break;
					
				default: 
					System.out.println("Invalid Input");
					Trousers();
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
					System.out.println("Please enter Quantity: ");
					int qty1601=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1601=new Subcatagories();
					sub1601.ProdId=1601;
					sub1601.Name="Addidas X1";
					sub1601.Quantity=qty1601;
					sub1601.Price=1799;
					int ans1601=scan.nextInt();
					if(ans1601==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1601);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1601);
						Addidas();
					}
				break;
				
				case 1602:
					System.out.println("Please enter Quantity: ");
					int qty1602=scan.nextInt();
					System.out.println("1.Purchase                2.Add to cart");
					Subcatagories sub1602=new Subcatagories();
					sub1602.ProdId=1602;
					sub1602.Name="Addidas X1";
					sub1602.Quantity=qty1602;
					sub1602.Price=1799;
					int ans1602=scan.nextInt();
					if(ans1602==1)
					{
						
						//printbill;
						MainMenu.purchasebill(sub1602);
					}
					else
					{
						//Add to cart;
						//MainMenu.counter++;
						MainMenu.cart.add(sub1602);
						Addidas();
					}
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

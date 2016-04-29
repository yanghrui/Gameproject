import java.util.ArrayList;
import java.util.Scanner;

public class Gameproject3
	{
		static 	ArrayList <Alipay> alipayAL = new ArrayList<Alipay>();
		static Scanner userInput = new Scanner(System.in);
		static 	double credit = 1000;
//static variables


		public static void main(String[] args)
			{
			doAddItem();
			doPrintList();
			doSale();
			doSellerItem();
			doPrintList();
			doSearchItem();
			doPrintList();
//main method
			}
		
		public static void doAddItem()
			{
			alipayAL.add(new Alipay("Calculator", 400.00, 7, " at xxx St."));
			alipayAL.add(new Alipay("Piano", 120.78, 4, " xxx Rd."));
			alipayAL.add(new Alipay("1 #2 Pencil", .25, 10, " Mullen High School"));
			alipayAL.add(new Alipay("Vintage Record Player", 115.50, 9, " xxx St in Denver, CO." ));
			alipayAL.add(new Alipay("iPhone 6+", 130, 10, "xxx Ct."));
			alipayAL.add(new Alipay("Backpack", 30, 6, "xxx Rd."));
			//method that add items to the arraylist
			}
		
		public static void doPrintList()
			{
			System.out.println("Here are the items currently in stock:");
			for(Alipay e: alipayAL)//enhanced for loop
				{
				System.out.println(e.getItem() + " for $" + e.getPrice() + " at a quality rating of " + e.getQuality() + "/10 " + " located at " + e.getLocation());
				//print the arrylist
				}
			System.out.println();
			System.out.println("You have a credit of " + credit);
			System.out.println();
			}
		
		public static void doSale()
			{
			for(int i = 0; i < alipayAL.size(); i++)
				{
				//set the price to 90%
				alipayAL.get(i).setPrice(alipayAL.get(i).getPrice() * .9);
				}
			System.out.println("10% SALE FOR ALL ITEMS!! The new prices are:");
			for(Alipay p : alipayAL)
				{
				System.out.println(p.getItem() + " for $" + p.getPrice());
				//print out the new prices
				}
			}
		
		public static void doSellerItem()
			{
			System.out.println();
			System.out.println("Would you like to sell an item on Alipay?");
			String answer = userInput.nextLine();
			if(answer.equalsIgnoreCase("yes"))
				{
				//input items
				System.out.println("What is the name of the item that you are selling?");
				String item = userInput.nextLine();
				System.out.println("What is the price that you are hoping to sell such item? Please refrain from inserting the '$' ");
				double price = userInput.nextDouble();
				System.out.println("What would you say the quality of your item is out of 10?");
				int quality = userInput.nextInt();
				Scanner userInput2 = new Scanner(System.in);
				System.out.println("What street will you be shipping this item from?");
				String location = userInput2.nextLine();
				
				alipayAL.add(new Alipay(item, price, quality, location));
				//add this item to arrylist
				credit = credit + price;

				}
			else
				{
				System.out.println("Alright. Hvae fun Shopping!");
				}
			System.out.println();
			}
			
		public static void doSearchItem()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Would you like to search for an item in our inventory?");
			//search item on the list
			String answer = userInput.nextLine();
			if(answer.equalsIgnoreCase("yes"))
				{
				System.out.println("Alright, please input the name of an item you would like to search.");
				String item = userInput.nextLine();
				int select = -1;
				System.out.println("Here is what I found regarding your search.");
				for(int i = 0; i < alipayAL.size(); i ++)
					{
					if(item.equalsIgnoreCase(alipayAL.get(i).getItem()))
						{
						select = i;
						//record the index of item that searched
						}
					}
				if(select == -1)
					{
					System.out.println("Im sorry, but we do not have that item in our inventory at the moment.");
					}
				else
					{
					System.out.println(alipayAL.get(select).getItem() + " for $" + alipayAL.get(select).getPrice() + " at a quality rating of " + alipayAL.get(select).getQuality() + "/10 "+ " located at " + alipayAL.get(select).getLocation());
					}
				}
			else
				{
				System.out.println("Alright, Happy Shopping!");
				System.out.println();
				}
			}
		
	}
		
		
		
		

	
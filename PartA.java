/*Name: DiMitri Smith
 * Date:  February 8,2017
 * Assignment: Project Part A
 * 
 * Pseudocode:
 * Prompt user for menu choice
 * if user selects 1 , prompt WageCalculator
 * otherwise if user selects 2, prompt GroceryCoupons
 * otherwise prompt user for exit
 * 
 * WAGECALCULATOR()
 * initialize all variables( name, hourly wage, hours worked, pay)
 * prompt user for name, hourly wage and hours worked 
 * if user works more than 40 hours 
 * calculate pay by multiplying  hourly wage by hours worked times 1.5
 * otherwise if user works less than 40 hours 
 * calculate the pay by multiplying hourly wage by hours worked 
 * Display name , hours worked, overtime hours, normal pay, total pay
 * 
 * GroceryCoupons()
 * Prompt user for the cost of groceries
 * if grocery cost is $210 or more the discount is 14%
 * other wise if the cost of the grocery  is more than $150 or less than 210
 * the discount is 12%
 * other wise if the cost of the grocery is more than $60 or less than 150
 * the discount is 10%
 * other wise if the cost of the grocery is more than $10 or less than 60
 * the discount is 8%
 * otherwise user receives no discount 
 * Display grocery cost, total discount, discount percentage.
 */
import java.util.Scanner;
public class PartA 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int menu;
		
		System.out.print(" Please select one of the following options: "
				+ "(1.) Wage calculator "
				+ "(2.) Grocery coupons "
				+ "(3.) Exit :  ");
		menu = in.nextInt();
		
		switch(menu)
		{
			case 1 : 
				WageCalculator();
				break;
			
			case 2:
				GroceryCoupons();
				break;
				
			case 3:
			       System.exit(0);
			       break; 
		}
	}

	public static void  WageCalculator()
	{
		// TODO Auto-generated method stub
		String name;
		double hourlyWage, hours, pay, OverT = 0, OverTPay=0,totalPay = 0;
		Scanner input = new Scanner(System.in); 
		 System.out.print("Name: "); 
		  name = input.nextLine(); 
		 System.out.print("Hourly wage: "); 
		 hourlyWage =  input.nextDouble(); 
		 System.out.print("Hours worked: "); 
		 hours = input.nextDouble(); 
		 input.close(); 
		 pay = 0; 
		 
		 if (hours > 40) 
		 		{ 
			 	pay = hourlyWage * hours;
			 	OverT = hours - 40;
			 	OverTPay = OverT * (hourlyWage * 1.5);
			 	totalPay = pay + OverTPay;
		 		} 
		 			else 
		 			{ 
		 				pay = hourlyWage * hours;
		 				OverT = 
		 				totalPay = pay;
		 			} 
		 
		 			System.out.printf("Hello %s", name);
		 			System.out.println();
		 			System.out.printf("your regular hours worked are: "+ hours);
		 			System.out.println();
		 			System.out.printf("your overtime hours worked are: "+ OverT);
		 			System.out.println();
		 			System.out.printf("Regular Pay: "+	OverT);
		 			System.out.println();
		 			System.out.printf("Overtime pay: "+	OverTPay);
		 			System.out.println();
		 			System.out.printf("Total pay: "+	totalPay);
		 			System.out.println();
		 			System.out.print("Thank you for using Wage Calculator");		
	}
	public  static void  GroceryCoupons()
	{
		// TODO Auto-generated method stub
		double groceryPrice, TPrice, Discount;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your cost of groceries: ");
		groceryPrice = in.nextDouble();
		
		if(groceryPrice > 210)
		{
			Discount = .14;
			TPrice = groceryPrice * Discount;
		}
			else if( groceryPrice > 150 && groceryPrice <= 210)
			{
				Discount = .12;
				TPrice =groceryPrice * Discount;
			}
				else if( groceryPrice > 60 && groceryPrice <= 150)
				{
					Discount = .10;
					TPrice =groceryPrice * Discount;
				}
					else if( groceryPrice > 10 && groceryPrice <= 60)
					{
						Discount = .08;
						TPrice = groceryPrice * Discount;
					}
					else
					{
						Discount = 0;
						TPrice = groceryPrice * Discount;
						System.out.print("Sorry you did not purchase enough to recieve a discount.");
					}
					System.out.printf(" you win a Discount coupon of $%.2f " , TPrice );
					System.out.println();
					System.out.print("Thank you for using Grocery Coupons");
					}		
	
	}
	

	

package AnudipLab1;

import java.util.*;

public class MuktaHotel 
{

    public static void main(String[] args) 
    {
        int choice, item_choice=0, totalBill = 0,quantity=0;
        Scanner sc = new Scanner(System.in);
        char ans;
        String bill=" ";

        System.out.println("*!!* Welcome to Mukta's Maharashtrian Restaurant *!!*");

        do 
        {
        	
	            System.out.println("\n*-*-*-  Menu  -*-*-*");
	            System.out.println("1:Starters");
	            System.out.println("2:Main Course");
	            System.out.println("3:Dessert");
	            System.out.println("4:Drinks");
	            System.out.println(" Please Select The Items in Menu bar ");
	            choice = sc.nextInt();
	
	            switch (choice)
	            {
	                case 1:
	                
	                	do 
	                	{
	                    System.out.println("**-- Starters --**");
	                    System.out.println("1:Masala Papad \t\t\t\t40/-Rs");
	                    System.out.println("2:Kothimbir vadi\t\t\t50/-Rs");
	                    System.out.println("3:Sweetcorn chowder \t\t\t80/-Rs");
	                    System.out.println("4:Misal\t\t\t\t\t100/-Rs");
	                    System.out.println(" Please Select The Items in Menu bar ");
	                    item_choice = sc.nextInt();
	                    switch(item_choice)
	                    {
		                    case 1:
		                    	System.out.println("Masala Papad");
		                    	System.out.println("\nEnter quantity for Masala Papad ");
		                    	quantity=sc.nextInt();
		                    	totalBill+=40*quantity;
		                        bill+="\t\tMasala Papad\t\t"+quantity+"\t 40/-Rs\n";
			                    break;	
		                    case 2:
		                    	System.out.println("Kothimbir vadi");
		                    	System.out.println("\nEnter quantity for Kothimbirwadi ");
		                        quantity=sc.nextInt();
		                        totalBill+=50*quantity;
		                        bill+="\tKothimbirwadi\t\t"+quantity+"\t50/-Rs\t\n";
		                        break;
		                    
		                   case 3:
		                		System.out.println("Sweetcorn chowder");
			                	  System.out.println("\nEnter quantity for Sweetcorn chowder");
			                	  quantity=sc.nextInt();
			                	  totalBill+=80*quantity;
			                	  bill+="\t\tSweetcorn chowder\t\t"+quantity+"\t 80/-Rs\t\n";
			                	  break;
		                   
		                   case 4:
			                       System.out.println("Misal");
				                   System.out.println("\nEnter quantity for Misal");
				                   quantity=sc.nextInt();
			                       totalBill+=100*quantity;
			                       bill+="\t\tMisal\t\t"+quantity+"\t 100/-Rs\t\n";
			                       break;
			                  
		                   default:
		                	   System.out.println("Ohh!! Invalid choice!!\nPlease enter valid choice\n");
			                break;
	                    }     
		                       System.out.println("Do you want to order anything else into Starter? (y/n): ");
		                       ans = sc.next().charAt(0);
	                    
	                    
	                }while (ans == 'y' || ans == 'Y');
	                break;
	                	
		                case 2:
		                	do 
		                	{
			                    System.out.println(" * * * Main Course * * * ");
			                    System.out.println("1:Zunka Bhakri\t\t\t 100/-Rs");
			                    System.out.println("2:Puran Poli\t\t\t120/-Rs");
			                    System.out.println("3:Maswadi Rassa\t\t\t160/-Rs");
			                    System.out.println(" Please Select The Items in main Course ");
			                    item_choice = sc.nextInt();
			                    switch(item_choice)
			                    {
			                    case 1:
			                           System.out.println("\nZunka Bhakri");
					                   System.out.println("\nEnter quantity for Zunka Bhakri ");
					                   quantity=sc.nextInt();
				                       totalBill+=100*quantity;
				                       bill+="\t\tZunka Bhakri\t\t"+quantity+"\t100/-Rs\t\n";	
				                       break;
		                    	
			                    case 2:
			                    
			                    	   System.out.println("Puran Poli");
					                   System.out.println("\nEnter quantity for Puran Poli ");
					                   quantity=sc.nextInt();
				                       totalBill+=120*quantity;
				                       bill+="\t\tPuran Poli\t\t"+quantity+"\t 120/-Rs\t\n";	
				                       break;
		                    
			                    case 3:
			                  	   System.out.println("Maswadi Rassa");
				                   System.out.println("\nEnter quantity for Maswadi Rassa ");
				                   quantity=sc.nextInt();
			                       totalBill+=160*quantity;
			                       bill+="\t\tMaswadi Rassa\t\t"+quantity+"\t160/-Rs\t\n";
			                       break;
			                    default:
			                    	System.out.println("Ohh No!! Invalid choice!!\nPlease enter valid choice\n");
				                break;
		                    }
	            			         
		                	System.out.println("Do you want to order anything else into Main Course? (y/n): ");
		                    ans = sc.next().charAt(0);
			                    
			                    
	                	}while (ans == 'y' || ans == 'Y');
		                break;
	                	
		                case 3:
		                	do
		                	{
			                    System.out.println(" * * *  Dessert  * * * ");
			                    System.out.println("1:Mango Shrikhan\t\t\t40/-Rs");
			                    System.out.println("2:Modak\t\t\t60/-Rs");
			                    System.out.println("3:Gulab Jamun\t\t\t80/-Rs");
			                    System.out.println("4:Fruit custard\t\t\t90/-Rs");
			                    System.out.println("5:Rice Kheer\t\t\t100/-Rs");
			                    System.out.println(" * * * Select The Items * * * ");
			                    item_choice = sc.nextInt();
			                    
			                    switch(item_choice)
			                    {
			                    
				                    case 1:
				                        System.out.println("Mango Shrikhan");
				                    	System.out.println("\nEnter quantity for Mango Shrkhand ");
				                    	quantity=sc.nextInt();
					                    totalBill+=40*quantity;
					                    bill+="\t\tMango Shrikhan\t"+quantity+"\t 40/-Rs\t\n";
					                    break;
					                    
				                    case 2:
				                        System.out.println("Modak");
				                    	System.out.println("\nEnter quantity for Modak ");
				                    	quantity=sc.nextInt();
				                        System.out.println("2:Modak\t\t\t 60/-Rs");
					                    totalBill+=60*quantity;
					                    bill+="\t\tModak\t\t\t"+quantity+"\t\t60/-Rs\t\n";
					                    break;
				                    case 3:
				                    	    System.out.println("Gulab Jamun");
					                    	System.out.println("\nEnter quantity for Gulab Jamun ");
					                    	quantity=sc.nextInt();
					                        
						                    totalBill+=80*quantity;
						                    bill+="\t\tGulab Jamun\t"+quantity+"\t80/-Rs\t\n";
					                    break;
				                    case 4:
				                    	 System.out.println("Fruit custard");
					                    	System.out.println("\nEnter quantity for Fruit custard ");
					                    	quantity=sc.nextInt();
						                    totalBill+=90*quantity;
						                    bill+="\t\tFruit custard\t"+quantity+"\t 90/-Rs\t\n";
			                    	    break;
				                    case 5:
				                    	    System.out.println("Rice Kheer");
					                    	System.out.println("\nEnter quantity for Rice Kheer ");
					                    	quantity=sc.nextInt();
					                        System.out.println("5:Rice Kheer\t\t\t 100/-Rs");
						                    totalBill+=100*quantity;
						                    bill+="\tRice Kheer\t"+quantity+"\t100/-Rs\t\n";
				                    	break;
			                        default:
			                        	System.out.println("Ohh No!! Invalid choice!!\nPlease enter valid choice\n");
			                        	break;
		                    }     
			                       System.out.println("Do you want to order anything else into Dessert? (y/n): ");
			                       ans = sc.next().charAt(0);
		                    
		                    
		                	}while (ans == 'y' || ans == 'Y');
		                	break;
		                	  
		                case 4:
		                	do
		                	{
	                		 System.out.println(" * * * Drinks * * * ");
		                     System.out.println("1:Buttermilk(Mattha)\t\t\t40rs");
		                     System.out.println("2:Solkadhi\t\t\t\t70rs");
		                     System.out.println("Select Your Item in Drinks ");
		                     item_choice = sc.nextInt();
			                 switch(item_choice)
			                  {
				                case 1:
				                	   System.out.println("Buttermilk(Mattha)");
				                    	System.out.println("\nEnter quantity for Buttermilk(Mattha) ");
				                    	quantity=sc.nextInt();
					                    totalBill+=40*quantity;
					                    bill+="\tButtermilk(Mattha)"+quantity+"\t 40/-Rs\t\n";
				                   	break;
				                case 2: 
				                	  System.out.println("Solkadhi");
				                    	System.out.println("\nEnter quantity for Solkadhi ");
				                    	quantity=sc.nextInt();
				                        System.out.println("2:Solkadhi\t\t\t\t70/-Rs");
					                    totalBill+=70*quantity;
					                    bill+="\tSolkadhi\t"+quantity+" 70/-Rs\t\n";
				                    break;
				                default:
				                    System.out.println("Ohh No!! Invalid choice!!\nPlease enter valid choice\n");
				                    break;
			                  }   
	                       System.out.println("Do you want to order anything else into Drinks ? (y/n): ");
	                       ans = sc.next().charAt(0);     
	                	   }while (ans == 'y' || ans == 'Y');
	                	   break;
	                	  
		                default:
		                    System.out.println("Invalid choice\n");
		                    break;
		            }
	        
            System.out.println("Do you want to order anything else? (y/n): ");
            ans = sc.next().charAt(0);

        } while (ans == 'y' || ans == 'Y');
        

        System.out.println("* * * Billing Description * * *");
        System.out.println("\t\t\tMenu\t\tQuantity\t\t\tPrice");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println(bill);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Total Bill:\t\t " + totalBill + "/-Rs");
        System.out.println("--------------------------------------------------------------------------------------");

        sc.close();

        sc.close();
    }
        }

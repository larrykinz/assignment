import java.util.Scanner;

public class PurchaseCalculator {

	public static void main(String[]  args){
     	          Scanner input = new Scanner(System.in);
   
	          System.out.println(" Welcome to E-store?");
	          System.out.println(" please enter name : ");
  	          String name = input.nextLine();

		  int total = 0;
		  int counter = 1;

	          while(counter <= 10){

		           System.out.print("Please Enter cost for item : ");
     		           int cost1 = input.nextInt();
		           counter++;
		           total = total + cost1;
	           }
 	                   System.out.print("customer Name : ");
 	                   System.out.print(name);   

	                   System.out.printf("%nOriginal cost: %d",total);

	                   int discount = (total * 10)/100;
	                   int realDiscount = (total - discount);

	         if(total > 200){System.out.printf("%nDiscounted cost: %d", realDiscount);
		           System.out.println(" ");
		           System.out.println("Thanks for your patronage");
		 }
                           System.out.println(" ");

                 if(total < 200){System.out.print("Discounted cost: 0(no discount added)");
                           System.out.println(" "); 
                           System.out.println("Thanks for your patronage");
		}
   

 




           }
}

   


   


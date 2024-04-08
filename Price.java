import java.util.Scanner;
public class Price{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);

     System.out.print("Enter price:  ");
     double price = input.nextInt();

System.out.print("Enter discount:  ");
     double discount = input.nextInt();

double discountValue = price * (discount/100);
  double calculatedValue = price - discountValue;

   System.out.printf("the price after discount is " +calculatedValue);
     




     




}
}
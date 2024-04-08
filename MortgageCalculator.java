import java.util.Scanner;
  public class MortgageCalculator{
   public static void main(String[] args){
    Scanner input  = new Scanner(System.in);
     

   System.out.println("Enter principal amount");
   double principal = input.nextInt();

    System.out.println("Enter annual intrest rate");
    double intrestRate = input.nextInt();

    System.out.println("Enter duration in year");
    double year = input.nextInt();
 
    double monthYear = year * 12;

    double rate = intrestRate / 100;
double rate2 = principal * rate / 12;
    
    double number1 = rate / 12;

    double number2 = 1 + number1;

    double number3 = Math.pow(number2,monthYear);

    double number5 = number3 - 1;

    double number6 = rate2 * number3;

    double monthlyPayment = number6 / number5;

 System.out.printf("Monthly payment is %.2f", monthlyPayment);
}
}
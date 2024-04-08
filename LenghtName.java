import java.util.Scanner;
   public class LengthName{
   	  public static void main(String[] args){
 	  Scanner input = new Scanner(System.in);

  	  System.out.print("Enter your name :  ");
  	  String enter = input.nextLine();
          int length = enter.length();

          System.out.print(length);

          }
        }
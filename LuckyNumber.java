   import java.util.Scanner;
public class LuckyNumber {
   public static void main(String[]  args){
     Scanner input = new Scanner(System.in);

    System.out.print("welcome to guess game");
     System.out.print("how many times would you like to play");
      int times = input.nextInt();     

    System.out.print("Enter a guess for a lucky number :  ");
      int lucky = input.nextInt();
  

if(lucky == 22 ){
 System.out.print("You are correct");
}

  else if(lucky <= 22){
 System.out.print("Too low");
}

  else if(lucky >= 22){
  System.out.print("too high");
}



}
}





import java.util.Scanner;
public class CollectNumber{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
int c = 50;
int h = 30;

     System.out.print("Sample input:  ");
     int d = input.nextInt();

  double a = (2 * c * d)/h;
double z = Math.sqrt(a);
int q = (int)z;
 System.out.printf("Sample output: %d", q);
      
}
}
  


import java.util.Scanner;

public class cal{
         public static void main(String args[]){
         Scanner buckey= new Scanner(System.in);
         double fnum, snum, answer;
         System.out.println("Enter first num: ");
         fnum= buckey.nextDouble();
         System.out.println("Enter second num: ");
         snum= buckey.nextDouble();
         answer =fnum+snum;
         System.out.println(answer);
         
}
}

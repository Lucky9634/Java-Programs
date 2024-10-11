
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Welcome To The Find Interest.");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Price: ");
        int price = input.nextInt();
        
        System.out.print("Enter Your Rate: ");
        int rate = input.nextInt();

        System.out.print("Enter Your Time: ");
        int time = input.nextInt();

        int totalInterest = interest(price, rate, time);
        System.out.print("Your Interest all is "+totalInterest+".");

    }
    //make a fucntion

    public static int interest(int price, int rate, int time){
        int finalPrice = (price * rate * time)/100;
        return finalPrice;
    }
}

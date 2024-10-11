
import java.util.Scanner;

public class CompoundingInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Price: ");
        int price = input.nextInt();
        
        System.out.print("Enter Your Rate: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter Your Years: ");
        int time = input.nextInt();

        double compoundingInterest = compoundingInterest(price, rate, time);

        System.out.println("Your Total Compounding Interest Is "+compoundingInterest+".");
        

    }
    public static double compoundingInterest ( double price, double rate, double time){
        double calRate = rate / 100;
        double totalInterest = price*Math.pow(1 + calRate, time);
        return totalInterest;
    }
}

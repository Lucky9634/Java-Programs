
import java.util.Scanner;

/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter Your Fisrt Value: ");
        int first = input.nextInt();
        
        System.out.print("Enter Your Second Value: ");
        int second = input.nextInt();

        int sum = sum(first, second);
        System.out.printf("Sum Of Two Numbers "+ sum+".");
        
    }
    public static int sum(int first, int second){
        int sum = first + second;
        return sum;
    }
}
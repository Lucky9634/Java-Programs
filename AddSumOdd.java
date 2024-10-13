
import java.util.Scanner;

public class AddSumOdd {
    public static void main(String[] args) {
        System.out.println("Welcome To The Sum Of Odd Number.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = input.nextInt();

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}

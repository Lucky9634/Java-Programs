
import java.util.Scanner;

public class AddSumEven {
    public static void main(String[] args) {
        System.out.println("Welcome to the sum to even no.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Natural Number To Add Sum: ");

        int num = input.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if( i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);


    }
}

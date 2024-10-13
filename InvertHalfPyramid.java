
import java.util.Scanner;

public class InvertHalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome To The Invert Half Pyramid.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int num = input.nextInt();

        for (int i = num; i >= 1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


import java.util.Scanner;

/**
 * InvertHalfPyranid36
 */
public class InvertHalfPyranid36 {
public static void main(String[] args) {
    System.out.println("Invert Half Pyramid.");
    Scanner input = new Scanner(System.in);
    System.out.print("Enter The Number: ");
    int num = input.nextInt();

    for(int i = 1; i<= num; i++){
        for (int j = 1; j <= num-i; j++) {
            System.out.print(" ");
        }
        for(int j = 1; j<= i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
}
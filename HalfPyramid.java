
import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        System.out.println("Welcome To The Half Pyramid.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int n = input.nextInt();
        
        // System.out.print("Enter The Cols: ");
        // int m = input.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

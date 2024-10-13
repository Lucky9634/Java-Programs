
import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome To The Solid Rectangle Partern.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter The Cols: ");
        int cols = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

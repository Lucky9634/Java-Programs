
import java.util.Scanner;

public class Two2Array {
    public static void main(String[] args) {
        System.out.println("Welcome To The 2D Array.");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Rows: ");
        int rows = input.nextInt();

        System.out.print("Enter Your Columns: ");
        int cols = input.nextInt();

        int [][] array = new int[rows][cols];

        //input to the element in array.
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print("Enter Your Rows "+ (i+1) + " And Columns "+(j+1)+ " Element: ");
               array[i][j]=input.nextInt();
            }
        }


        //Output print 
        System.out.println("Your Array.");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;
import javax.lang.model.element.Element;

public class HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome To The Hollow Rectangle.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter The Cols: ");
        int cols = input.nextInt();

        for(int i = 1; i<= rows; i++){
            for(int j=1; j <=cols; j++){
                if(i==1 || j==1 || i==rows || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

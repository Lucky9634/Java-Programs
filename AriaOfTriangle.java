
import java.util.Scanner;

public class AriaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Heigth Of Aria: ");
        double heigth = input.nextInt();

        System.out.print("Enter The Base Of Aria: ");
        double base = input.nextInt();

        double finalValue = triangleArea(heigth, base);
        System.out.print("Area Of Rectangle is "+finalValue+".");
    }

    public static  double triangleArea( double heigth, double base){
        double aria =  (0.5 * heigth * base);
        return aria;
    }
}

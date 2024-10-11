import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Length: ");
        int a = input.nextInt();
        
        System.out.print("Enter The Second Length: ");
        int b = input.nextInt();

        System.out.print("Enter The Third Length: ");
        int c = input.nextInt();

        System.out.print("Enter The Fourth Length: ");
        int d = input.nextInt();
        int rectanglePremeter = rectangle(a, b, c, d);
        System.out.println("Result Is "+ rectanglePremeter+".");

    }
    
    public static int rectangle(int a, int b, int c, int d){
        int perimeter = a + b + c + d ;
        return perimeter;
    }
}


import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        System.out.println("Welcome To The Print Table.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int Table = num * i;
            System.out.println(num + " X "+ i + " = "+ Table);
        }
       
    }
}

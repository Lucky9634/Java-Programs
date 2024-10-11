
import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Fahreheit To Convert Celcius.");
        System.out.print("Enter The Fahreheit Value: ");
        int fah = input.nextInt();
        double celsius = celsius(fah);
        System.out.print("Celcius : "+ celsius);
    }

    public  static  double celsius( int fahreheit){
        double clus = (fahreheit - 32) * 5/9;
        return clus;
    }
}

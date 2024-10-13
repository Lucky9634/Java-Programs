
import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        System.out.println("Welcome To The Find Array Element Present In Array Or Not.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Array Size: ");
        int size = input.nextInt();

        int numbers[]= new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter The Array Element "+(i+1)+" : ");
            numbers[i]=input.nextInt();
        }

        System.out.print("Enter Number Whose Find: ");
        int num = input.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == num){
                System.out.print("Your Number Is Found. Index Is " + i + ".");
            }
        }
    }
}


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Array.");
        System.out.print("Enter Array Size: ");
        int size = input.nextInt();
        int [] marks = new int [size];


        // Input Array By The User.
        for(int i = 0; i<size; i++){
            System.out.print("Enter Your Araay Element " +(i + 1)+ " : ");
            marks[i]= input.nextInt();
        }

        // Output all Element in Array to exit.
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
}

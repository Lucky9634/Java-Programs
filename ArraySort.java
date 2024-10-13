
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        System.out.println("Welcome To The Sort Array.");

        int numbers []={4,5,1,2,9,7,9,10};

        System.out.println("Array With Out Sort.");
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        Arrays.sort(numbers);

        System.out.println("Array With Sort.");

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }
}

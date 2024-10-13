
import java.util.Arrays;




public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome To The Reverse Array.");
        int [] values = {2, 34, 12, 23, 45, 67 ,50};

        for(int i = values.length-1; i >= 0; i--){
            System.out.println(values[i]);
        }
    }
}

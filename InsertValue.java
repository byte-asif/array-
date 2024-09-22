import java.util.Arrays;

public class InsertValue {
        public static void main(String[] args) {
       int arr[]={2,3,4,6,7,8,10,23,22};
            int Index_position = 2;
            int newValue = 5;
            System.out.println("Original Array : " + Arrays.toString(arr));
            for (int i = arr.length - 1; i > Index_position; i--) {
               arr[i] = arr[i - 1];
            }
            arr[Index_position] = newValue;
            System.out.println("New Array: " + Arrays.toString(arr));


        }
    }


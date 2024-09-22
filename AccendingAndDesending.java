
    import java.util.Arrays;
import java.util.Collections;
    import java.util.Comparator;

    public class AccendingAndDesending {
        public static void main(String[] args) {
            Integer[] arr = {5, 2, 1, 8, 10};
            int arra[] = {5, 2, 1, 8, 10};
            Arrays.sort(arr);

            for (int values : arr) {
                System.out.print(values + ", ");
                // 1, 2, 5, 8, 10,
            }


            Arrays.sort(arr, Comparator.reverseOrder());

            System.out.println(" ");
            for (int values : arr) {
                System.out.print(values + ", ");
                // 10, 8, 5, 2, 1,
            }
        }

    }

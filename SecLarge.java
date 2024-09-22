import java.util.Arrays;

public class SecLarge {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, -2, -5, -3, 6};
        Arrays.sort(arr);
        System.out.println("Second Max: " + arr[arr.length - 2]);
    }
}

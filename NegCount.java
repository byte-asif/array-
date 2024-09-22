public class NegCount {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, -2, -5, -3, 6};
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                counter++;

            System.out.println(arr[i]);}
        }
        System.out.println(counter);
    }
}
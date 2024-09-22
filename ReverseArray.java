public class ReverseArray {
        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};
            int length = originalArray.length;
            int[] reversedArray = new int[length];

            for (int i = 0; i < length; i++) {
                reversedArray[i] = originalArray[length - 1 - i];
            }

            // Print the reversed array
            System.out.print("Reversed Array: ");
            for (int num : reversedArray) {
                System.out.print(num + " ");
            }
        }
    }


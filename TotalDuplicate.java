public class TotalDuplicate {

        public static void main(String[] args) {

            //Initialize array
            int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
            int counter=0;

            System.out.println("Duplicate elements in given array: ");
            //Searches for duplicate element
            for(int i = 0; i < arr.length; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j]){
                        counter++;
                        System.out.println(arr[j] );
                }}

//

            }

            System.out.println("Total Number of Duplicate element: "+counter);
        }
}

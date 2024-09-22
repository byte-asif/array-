public class OddEven {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, -2, -5, -3, 6};
        int Even=0,Odd=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                Even++;
            }
            else {
                Odd++;
            }
        }
        System.out.println("Number of odd: "+Odd);
        System.out.println("Number of Even: "+Even);
    }
}
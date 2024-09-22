public class NegArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4,-2,-5,-3,6};
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}

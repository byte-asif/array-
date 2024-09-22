public class OddEvenSep2 {
    public static void main(String[] args){
        int arr[]= {1,2,3,4,5,6,7,8,9,11,2,333,44,22,556,67};
        int odd[]= new int[100];
        int Even[]=new int[100];
        int o=0;
        int e=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                Even[e]=arr[i];
                e++;
            }
            else {
                odd[o]=arr[i];
                o++;
            }
        }
        prln("The Odd elements are: ");
        pr(odd,o);
        prln("The Even Elements are; ");
        pr(Even,e);
    }
    static void pr(int arr[], int lenth){
        for (int i = 0; i < lenth; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    static void prln(Object anyobject){
        System.out.println(anyobject);
    }
}

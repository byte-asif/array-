

import java.util.Arrays;
import java.util.Scanner;
    public class Delete
    {
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
           int arr[]= {1,2,3,4,5,6,7,8,9,0};

            System.out.println("Enter the position you want to remove ");
            int position = sc.nextInt();

                    // shifting elements
                    for(int j = position; j < arr.length - 1; j++)
                    {
                        arr[j] = arr[j+1];
                    }



            System.out.println( Arrays.toString(arr));

        }
    }



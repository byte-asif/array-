import java.util.Arrays;

public class ArrCpy {

    // Main driver method
    public static void main(String[] args)
    {
        // Input array a[]
        int a[] = { 1, 8, 3 };

        // Create an array b[] of same size as a[]
        int b[] = new int[a.length];

        // Copying elements of a[] to b[]
        for (int i = 0; i < a.length; i++){
            b[i] = a[i];}

        // Display message only
        System.out.println("Contents of a[] ");

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        // Display message only
        System.out.println("\n\nContents of b[] ");

        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}



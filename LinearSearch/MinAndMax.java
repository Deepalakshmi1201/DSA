package LinearSearch;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        maxAndMin(arr);
    }
    static void maxAndMin(int[] arr)
    {
        int max = arr[0];
        int min = arr[0];

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println(max);
        for(int i = 0 ; i < arr.length ; i++)
        {
           min = Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}

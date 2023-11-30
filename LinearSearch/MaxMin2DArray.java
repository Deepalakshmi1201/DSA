package LinearSearch;
import java.util.Scanner;

public class MaxMin2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];

        for(int row = 0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr.length ; col++)
            {
                arr[row][col] = sc.nextInt();
            }
        }
        MaxMin2DArray( arr);
    }
    static  void MaxMin2DArray(int[] [] arr)
    {
        int max = 0;
        int min = Integer.MAX_VALUE;

        for(int[] arr1 : arr)
        {
            for(int arr2 : arr1)
            {
                if(arr2 > max)
                    max = arr2;
            }
        }
        System.out.println(max);

        for(int[] arr1 : arr)
        {
            for(int arr2 : arr1)
            {
                if(arr2 < min)
                    min = arr2;
            }
        }
        System.out.println(min);

    }
}

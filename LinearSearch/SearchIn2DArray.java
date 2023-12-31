package LinearSearch;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
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
        System.out.println("Enter a target: ");
        int target = sc.nextInt();
        int [] ans = Search2DArray(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] Search2DArray(int[][]arr,int target)
    {
        for(int row = 0 ; row < arr.length ; row++)
        {
            for(int col = 0 ; col < arr.length ; col++)
            {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

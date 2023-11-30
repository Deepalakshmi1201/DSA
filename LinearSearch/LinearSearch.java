package LinearSearch;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        System.out.println(SearchNum(arr,target));

    }
    static int  SearchNum(int[]arr,int target)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}

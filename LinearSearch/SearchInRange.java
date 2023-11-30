package LinearSearch;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(searchInrange(arr,target,start,end));

    }
    static int  searchInrange(int[]arr,int target,int start,int end)
    {
        for(int i = start ; i <= end ; i++)
        {
            if(arr[i] == target)
                return arr[i];
        }
        return -1;
    }
    }


package BinarSearch;
import java.util.*;
//Order-Agnostic BinarySearch - helps us to check sorted order is asc or desc
public class OrderAgnosticBs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a target: ");
        int target = sc.nextInt();

        int ans = orderAgnosticBs(arr,target);
        System.out.println("Target index : "+ans);
    }
    static int orderAgnosticBs(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end )
        {
            int mid = start + (end - start)/2;
            if(target == arr[mid])                 //common for both asc and dec
            {
                return mid;
            }
            boolean isAsc = arr[start] < arr[end];
            if(isAsc) // true means asc and rule applicable for asc order sorted array
            {
                if(target > arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            else {         // false means desc and rule applicable for desc order sorted array
                if(target < arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}

package LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class CurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nums = new int[5];
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = sc.nextInt();
        }
        int[] ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));


    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++)
            {
                if(nums[i] > nums[j])
                {
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}

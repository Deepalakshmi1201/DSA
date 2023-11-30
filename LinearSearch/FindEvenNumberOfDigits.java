package LinearSearch;

import java.util.*;

public class FindEvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(FindNumber(arr));
    }
    static int FindNumber(int[] arr)
    {
        int count = 0;
        for(int num : arr)
        {
            if(even(num))
                count++;
        }
        return count;
    }
    static int digits1(int num)
    {
        int count = 0;
        while(num > 0)
        {
            count++;
            num = num/10;
        }
        return count;
    }
    static int digits2(int num)
    {
       return (int)(Math.log10(num))+1;
    }


    static boolean even(int num)
    {
        int value = digits2(num);
        return value % 2 == 0;
    }
}

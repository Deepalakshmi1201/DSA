package LinearSearch;
import java.util.*;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char target = sc.next().charAt(0);
        System.out.println(searchInStr(str,target));
    }
    static boolean searchInStr(String str,char target )
    {
        //forloop
//        for(int i = 0 ; i < str.length() ; i++)
//        {
//            if(target == str.charAt(i))
//                return i;
//
//        }
//        return -1;
/*-----------------------------------------------------------------------------------*/
        //foreach loop
        for(char ch : str.toCharArray())
        {
            if(target == ch)
                return true;
        }
        return false;
    }
}

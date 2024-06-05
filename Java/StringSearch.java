import java.util.*;


public class StringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);
        System.out.println(search(str,target));
    }
    static boolean search(String str,char target){
        if (str.length()==0) {
            return false;
        }
        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i)==target) {
        //         return true;
        //     }
        // }

        for(char ch: str.toCharArray()){
            if (ch==target) {
                return true;
            }
        }
        return false;
    } 
}

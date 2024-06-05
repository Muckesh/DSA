public class LeetcodeEvenDigitsCount {
    public static void main(String[] args) {
        int[] arr = {-12,3451,2,6,7896};
        System.out.println(findNumbers(arr));
        System.out.println(digits2(0));
    }

    static int findNumbers(int[] arr){
        int count=0;
        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    static boolean even(int num){
        int digits = digits(num);
        return digits%2==0;

        
    }

    static int digits2(int num){
        if (num<0) {
            num*=-1;
        }
        if (num==0) {
            return 1;
        }
        return (int)(Math.log10(num)) +1;
    }

    static int digits(int num){
        // negative
        if (num<0) {
            num*=-1;
        }

        // zero
        if (num==0) {
            return 1;
        }

        int dig=0;
        while (num>0) {
            dig++;
            num/=10;
        }
        return dig;
    }
}

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number to check is Prime?");
        // int x = sc.nextInt();
        // boolean res = isPrime(x);
        // System.out.println("Is "+x+" Prime ? "+res);

        System.out.print("Enter num to check is Armstrong ? ");
        int arm = sc.nextInt();
        boolean result = isArmstrong(arm);
        System.out.println("Is "+ arm + " Armstrong ? "+result );
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isPrime(int x){

        if (x<=1) {
            return false;
        }
        int c=2;
        while (c*c<=x) {
            if(x%c==0)
            return false;
            c++;
        }
        // return true;
        return c*c >x;
    }

    static boolean isArmstrong(int n){
        int original = n;
        int arm=0;
        int len = (int)(Math.log10(original) )+1;
        // System.out.println(len);
        while (n>0) {
            int temp = n%10;
            arm=(arm)+((int)(Math.pow(temp, len)));
            n/=10;
        }
        // System.out.println(arm);
        return arm==original;
    }
}
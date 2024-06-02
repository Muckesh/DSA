import java.util.*;
// public class FirstJava {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Principal : ");
//         int principal = sc.nextInt();
//         System.out.print("Enter Time Period : ");
//         int time =sc.nextInt();
//         System.out.print("Enter Rate : ");
//         int rate =sc.nextInt();
//         float simpleInterest = (principal*time*rate)/100;
//         System.out.println("The Simple Interest is : "+simpleInterest);
//     }
// }
// public class FirstJava {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter num1: ");
//         int num1=sc.nextInt();
//         System.out.print("Enter num2 : ");
//         int num2 = sc.nextInt();
//         System.out.print("Enter the operator : ");
//         char operator = sc.next().charAt(0);
//         if (operator=='+') {
//             System.out.println("Result "+(num1+num2));
//         }else if (operator=='-') {
//             System.out.println("Result "+(num1-num2));
//         }else if (operator=='*') {
//             System.out.println("Result "+(num1*num2));
//         }else if(operator=='/'){
//             System.out.println("Result "+(num1/num2));
//         }else {
//             System.out.println("Invalid Operation");
//         }
//     }
// }

public class FirstJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=0,b=1,c;
        if (num>0) {
            
            System.out.print(a+","+b+",");
            for(int i=0;i<num-2;i++)
            {
                c=a+b;
                System.out.print(c+",");
                int t =b;
                b=c;
                a=t;
            }
        
        }



    }
}
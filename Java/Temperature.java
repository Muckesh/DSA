import java.util.*;
class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius : ");
        float celsius = sc.nextFloat();

        float farenheit = (9*celsius)/5 + 32;
        System.out.println("The Temperature in Farenheit is : "+farenheit);

    }
}
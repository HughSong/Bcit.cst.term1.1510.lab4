
/**
 * 
 */
import java.util.Scanner;
import java.lang.*;

/**
 * @author ËÎÓëçñ
 *
 */
public class ExperienceWithInteger {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int integer;
        String binary;
        String octal;
        String hexadecimal;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        integer = scan.nextInt();
        binary = Integer.toBinaryString(integer);
        octal = Integer.toOctalString(integer);
        hexadecimal = Integer.toHexString(integer);
        System.out.println("Converting " + integer + " to binary is: " + binary);
        System.out.println("Converting " + integer + " to octal is: " + octal);
        System.out.println("Converting " + integer + " to hexadecimal is: " + hexadecimal);
        final int maximum;
        final int minimum;
        maximum = Integer.MAX_VALUE;
        minimum = Integer.MIN_VALUE;
        System.out.println("The maxmun possible Java integer value is: " + maximum);
        System.out.println("The minmun possible Java integer value is: " + minimum);
        System.out.println();
        System.out.println("---------------------------");

        System.out.println("Please enter two decimal numbers separately:¡¡");
        String num1 = scan.next();
        String num2 = scan.next();
        System.out.println(
                "The result for adding these tow numbers are: " + (Integer.valueOf(num1) + Integer.valueOf(num2)));
        scan.close();

    }

}

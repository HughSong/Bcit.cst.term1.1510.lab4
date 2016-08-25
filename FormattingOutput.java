
import java.text.NumberFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This system is about CS DEL.
 * 
 * @author ËÎÓëçñ
 * @version 28.Jau.2016
 */
public class FormattingOutput {
    /**
     * ...
     * 
     * @param args
     *            heheda
     */
    public static void main(String[] args) {
        double pricePerpound;
        double weightOunces;
        double weight;
        double totalPrice;
        final double OUNCES_PER_POUND = 16.0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CS Del1!!\n ");
        System.out.println("Enter the price per pound of your item: ");
        pricePerpound = scan.nextDouble();
        System.out.println("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerpound * weight;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("0.##");
        System.out.println("Unit price: " + money.format(pricePerpound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("TOTAL: " + money.format(totalPrice));
        scan.close();

    }

}

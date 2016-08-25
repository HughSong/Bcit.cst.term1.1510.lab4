
import java.util.Scanner;

/**
 * Figuring out the distance between tow points.
 * 
 * @author ËÎÓëçñ
 * @version: 28.Jau.2016
 */
public class Distance {
    /**
     * @param args
     *            sdan
     */
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        double xpart;
        double ypart;
        double distance;
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Please enter the coordinates of the first point" + "(please using a space to separate x and y): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.println("Please enter the coordinates of " + "the second point: ");
        x2 = scan.nextInt();
        y2 = scan.nextInt();
        xpart = Math.pow(x1 - x2, 2);
        ypart = Math.pow(y1 - y2, 2);
        distance = Math.sqrt(xpart + ypart);
        System.out.println("The distance between the first number and " + "secand number is:" + distance);
        scan.close();

    }

}

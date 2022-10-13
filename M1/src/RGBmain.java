import java.util.Scanner;
import java.util.Locale;

public class RGBmain {
    public static void main(String[] args) {
        RGB pixel = new RGB(0.1,0.2,0.3);
        pixel.display();
        System.out.println("Grey level is " + pixel.greyLevel());
        pixel.turnToGrey();
        pixel.display();
        RGB white = new RGB();
        white.display();
        pixel.set(0.2,0.1,0.7);
        pixel.display();
        pixel.set(pixel.greyLevel());
        pixel.display();

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        float red = sc.nextFloat();
        float green = sc.nextFloat();
        float blue = sc.nextFloat();

        sc.close();

        RGB pixel2 = new RGB(red,green,blue);
        pixel2.display();
    }
}

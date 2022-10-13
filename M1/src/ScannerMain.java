import java.util.Scanner;
import java.util.Locale;

public class ScannerMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int number = sc.nextInt();
        boolean myBool = sc.nextBoolean();
        double real = sc.nextDouble();
        System.out.println("Integer : " + number);
        System.out.println("Boolean : " + myBool);
        System.out.println("Real : " + real);

        sc.close();
    }
}
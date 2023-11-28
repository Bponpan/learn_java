package java1;
import java.util.Scanner;

class fahrenheit{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        float c = kbd.nextFloat();
        double f = c * 9/5 + 32;
        System.out.printf("%.1f", f);
    }
}
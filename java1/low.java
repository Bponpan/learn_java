package java1;
import java.util.Scanner;

public class low {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        char a = kbd.next().charAt(0) ;

        if (Character.isUpperCase(a)) {
            System.out.println("UPPERCASE") ;

        }else if(Character.isLowerCase(a)) {
            System.out.println("lowercase") ;
        }

    }

    
}
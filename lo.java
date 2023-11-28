import java.util.Scanner;

public class lo {
    public static void main(String string[]) {
        int i ;
        double format = 0 ;
        int a ;
        double n = 10 ;

        Scanner kbd = new Scanner(System.in) ;

        for(i=0;i<n;i++) {

       a = kbd.nextInt() ;
       format = format+a ;


        }
       double x = format / n ;
       System.out.println(String.format("%.2f",x));

   }
}

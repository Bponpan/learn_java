import java.util.Scanner;

public class mainEx {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        String name = kbd.nextLine();
        int l = name.length();
        
        if (l > 15){
            System.out.println("more than 15 characters");
        }else{
            for (int x = 0; x < name.length(); x++){
                
                    if ( name.charAt(x) == 'a'){
                    a = a+1;
                }else if( name.charAt(x) == 'e'){
                    e = e+1;
                }else if( name.charAt(x) == 'i'){
                    i = i+1;
                }else if( name.charAt(x) == 'o'){
                    o = o+1;
                }else if(name.charAt(x) == 'u'){
                    u = u+1;
                }

            }
            System.out.println(a);
            System.out.println(e);
            System.out.println(i);
            System.out.println(o);
            System.out.println(u);
            
        }


    }
}
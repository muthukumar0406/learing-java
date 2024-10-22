
import java.util.*;
import java.util.Scanner;
public class expectionhandlings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;;
        try{
         a= scan.nextInt();
         b=scan.nextInt();
         c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException i){
            System.out.println(i);
        }
        
        System.out.println("divide answer:"+c);
    
    }
    
}

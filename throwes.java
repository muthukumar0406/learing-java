import java.util.Scanner;
public class throwes {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            int age=sc.nextInt();
            if(age<1){
                throw new ArithmeticException("age should be greathan one");
            }

        }
        catch (Exception e){
            System.out.println(e);

        }
        System.out.println("program ended");
         
    }
    
}

import java.util.Scanner;

public class getinput {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=scan.nextLine();
        System.out.println("enter your age:");
        int age =scan.nextInt();
        scan.nextLine();
        System.out.println("enter your location:");
        String location=scan.nextLine();

        System.out.println("my name is "+name);
         System.out.println("my age is "+age);
          System.out.println("my location is "+location);


    }
    
}

interface dad {
default void disp(){
   System.err.println("dad: my son want to became doctor");
 }
    }
interface mom {
     default void displays(){
   System.out.println("mom:my son want to became engineer");
        }
    }
class child implements dad,mom{
    public void display(){
        System.out.println("child: sorry i will became a java developer");
    }


}
public class multiples {
    public static void main(String[] args) {
        child c1=new child();
        c1.disp(); 
        c1.displays();
        c1.display();
    }
    
}

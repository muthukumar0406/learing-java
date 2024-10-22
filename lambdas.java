
interface  a{
    void display();
}

    


public class lambdas {
    public static void main (String []args){
        a obj=()->{System.out.println("hello java");};
        obj.display();
    }
    
}

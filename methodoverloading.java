public class methodoverloading {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int c,int d,int e)
    {
        System.out.println(c+d+e);
    }
    public static void main(String[] args) {
        methodoverloading obj=new methodoverloading();
        obj.sum(5,5);
        obj.sum(5,5,5);
    }
    
}

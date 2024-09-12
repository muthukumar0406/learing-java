public class store{
    void soup(int money)
    {
        System.out.println("soup purchase");
        System.out.println("soup price is"+" "+ money);
    }
    void power(int money)
    {
        System.out.println("power purchase");
         System.out.println("power price is"+" "+ money);

    }
    void facewash(int money)
    {
        System.out.println("facewash purchase");
         System.out.println("facewash price is" +" "+  money);
    }
    
    public static void main(String[] args) {
        store thinks=new store();
        thinks.soup(20);
        thinks.power(45);
        thinks.facewash(250);
    }
    
}
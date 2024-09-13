public class return1 {
     String getname()
    {
        System.out.print("my name is"+" ");
        return "Muthukumar";
    }
     int getage()
    {
       System.out.print("my  age is"+" ");
       return 21;
    }
    public static void main(String[]args){
        return1 object=new return1();
         String myname =object.getname();
         System.out.println(myname);
       
        int myage=object.getage();
        System.out.println(myage);
    
    
}
}
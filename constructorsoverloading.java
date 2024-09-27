public class constructorsoverloading {
    String sim_name;
    long mobile_no;

    constructorsoverloading(String a,long b)
    {
        sim_name =a;
        mobile_no= b;
    }
    public static void main(String[] args) {
        constructorsoverloading obj=new constructorsoverloading("airtel",12234512345l);
         constructorsoverloading obj1=new constructorsoverloading("jio",1234567890l);

        System.out.println(obj.sim_name);
        System.out.println(obj.mobile_no);
          System.out.println(obj1.sim_name);
        System.out.println(obj1.mobile_no);
       

        

    }



    
}

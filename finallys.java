public class finallys {
    public static void main(String[]args){
        int err=0;
        try{
            int a=10;
            err=0;
        }
        catch(Exception e){
          err=1;
        }
        finally{
            if(err==1)
{
    System.out.println("no error");
}   
else{
    System.out.println("error found");
}
  
 }
    }
    
}

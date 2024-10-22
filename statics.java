
    class student{
        int mark=0;
        static String teacher="kumar";
    }
    public class statics {
    public static void main(String[]args){
        student s1=new student();
    s1.mark=78;
    student s2=new student();
    s2.mark=65;
    //student.teacher="raja";
    System.out.println(s1.teacher);

 }
    
}

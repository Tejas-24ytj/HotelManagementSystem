
package practice;

public interface interf {
   public void start();
public class Student implements interf{
    public void start(){
        System.out.println("I am studying hard for exams.");}
    
}
class main{
    public static void main(String[]args){
        Student s1=new Student();
        s1.start();
    }}
}

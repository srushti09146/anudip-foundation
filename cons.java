abstract class cot {
    abstract void run ();
    abstract void fly ();


    cot(){
        System.out.println("this is a constructor");
    }




}
class demo extends cot {

    public void run(){
        System.out.println("this method for run");
    }
    public void fly(){
        System.out.println("this method for fly");
    }
    demo(){
        System.out.println("this is child constructor");
    }

}
public class cons {
    public static void main (String[]args){
        demo d1=new demo();
        d1.fly();
        d1.run();
    }
}

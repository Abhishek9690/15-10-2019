public class MultiThreading {
    public static void main(String[] args) {
        thdemo1 obj1=new thdemo1();
        thdemo2 obj2=new thdemo2();
        obj1.start();
        obj2.start();
    }
}
class thdemo1 extends Thread{
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("abhishek......");
                sleep(500);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class thdemo2 extends Thread{
    public void run(){
        try{
            for (int j = 0; j < 10; j++) {
                System.out.println("Vivek......");
                sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class p1 extends Thread{
    p1(String str){
        super(str);
    }
    public void run(){
        while(true){
            System.out.println("hello");
        }
    }
    public static void main(String[] args){
        // we can achieve multithreading using Thread class ot Runnable interface
        p1 p = new p1("first");
        p.start();
        while(true){
            System.out.println("world");
        }
    }    
}
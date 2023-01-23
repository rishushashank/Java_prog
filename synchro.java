import java.util.*;

// 1st way
// class mydata{
//     void dispaly(String s){
//         synchronized(this){
//         for(int i=0;i<s.length();i++){
//             System.out.println(s.charAt(i));
//         }
//     }
//     }
// }

//2nd way
class mydata{
    synchronized void dispaly(String s){
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}

class mythtead extends Thread{
    mydata d;
    mythtead(mydata data){
        d = data;
    }
    
    public void run(){
        // try{
        //     Thread.sleep(1);}
        //     catch(Exception e){}
        d.dispaly("hello worlld");
    }
}

class mythtead2 extends Thread{
    mydata d;
    mythtead2(mydata data){
        d = data;
    }
    public void run(){
        d.dispaly("welcome main");
    }
}
public class synchro {
    public static void main(String[] args){
        mydata d = new mydata();
        mythtead m1 = new mythtead(d);
        mythtead2 m2 = new mythtead2(d);
        m1.start();
        m2.start();
    }
    
}

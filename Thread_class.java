// getxx//setxx

// 1st prog
// class mythread extends Thread{
//     public mythread(String name){
//         super(name);
//         setPriority(Thread.MIN_PRIORITY);
        

//     }
   
// }
// public class Thread_class{
    
//     public static void main(String [] args) throws Exception{
//         mythread t = new mythread("first");
//         System.out.println(t.getId());
//         System.out.println(t.getName());
//         System.out.println(t.getPriority());
//         System.out.println(t.getState());
//         System.out.println(t.isAlive());
//         t.start();
//         System.out.println(t.getState());
//         t.setName("second");
        
//         System.out.println(t.getId());
//         System.out.println(t.getName());
//         System.out.println(t.getPriority());
       
        

//     }
// }



//2nd prog thread.sleep
// class thread extends Thread{
//     public void run(){
//         int i=0;
//         while(true){
//             System.out.println(i++);
//             try{
//             Thread.sleep(1000);
//             }
//             catch(Exception e){System.out.print(e);}
//         }
//     }
// }
// public class Thread_class{
//     public static void main(String[] args){
//         thread t = new thread();
//         t.start();
//     }
// }



//3rd prog start and interrupt
// class thread extends Thread{
//     public void run(){
//         int i=0;
//         while(true){
//             System.out.println(i++);
//             try{
//             Thread.sleep(1000);
//             }
//             catch(Exception e){System.out.print(e);}
//         }
//     }
// }
// public class Thread_class{
//     public static void main(String[] args){
//         thread t = new thread();
//         t.start();
//         t.interrupt();
//     }
// }




//4th prog --- Daemon and join
// class thread extends Thread{
//     public void run(){
//         int i=0;
//         while(true){
//             System.out.println(i++);
//             // try{
//             // Thread.sleep(1000);
//             // }
//             // catch(Exception e){System.out.print(e);}
//         }
//     }
// }
// public class Thread_class{
//     public static void main(String[] args){
//         thread t = new thread();
//         t.setDaemon(true); // jabtak main tab tak thread chlega... frr auto terminate.
//         t.start();

//         Thread mainthread = Thread.currentThread();
//         try{mainthread.join();}// jbtak thread tab tak main chlega.
//         catch(Exception e){

//         }
        
//     }
// }



//5th prog -- Yield
class thread extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println(i++);
            // try{
            // Thread.sleep(1000);
            // }
            // catch(Exception e){System.out.print(e);}
        }
    }
}
public class Thread_class{
    public static void main(String[] args){
        thread t = new thread();
        t.start();
        int x = 0;
        while(true){
            System.out.print(x+++"main");
            Thread.yield();// dusre thread ko jayda tym clne ka moka dena.
        }
    }
}


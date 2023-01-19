public class Threading extends Thread {
    public void run(){
        int i=0;
        while(true){
            System.out.println(i+": world");
            i++;
        }
    }
    public static void main(String [] args){
        Threading nt = new Threading();
        nt.start();
        int i=0;
        while(true){
            System.out.println(i+": hello");
            i++;
        }
    }
    
}

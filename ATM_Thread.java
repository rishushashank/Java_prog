class ATM{
    synchronized public void checkbalance(String str){
        System.out.println(str+": your balance");
        try{Thread.sleep(100000);}catch(Exception e){}
    }
    synchronized public void withdrawn(int x){
        System.out.println(x+": Amount withdrwn");
    }
}

class customer extends Thread{
    String name;
    int amount;
    ATM atm;
    customer(String name,int x,ATM atm){
        this.name = name;
        this.amount = x;
        this.atm = atm;
    }
    public  void use_atm(){
        atm.checkbalance(name);
        atm.withdrawn(amount);
    }
    public void run(){
        use_atm();
    }
}
public class ATM_Thread {
    public static  void main(String[] args){
        String s  = "rishu";
        int x = 2000;
        ATM atm = new ATM();
        customer c1 = new customer(s,x,atm);
        customer c2 = new customer("shashan",80900,atm);
        c1.start();
        c2.start();
    }
   
}

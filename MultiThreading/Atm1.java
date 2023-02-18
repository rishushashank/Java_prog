public class Atm1 {
    public static void main(String[] args){
        ATM atm = new ATM();
        customer c1 = new customer("rishu",atm,200000);
        customer c2 = new customer("shahsank",atm,20000);
        c1.start();
        c2.start();
    }
}

class ATM {
    synchronized void checkBalance(String name){
        System.out.print(name+" "+" Checking ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("Balance");
    }

    synchronized void withdrawn(String name,int amount){
        System.out.print(name+" withdrawing ");
        try{Thread.sleep(1000);}catch(Exception e){}
        System.out.println("amount");
    }
}

class customer extends Thread{
    String name;
    int amount;
    ATM atm;
    customer(String str,ATM a,int amt){
        super(str);
        name = str;
        atm = a;
        amount = amt;
    }
    public void useAtm(){
        atm.checkBalance(name);
        atm.withdrawn(name, amount);
    }
    @Override
    public void run(){
        useAtm();
    }

}
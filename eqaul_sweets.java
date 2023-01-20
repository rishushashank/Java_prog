import java .util.*;
public class eqaul_sweets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char l,f;
        int t=0;
        int n= str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            l = str.charAt(i);
            f = str.charAt(n--);
            t++;
            if(l != f){
                t--;
                System.out.println(t);
                return;
            }
        }
        System.out.println(t);

        }
}

import java.util.*;
public class Naivy_approach {
    public static void main(String[] args){
        String arr[] = {"1","2","3","+","*","#"};
        String operations = "+-/%*";
        Stack<String> st = new Stack<>();
        for(String s : arr){
            
            //if(s == "+"||s == "/"||s == "*"||s == "%"|| s=="-"){
            if(operations.contains(s)){
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                switch(s){
                    case "+":
                    st.push(String.valueOf(a+b));
                    break;
                    case "-":
                    st.push(String.valueOf(a-b));
                    break;
                    case "/":
                    st.push(String.valueOf(a/b));
                    break;
                    case "%":
                    st.push(String.valueOf(a%b));
                    break;
                    case "*":
                    st.push(String.valueOf(a*b));
                    break;
                }
            }else{
                st.push(s);
            }
        }
        System.out.print(st.pop());

    }
}

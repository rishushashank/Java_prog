import java.util.*;
public class isomorphic_string {
    public static void main(String[] args){
        String a= "egg";
        String b = "awd";
        HashMap<Character,Character> map1 = new HashMap<>();
        if(a.length() != b.length()){
            System.out.print("Not an isomphoric");
            return;
        }
        for(int i=0;i<a.length();i++){
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if(map1.containsKey(c1)){
                //System.out.print(c1+" "+c2+" "+map1.get(c1));
                if(c2 != map1.get(c1)){
                System.out.print("Not an isomphoric");
                return;}
            }
            map1.put(c1,c2);
        }
        System.out.print("an isomphoric");

        //traversel
        // for(Map.Entry<Character,Integer> element : map1.entrySet() ){
        //     element.getValue();
        //     element.getKey();
        // }

    }
}

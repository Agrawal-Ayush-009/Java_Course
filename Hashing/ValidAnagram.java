import java.util.*;

public class ValidAnagram{
    public static boolean isValidAnagram(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
                map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
            }


            for(int i = 0; i < s2.length(); i++){
                char ch = s2.charAt(i);
                if(map.containsKey(ch)){
                    if(map.get(ch) == 1){
                        map.remove(ch);
                    }else{
                        map.put(ch, map.get(ch) - 1);
                    }
                }else{
                    return false;
                }
            }

            if(map.isEmpty()){
                return true;
            }else{
                return false;
            }


    }
    public static void main(String[] args) {
        String s1 = "keen";
        String s2 = "knee";

        if(isValidAnagram(s1, s2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
       
    }    
}

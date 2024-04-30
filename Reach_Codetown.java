/*Jai Shri Krishna*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Reach_Codetown{
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while(t-- > 0){
           String s1 = sc.next();
           String s2 = "CODETOWN";
           boolean flag = true;
           for(int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(set.contains(c1)){
                if(!set.contains(c2)){
                    flag = false;
                    break;
                }
            }else{
                if(set.contains(c2)){
                    flag = false;
                    break;
                }
            }
           }

           if(flag){
            System.out.println("YES");
           }else{
            System.out.println("NO");
           }
        }
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader(){
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt(){
            return Integer.parseInt(next());
        }
 
        long nextLong(){
            return Long.parseLong(next());
        }
 
        double nextDouble(){
            return Double.parseDouble(next());
        }
 
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
}
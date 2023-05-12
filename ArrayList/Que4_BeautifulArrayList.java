import java.util.ArrayList;

public class Que4_BeautifulArrayList {
    public static ArrayList<Integer> beautifulArrayList2(int n) {
        ArrayList<Integer> res = new ArrayList<>();

        divideConquer(1, 1, res, n);

        return res;
    }

    public static void divideConquer (int start, int incrmnt, ArrayList<Integer> res, int n) {
        if(start + incrmnt > n) {
            res.add(start);
            return;
        }

        divideConquer(start, 2*incrmnt, res, n);

        divideConquer(start + incrmnt, 2*incrmnt, res, n);
    }


    public static ArrayList<Integer> beautifulArrayList (int n) {
       ArrayList<Integer> ans = new ArrayList<>();
       
       ans.add(1);

       for(int i = 2; i <= n; i++) {
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(Integer e : ans) {
            if(2*e - 1 <= n) {
                temp.add(2*e -1);
            }
        }

        for(Integer e : ans) {
            if(2*e <= n) {
                temp.add(2*e);
            }
        }

        ans = temp;
       }

       return ans;
    }
    public static void main (String args[]) {

        int n = 4;

        ArrayList<Integer> ans =  beautifulArrayList(n);

        System.out.println(ans);

    }
}
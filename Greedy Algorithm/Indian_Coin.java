import java.util.ArrayList;

public class Indian_Coin {
    public static void main(String[] args) {
        int coin[] = {2000,500,100,50,20,10,5,2,1};
        int val = 398;
        ArrayList<Integer> ans = new ArrayList<>();
        int minNo_Coins = 0;
        for(int i = 0; i < coin.length; i++) {
            if(coin[i] <= val) {
                while(coin[i] <= val) {
                    val = val - coin[i];
                    minNo_Coins++;
                    ans.add(coin[i]);
                }
            }
        }
       System.out.println("total no. of coins are = " + minNo_Coins);
       System.out.println("coins are = " + ans);
    }    
}
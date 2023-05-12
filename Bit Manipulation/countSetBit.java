public class countSetBit {
    public static int countSetBitNum (int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
       

        return count;
    }

    public static void main (String args[]) {
        System.out.println(countSetBitNum(31));
        
    }
}
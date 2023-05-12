public class PairingFriends {
    public static int pairingProblem(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }

        int remainSingle = pairingProblem(n-1);
        int getPaired = (n-1) * pairingProblem(n-2);// (n-1) is choice given to each friend who want be in a pair;

        return remainSingle + getPaired;
    }
    public static void main (String args[]) {
        System.out.println(pairingProblem(3));
    }
}
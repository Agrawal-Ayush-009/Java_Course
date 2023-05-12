public class OOPS5 {
    public static void main (String args[]) {
        Queen q = new Queen();
        q.moves();
        
    }
}

interface chessPlayer {

    void moves();

}

class Queen implements chessPlayer {

    public void moves() {
        System.out.println("left, right, up, down,diagonal (in all  directions)");
    }
}

class Rook implements chessPlayer {

    public void moves() {
        System.out.println("left, right, up, down");
    }
}

class King implements chessPlayer {

    public void moves() {
        System.out.println("left, right, up, down,diagonal only 1 step");
    }
}
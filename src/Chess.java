public class Chess  {

    public void INIT() {
        Board board = new Board();
        board.createBoard();
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
        chess.INIT();
    }
}

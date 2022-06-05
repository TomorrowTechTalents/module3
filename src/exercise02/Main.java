package exercise02;

public class Main {
    public static void main(String[] args) {
        // versus board-based game

        Card[][] decks = new Card[50][2];

        Board board = new VersusBoard(decks);
    }
}

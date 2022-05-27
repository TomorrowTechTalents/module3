package exercise02;

public class VersusBoard implements Board {
    Card[] deck1 = new Card[80];
    Card[] deck2 = new Card[80];
    Card[] deck3 = new Card[80];
    Card[] deck4 = new Card[80];
    Card[] deck5 = new Card[80];

    int numberOfAttackCardsOnBoard;

    @Override
    public void insertDeck() {

    }

    @Override
    public void receiveAttackCard() {
        if (numberOfAttackCardsOnBoard >= 34) {
            System.out.println("não cabe mais carta de ataque no tabuleiro");
        }
    }

    @Override
    public void checkIfThereIsAWinner(Player[] players) {
        for (Player player : players) {
            if (player.getLifePoints() > 0) {
                return;
            }
        }

        System.out.println("Parabéns!!");
    }
}

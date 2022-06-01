package exercise02;

public class PartyBoard implements Board {
    private Card[] deck1 = new Card[80];
    Card[] deck2 = new Card[80];
    Card[] deck3 = new Card[80];
    Card[] deck4 = new Card[80];
    Card[] deck5 = new Card[80];

    private int numberOfAttackCardsOnBoard;

    @Override
    public void insertDeck(Card[] deck) {
        this.deck1 = deck;
    }

    @Override
    public void receiveAttackCard(Card attackCard) {
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

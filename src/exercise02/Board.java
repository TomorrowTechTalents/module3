package exercise02;

public interface Board {
    void insertDeck(Card[] deck);
    void receiveAttackCard(Card attackCard);
    void checkIfThereIsAWinner(Player[] players);
}

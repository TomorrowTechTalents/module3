package exercise02;

public interface Board {
    void insertDeck(Card[] deck, int deckIndex);
    void receiveAttackCard(AttackCard attackCard, int playerIndex);
    void checkIfThereIsAWinner(Player[] players);
}

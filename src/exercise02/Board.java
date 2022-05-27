package exercise02;

public interface Board {
    void insertDeck();
    void receiveAttackCard();
    void checkIfThereIsAWinner(Player[] players);
}

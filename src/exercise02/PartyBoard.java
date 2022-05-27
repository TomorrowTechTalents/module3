package exercise02;

public class PartyBoard implements Board {
    Card[] deck1 = new Card[50];
    Card[] deck2 = new Card[50];

    int numberOfAttackCardsOnSide1 = 0;
    int numberOfAttackCardsOnSide2 = 0;
    int numberOfSpecialAttackCardsOnSide1 = 0;
    int numberOfSpecialAttackCardsOnSide2 = 0;

    @Override
    public void insertDeck() {

    }

    @Override
    public void receiveAttackCard() {
        if (numberOfAttackCardsOnSide1 > 5) {
            System.out.println("Não cabe mais carta de ataque");
        } else {
            numberOfAttackCardsOnSide1++;
        }

        if (numberOfSpecialAttackCardsOnSide1 > 2) {
            System.out.println("Não cabe mais carta de ataque especial");
        } else {
            numberOfSpecialAttackCardsOnSide1++;
        }
    }

    @Override // depois refatorar com early returns
    public void checkIfThereIsAWinner(Player[] players) {
        if (players[0].getLifePoints() <= 0 && players[1].getLifePoints() > 0) {
            System.out.println("Jogador 2 venceu!! Parabéns!!! Desejamos mais sorte na próxima, Jogador 1!!!");
        } else if (players[1].getLifePoints() <= 0 && players[0].getLifePoints() > 0) {
            System.out.println("Jogador 1 venceu!! Parabéns!!! Desejamos mais sorte na próxima, Jogador 2!!!");
        } else if (players[0].getLifePoints() <= 0 && players[1].getLifePoints() <= 0) {
            System.out.println("empate");
        }
    }
}

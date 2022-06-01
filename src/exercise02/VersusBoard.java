package exercise02;

public class VersusBoard implements Board {
    private Card[] deck1 = new Card[50];
    Card[] deck2 = new Card[50];

    private int numberOfAttackCardsOnSide1 = 0;
    int numberOfAttackCardsOnSide2 = 0;
    private int numberOfSpecialAttackCardsOnSide1 = 0;
    int numberOfSpecialAttackCardsOnSide2 = 0;

    @Override
    public void insertDeck(Card[] deck) {
        this.deck1 = deck; // corrigir, talvez passando index
    }

    @Override
    public void receiveAttackCard(Card attackCard) { //considerei que uma carta de ataque especial não conta como carta de ataque
        if (attackCard instanceof AttackCard && numberOfAttackCardsOnSide1 > 5) { // fazer pro side2 tambem
            System.out.println("Não cabe mais carta de ataque");
        } else {
            numberOfAttackCardsOnSide1++;
        }

        if (attackCard instanceof SpecialAttackCard && numberOfSpecialAttackCardsOnSide1 > 2) {
            System.out.println("Não cabe mais carta de ataque especial");
        } else {
            numberOfSpecialAttackCardsOnSide1++;
        }
    }

    @Override
    public void checkIfThereIsAWinner(Player[] players) {
        if (players[0].getLifePoints() <= 0 && players[1].getLifePoints() > 0) {
            System.out.println("Jogador 2 venceu!! Parabéns!!! Desejamos mais sorte na próxima, Jogador 1!!!");

            return;
        }

        if (players[1].getLifePoints() <= 0 && players[0].getLifePoints() > 0) {
            System.out.println("Jogador 1 venceu!! Parabéns!!! Desejamos mais sorte na próxima, Jogador 2!!!");

            return;
        }

        if (players[0].getLifePoints() <= 0 && players[1].getLifePoints() <= 0) {
            System.out.println("empate");
        }
    }
}

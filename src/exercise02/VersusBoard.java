package exercise02;

public class VersusBoard implements Board {
    private static final byte NUMBER_OF_PLAYERS = 2;
    private static final byte CARDS_PER_DECK = 50;
    static final byte MAXIMUM_NUMBER_OF_ATTACK_CARDS_PER_SIDE = 5;
    static final byte MAXIMUM_NUMBER_OF_SPECIAL_ATTACK_CARDS_PER_SIDE = 5;

    private final Card[][] decks = new Card[CARDS_PER_DECK][NUMBER_OF_PLAYERS];
    final int[] numberOfAttackCardsOnSides = new int[NUMBER_OF_PLAYERS];
    final int[] numberOfSpecialAttackCardsOnSides = new int[NUMBER_OF_PLAYERS];

    VersusBoard(Card[][] decks) {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            this.insertDeck(decks[i], i);
        }
    }

    @Override
    public void insertDeck(Card[] deck, int deckIndex) {
        this.decks[deckIndex] = deck;
    }

    @Override // botar uns returns?
    public void receiveAttackCard(AttackCard attackCard, int playerIndex) { //considerei que uma carta de ataque especial não conta como carta de ataque

        attackCard.beReceivedOnVersusBoard(this, playerIndex);

//        if (attackCard instanceof AttackCard) {
//            if (numberOfAttackCardsOnSides[sideIndex] > 5) {
//                System.out.println("não cabe mais carta de ataque no lado " + sideIndex + 1 + " do campo");
//            } else {
//                numberOfAttackCardsOnSides[sideIndex]++;
//            }
//        }
//
//        if (attackCard instanceof SpecialAttackCard) {
//            if (numberOfSpecialAttackCardsOnSides[sideIndex] > 2) {
//                System.out.println("não cabe mais carta de ataque especial no lado " + sideIndex + 1 + " do campo");
//            } else {
//                numberOfSpecialAttackCardsOnSides[sideIndex]++;
//            }
//        }
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

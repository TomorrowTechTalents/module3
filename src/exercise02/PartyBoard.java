package exercise02;

import java.util.ArrayList;
import java.util.List;

public class PartyBoard implements Board {
    private static final byte NUMBER_OF_PLAYERS = 5;
    private Card[] deck1 = new Card[80];
    Card[] deck2 = new Card[80];
    Card[] deck3 = new Card[80];
    Card[] deck4 = new Card[80];
    Card[] deck5 = new Card[80];

    private int numberOfAttackCardsOnBoard = 0;

    @Override
    public void insertDeck(Card[] deck) {
        this.deck1 = deck;
    }

    @Override
    public void receiveAttackCard(Card attackCard) {
        if (this.numberOfAttackCardsOnBoard >= 34) {
            System.out.println("não cabe mais carta de ataque no tabuleiro");
        } else {
            this.numberOfAttackCardsOnBoard++;
        }
    }

    @Override
    public void checkIfThereIsAWinner(Player[] players) {

        List<Integer> indexesOfOperationalPlayers = new ArrayList<>();

        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            if (players[i].getLifePoints() > 0) {
                indexesOfOperationalPlayers.add(i);
            }
        }

        if (indexesOfOperationalPlayers.size() == 1) {
            System.out.println("Parabéns ao jogador " + indexesOfOperationalPlayers.get(0) + 1 + "!!");
            System.out.println("Mais sorte aos demais jogadores!!!");

            return;
        }

        if (indexesOfOperationalPlayers.size() < 1) {
            System.out.println("empate");
        }
    }
}

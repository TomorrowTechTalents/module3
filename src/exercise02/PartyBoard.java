package exercise02;

import java.util.ArrayList;
import java.util.List;

public class PartyBoard implements Board {
    private static final byte NUMBER_OF_PLAYERS = 5;
    static final byte MAXIMUM_NUMBER_OF_ATTACK_CARDS = 34;

    private final Card[][] decks = new Card[5][80];

    int numberOfAttackCardsOnBoard = 0;

    @Override
    public void insertDeck(Card[] deck, int deckIndex) {
        this.decks[deckIndex] = deck;
    }

    @Override
    public void receiveAttackCard(AttackCard attackCard, int _unused) {
        attackCard.beReceivedOnPartyBoard(this);
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

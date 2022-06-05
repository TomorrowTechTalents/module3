package exercise02;

abstract class AttackCardOnPartyBoardRules {
    static void evaluate(PartyBoard partyBoard) {
        if (partyBoard.numberOfAttackCardsOnBoard >= PartyBoard.MAXIMUM_NUMBER_OF_ATTACK_CARDS ) {
            System.out.println("não cabe mais carta de ataque no tabuleiro");
        }

        partyBoard.numberOfAttackCardsOnBoard++;
    }
}

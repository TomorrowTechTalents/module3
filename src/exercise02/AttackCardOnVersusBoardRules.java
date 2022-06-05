package exercise02;

abstract class AttackCardOnVersusBoardRules {
    static void evaluate(VersusBoard versusBoard, int sideIndex) {
        if (versusBoard.numberOfAttackCardsOnSides[sideIndex] >= VersusBoard.MAXIMUM_NUMBER_OF_ATTACK_CARDS_PER_SIDE) {
            System.out.println("não cabe mais carta de ataque no lado " + sideIndex + 1 + " do campo");
        }

        versusBoard.numberOfAttackCardsOnSides[sideIndex]++;
    }
}

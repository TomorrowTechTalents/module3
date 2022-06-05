package exercise02;

abstract class SpecialAttackCardOnVersusBoardRules {
    static void evaluate(VersusBoard versusBoard, int sideIndex) {
        if (versusBoard.numberOfSpecialAttackCardsOnSides[sideIndex] >=
            VersusBoard.MAXIMUM_NUMBER_OF_SPECIAL_ATTACK_CARDS_PER_SIDE) {
            System.out.println("não cabe mais carta de ataque especial no lado " + sideIndex + 1 + " do campo");
        }

        versusBoard.numberOfSpecialAttackCardsOnSides[sideIndex]++;
    }
}

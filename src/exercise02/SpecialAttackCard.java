package exercise02;

public class SpecialAttackCard extends AttackCard implements SpecialEffect {

    SpecialAttackCard(String name, CardType type, int cost, int power, int endurance) {
        super(name, type, cost, power, endurance); // precisa desse construtor?
    }

    @Override
    public void displaySpecialEffect() {
        System.out.println("Magic");
    }

    @Override
    public void beReceivedOnVersusBoard(VersusBoard versusBoard, int sideIndex) {
        SpecialAttackCardOnVersusBoardRules.evaluate(versusBoard, sideIndex);
    }
}

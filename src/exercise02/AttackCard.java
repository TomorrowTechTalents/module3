package exercise02;

class AttackCard extends Card {
    private final int power;
    private final int endurance;

    AttackCard(String name, CardType type, int cost, int power, int endurance) {
        super(name, type, cost);
        this.power = power;
        this.endurance = endurance;
    }

    int getPower() {
        return this.power;
    }

    int getEndurance() {
        return this.endurance;
    }
}

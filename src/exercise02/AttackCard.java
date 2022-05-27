package exercise02;

public class AttackCard extends Card {
    int power;
    int endurance;

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

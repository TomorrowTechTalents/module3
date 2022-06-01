package exercise02;

class Card {
    enum CardType {
        ATTACK
    }

    private final String name;
    private final CardType type;
    private final int cost;

    Card(String name, CardType type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    String getName() {
        return this.name;
    }

    CardType getType() {
        return this.type;
    }

    int getCost() {
        return this.cost;
    }
}

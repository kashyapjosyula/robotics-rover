import java.util.Arrays;

public enum CardinalDirections {

    N(0), E(90), S(180), W(270);

    private final int cardinalDirection;

    CardinalDirections(int cardinalDirection) {
        this.cardinalDirection = cardinalDirection;

    }

    public int value() {
        return cardinalDirection;

    }

    public static CardinalDirections valueOf(int value) {

        return Arrays.stream(values())
                .filter(cardinalDirection -> cardinalDirection.cardinalDirection == value)
                .findFirst().get();


    }
}

public class Position {

    private int x;

    private int y;

    private int cardinalDirection;


    public Position(int x, int y, int cardinalDirection) {
        this.x = x;
        this.y = y;
        this.cardinalDirection = cardinalDirection;
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCardinalDirection() {
        return cardinalDirection;
    }

    public void setCardinalDirection(int cardinalDirection) {
        this.cardinalDirection = cardinalDirection;
    }


    public boolean equals(Position p1) {
        if (p1.getX() == this.x && p1.getY() == this.getY() && p1.getCardinalDirection() == this.getCardinalDirection())
            return true;
        else
            return false;
    }
}

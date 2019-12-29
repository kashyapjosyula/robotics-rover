
public class Rover {

    /**
     * Method to get the Rover's final position.
     *
     * @param currentPosition
     * @param instructions
     * @param plateauLimits
     * @return
     * @throws UnknownInstructionException, OutOfPlateauLimitsException
     */

    public Position getRoverPosition(Position currentPosition, char cardinalDirection, String instructions, Coordinates plateauLimits)
            throws UnknownInstructionException, OutOfPlateauLimitsException, InvalidInputException{

        if (instructions == null || instructions.isEmpty()) {
            return currentPosition;
        }

        if (cardinalDirection != 'N' && cardinalDirection != 'E' && cardinalDirection != 'W' && cardinalDirection != 'S') {
            throw new InvalidInputException("Invalid Input passed");
        }

        if (currentPosition.getX() > plateauLimits.getX() || currentPosition.getX() < 0 || currentPosition.getY() < 0 ||
                currentPosition.getY()> plateauLimits.getY()) {
            throw new InvalidInputException("Invalid Input passed");

        }

        currentPosition.setCardinalDirection(CardinalDirections.valueOf(Character.toString(cardinalDirection)).value());
        int currentCardinalDirection = currentPosition.getCardinalDirection();
        for (int i = 0 ; i < instructions.length(); i++) {
            char instruction = instructions.charAt(i);

            switch (instruction) {

                case 'L':
                    currentCardinalDirection = (currentCardinalDirection - 90) % 360;
                    if (currentCardinalDirection < 0) {
                        currentCardinalDirection = 360 + currentCardinalDirection;
                    }
                    break;

                case 'M':
                    if (currentCardinalDirection == 0) {
                        currentPosition.setY(currentPosition.getY() + 1);
                    }
                    else if (currentCardinalDirection == 90) {
                        currentPosition.setX(currentPosition.getX() + 1);
                    }

                    else if (currentCardinalDirection == 180) {
                        currentPosition.setY(currentPosition.getY() - 1);
                    }

                    else if (currentCardinalDirection == 270) {
                        currentPosition.setX(currentPosition.getX() - 1);
                    }

                    if (currentPosition.getX() > plateauLimits.getX() || currentPosition.getY() > plateauLimits.getY() ||
                            currentPosition.getX() < 0 || currentPosition.getY() < 0) {
                        throw new OutOfPlateauLimitsException("The rover will fall off the plateau");
                    }
                    break;

                case 'R':
                    currentCardinalDirection = (currentCardinalDirection + 90) % 360;
                    if (currentCardinalDirection < 0) {
                        currentCardinalDirection = 360 + currentCardinalDirection;
                    }
                    break;

                default:
                    throw new UnknownInstructionException("Unknown Instruction passed - "+instruction);
            }
        }
        currentPosition.setCardinalDirection(currentCardinalDirection);

        System.out.println(currentPosition.getX()+ " "+ currentPosition.getY()+ " "+
                CardinalDirections.valueOf(currentPosition.getCardinalDirection()));
        return currentPosition;
    }
}

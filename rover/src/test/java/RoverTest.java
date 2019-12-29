import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoverTest {


    @Before
    public void before() {

    }

    @Test
    public void getRoverPosition() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 3;
        int y = 3;
        char c = 'E';
        String instructions = "MMRMMRMRRM";

        Position currentPosition = new Position(x, y);


        int outputX = 5;
        int outputY = 1;
        char outputC = 'E';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }


    @Test
    public void getRoverPosition_1() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 1;
        int y = 2;
        char c = 'N';
        String instructions = "LMLMLMLMM";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }


    @Test(expected = OutOfPlateauLimitsException.class)
    public void getRoverPosition_Exception() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(2,2);

        int x = 1;
        int y = 2;
        char c = 'N';
        String instructions = "LMLMLMLMM";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }


    @Test(expected = UnknownInstructionException.class)
    public void getRoverPosition_Exception_1() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 1;
        int y = 2;
        char c = 'N';
        String instructions = "LMLMLMLMT";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }


    @Test(expected = InvalidInputException.class)
    public void getRoverPosition_Exception_InvalidInputException_1() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = -1;
        int y = 2;
        char c = 'N';
        String instructions = "LMLMLMLMT";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }

    @Test(expected = InvalidInputException.class)
    public void getRoverPosition_Exception_InvalidInputException_2() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 1;
        int y = -2;
        char c = 'N';
        String instructions = "LMLMLMLMT";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }

    @Test(expected = InvalidInputException.class)
    public void getRoverPosition_Exception_InvalidInputException_3() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 6;
        int y = 2;
        char c = 'N';
        String instructions = "LMLMLMLMT";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }

    @Test(expected = InvalidInputException.class)
    public void getRoverPosition_Exception_InvalidInputException_4() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 1;
        int y = 6;
        char c = 'N';
        String instructions = "LMLMLMLMT";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }

    @Test(expected = InvalidInputException.class)
    public void getRoverPosition_Exception_InvalidInputException_5() throws Exception{
        Rover rover = new Rover();

        Coordinates plateauLimits = new Coordinates(5,5);

        int x = 1;
        int y = 2;
        char c = 'K';
        String instructions = "LMLMLMLMT";
        Position currentPosition = new Position(x, y);


        int outputX = 1;
        int outputY = 3;
        char outputC = 'N';


        Position finalPosition = new Position(outputX,outputY,CardinalDirections.valueOf(Character.toString(outputC)).value());
        assertTrue(finalPosition.equals(rover.getRoverPosition(currentPosition, c, instructions, plateauLimits)));

    }

    @After
    public void tearDown() throws Exception {
    }
}
import Exceptions.PilotException;
/**
 * Created by Nav on 22-3-2015.
 * Faalkans van een piloot:
 * F(piloot) = 0, 005
 */
public class Pilot extends Part{
    void calculate() throws PilotException
    {
        if (Math.random() < .005)
            throw new PilotException();
    }
}

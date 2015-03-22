import Exceptions.FlapException;
/**
 * Created by Nav on 22-3-2015.
 * Faalkans van Flap:
 * F(flap) = 0, 0005
 */
public class Flap extends Part{

    void calculate() throws FlapException
    {
        // F(flap) = 0.0005
        if (Math.random() < .0005)
            throw new FlapException();
    }

}

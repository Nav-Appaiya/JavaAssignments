import Exceptions.*;
/**
 * Created by Nav on 22-3-2015.
 * Faalkans van Motor:
 * F(motor) = 0, 001
 */
public class Engine extends Part{

    void calculate() throws EngineException
    {
        // F(motor) = 0.001
        if (Math.random() < .001)
            throw new EngineException();
    }
}

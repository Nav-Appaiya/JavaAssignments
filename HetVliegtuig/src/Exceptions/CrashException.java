package Exceptions;

/**
 * Created by Nav on 22-3-2015.
 * Zorgen dat de exception de juiste klasse
 * extend.
 */
public class CrashException extends Exception{

    public String message;

    public CrashException(String s)
    {
        this.message = s;
    }

    public String getMessage()
    {
        return message;
    }


}

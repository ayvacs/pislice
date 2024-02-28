package lol.pislice;

/**
 * The <code>PiSliceException</code> is thrown when things are amiss. It is thrown instead of the appropriate Java exception (i.e. <code>IndexOutOfBoundsException</code>.
 */


import java.lang.RuntimeException;


public class PiSliceException extends RuntimeException
{
    /**
     * Construct a new PiSliceException with {@code null} as its detail message.
     */
    public PiSliceException()
    {
        super();
    }

    /**
     * Construct a new PiSliceException with the specified detail message.
     * @param errorMessage a message with more information.
     */
    public PiSliceException(String message)
    {
        super(message);
    }
}
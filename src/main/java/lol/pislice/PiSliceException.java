package lol.pislice;


import java.lang.RuntimeException;


/**
 * The <code>PiSliceException</code> is thrown when things are amiss. It is thrown instead of the appropriate Java exception (i.e. <code>IndexOutOfBoundsException</code>.
 */
 public class PiSliceException extends RuntimeException
{
    /**
     * Construct a PiSliceException with <code>null</code> as its detail message.
     */
    public PiSliceException()
    {
        super();
    }

    /**
     * Construct a PiSliceException with the specified detail message.
     * @param message a message with more information.
     */
    public PiSliceException(String message)
    {
        super(message);
    }
}
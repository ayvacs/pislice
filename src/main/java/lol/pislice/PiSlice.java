package lol.pislice;


import java.lang.IndexOutOfBoundsException;


public class PiSlice
{
    // The first 100 digits of pi without a decimal point
    private static final String PI_DIGITS = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";

    private int from;
    private int to;

    public PiSlice (int number1, int number2)
    {
        from = number1;
        to = number2;
    }

    public int decode() throws PiSliceException
    {
        try
        {
            return PI_DIGITS.substring(from, to);
        }
        catch (IndexOutOfBoundsException e)
        {
            throw new PiSliceException("The indexes (" + from + ", " + to + ") are out of bounds.");
        }
    }
}
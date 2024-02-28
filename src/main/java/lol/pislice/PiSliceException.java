package lol.pislice;


import java.lang.RuntimeException;


public class PiSliceException extends RuntimeException
{
    public PiSliceException(String errorMessage)
    {
        super(errorMessage);
    }
}
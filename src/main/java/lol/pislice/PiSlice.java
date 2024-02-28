package lol.pislice;


import java.lang.IndexOutOfBoundsException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Math;


public class PiSlice
{
    // The first 1000 digits of pi without a decimal point
    private static final String PI_DIGITS = "3141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067982148086513282306647093844609550582231725359408128481117450284102701938521105559644622948954930381964428810975665933446128475648233786783165271201909145648566923460348610454326648213393607260249141273724587006606315588174881520920962829254091715364367892590360011330530548820466521384146951941511609433057270365759591953092186117381932611793105118548074462379962749567351885752724891227938183011949129833673362440656643086021394946395224737190702179860943702770539217176293176752384674818467669405132000568127145263560827785771342757789609173637178721468440901224953430146549585371050792279689258923542019956112129021960864034418159813629774771309960518707211349999998372978049951059731732816096318595024459455346908302642522308253344685035261931188171010003137838752886587533208381420617177669147303598253490428755468731159562863882353787593751957781857780532171226806613001927876611195909216420198";

    
    /**
     * Return the inner representation of π without a decimal point.
     * @return String
     */
    public static String getCap()
    {
        return PI_DIGITS;
    }

    private long from;
    private long to;


    /**
     * Create a new PiSlice from two longs.
     * @param numberFrom The beginning of the substring
     * @param numberTo The end of the substring
     */
    public PiSlice (long numberFrom, long numberTo)
    {
        from = numberFrom;
        to = numberTo;
    }

    /**
     * Create a new PiSlice from two integers.
     * @param numberFrom The beginning of the substring
     * @param numberTo The end of the substring
     */
    public PiSlice (int numberFrom, int numberTo)
    {
        from = Math.toIntExact(numberFrom);
        to = Math.toIntExact(numberTo);
    }

    /**
     * Create a new PiSlice from two PiSlices.
     * @param numberFrom The beginning of the substring
     * @param numberTo The end of the substring
     */
    public PiSlice(PiSlice numberFrom, PiSlice numberTo)
    {
        from = numberFrom.getInt();
        to = numberTo.getInt();
    }
    
    /** 
     * Parses the PiSlice as a signed decimal long.
     * @return long
     * @throws PiSliceException if the indices have not been defined or are out of bounds
     */
    public long getLong() throws PiSliceException
    {
        long result;

        try
        {
            result = Long.parseLong(PI_DIGITS.substring(Math.toIntExact(from), Math.toIntExact(to)));
            return result;
        }
        catch (IndexOutOfBoundsException e)
        {
            throw new PiSliceException("The indices (" + from + ", " + to + ") have not been defined or are out of bounds for a long.");
        }
    }

     /** 
     * Parses the PiSlice as a signed decimal integer.
     * @return int
     * @throws PiSliceException if the indices have not been defined or are out of bounds
     */
    public int getInt() throws PiSliceException
    {
        int result;

        try
        {
            result = Math.toIntExact(getLong());
            return result;
        }
        catch (IndexOutOfBoundsException e)
        {
            throw new PiSliceException("The indices (" + from + ", " + to + ") have not been defined or are out of bounds for an integer.");
        }
    }

    
    /** 
     * Returns a String object representing this object's value in a human-friendly format.
     * @return String
     */
    public String toString()
    {
        String s;

        try {
            s = ("(" + from + ", " + to + ") => ") + Long.toString(getLong());
            return s;
        }
        catch (Exception e)
        {
            throw new PiSliceException("Something went amiss");
        }
    }
}
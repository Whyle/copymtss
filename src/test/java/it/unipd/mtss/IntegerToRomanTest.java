package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class IntegerToRomanTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void IntergerToRomanTest_IVXL()
    {   
        assertEquals("", IntegerToRoman.convert(0));
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("III", IntegerToRoman.convert(3));
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("XII", IntegerToRoman.convert(12));
        assertEquals("XVII", IntegerToRoman.convert(17));
        assertEquals("XX", IntegerToRoman.convert(20));
        assertEquals("XXIV", IntegerToRoman.convert(24));
        assertEquals("XXV", IntegerToRoman.convert(25));
        assertEquals("XXXVIII", IntegerToRoman.convert(38));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIV", IntegerToRoman.convert(44));
        assertEquals("XLVI", IntegerToRoman.convert(46));
        assertEquals("L", IntegerToRoman.convert(50));
    }
}
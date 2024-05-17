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

    @Test
    public void IntergerToRomanTest_CDM()
    {  
        assertEquals("LX", IntegerToRoman.convert(60));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("XCIV", IntegerToRoman.convert(94));
        assertEquals("XCV", IntegerToRoman.convert(95));
        assertEquals("XCVIII", IntegerToRoman.convert(98));
        assertEquals("XCIX", IntegerToRoman.convert(99));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("CXL", IntegerToRoman.convert(140));
        assertEquals("CXLVI", IntegerToRoman.convert(146));
        assertEquals("CLXXX", IntegerToRoman.convert(180));
        assertEquals("CXC", IntegerToRoman.convert(190));
        assertEquals("CDXL", IntegerToRoman.convert(440));
        assertEquals("CDXLIV", IntegerToRoman.convert(444));
        assertEquals("CDL", IntegerToRoman.convert(450));
        assertEquals("CDXC", IntegerToRoman.convert(490));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("DCIII", IntegerToRoman.convert(603));
        assertEquals("DCCC", IntegerToRoman.convert(800));
        assertEquals("CM", IntegerToRoman.convert(900));
        assertEquals("CMXC", IntegerToRoman.convert(990));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
        assertEquals("MCDXL", IntegerToRoman.convert(1440));
        assertEquals("MCDL", IntegerToRoman.convert(1450));
        assertEquals("MCDXC", IntegerToRoman.convert(1490));
        assertEquals("MD", IntegerToRoman.convert(1500));
        assertEquals("MDCCC", IntegerToRoman.convert(1800));
        assertEquals("MCM", IntegerToRoman.convert(1900));
        assertEquals("MCMXC", IntegerToRoman.convert(1990));
        assertEquals("MCMXCIX", IntegerToRoman.convert(1999));
        assertEquals("MMMMCMXCIX", IntegerToRoman.convert(4999));
    }
}
////////////////////////////////////////////////////////////////////
// [ELISA] [MARCHIORO] [2111941]
// [ANTONIO] [TANG] [2111017]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntergerToRomanTest {
    
    @Test
	public void testConvert1() {
        int num = 1;
        String ris = IntegerToRoman.convert(num);
        assertEquals("I", ris);
	}

    @Test
	public void testConvert2() {
        int num = 2;
        String ris = IntegerToRoman.convert(num);
        assertEquals("II", ris);
	}

    @Test
	public void testConvert3() {
        int num = 3;
        String ris = IntegerToRoman.convert(num);
        assertEquals("III", ris);
	}

    @Test
	public void testConvert4() {
        int num = 4;
        String ris = IntegerToRoman.convert(num);
        assertEquals("IV", ris);
	}

    @Test
	public void testConvert5() {
        int num = 5;
        String ris = IntegerToRoman.convert(num);
        assertEquals("V", ris);
	}

    @Test
	public void testConvert6() {
        int num = 6;
        String ris = IntegerToRoman.convert(num);
        assertEquals("VI", ris);
	}

    @Test
	public void testConvert7() { 
		System.out.println("Test convert numero 7");
        int num = 7;
        String ris = IntegerToRoman.convert(num);
        assertEquals("VII", ris);
	}

    @Test
	public void testConvert8() {
        int num = 8;
        String ris = IntegerToRoman.convert(num);
        assertEquals("VIII", ris);
	}

    @Test
	public void testConvert9() {
        int num = 9;
        String ris = IntegerToRoman.convert(num);
        assertEquals("IX", ris);
	}

    @Test
	public void testConvert10() {
        int num = 10;
        String ris = IntegerToRoman.convert(num);
        assertEquals("X", ris);
	}

}
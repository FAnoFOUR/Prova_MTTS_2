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
		System.out.println("Test convert numero 1");
        int num = 1;
        String ris = IntegerToRoman.convert(num);
        assertEquals("I", ris);
	}

    @Test
	public void testConvert2() {
		System.out.println("Test convert numero 2");
        int num = 2;
        String ris = IntegerToRoman.convert(num);
        assertEquals("II", ris);
	}

    @Test
	public void testConvert3() {
		System.out.println("Test convert numero 3");
        int num = 3;
        String ris = IntegerToRoman.convert(num);
        assertEquals("III", ris);
	}

    @Test
	public void testConvert4() { 
		System.out.println("Test convert numero 4");
        int num = 4;
        String ris = IntegerToRoman.convert(num);
        assertEquals("IV", ris);
	}

    @Test
	public void testConvert5() { 
		System.out.println("Test convert numero 5");
        int num = 5;
        String ris = IntegerToRoman.convert(num);
        assertEquals("V", ris);
	}

    @Test
	public void testConvert6() { 
		System.out.println("Test convert numero 6");
        int num = 6;
        String ris = IntegerToRoman.convert(num);
        assertEquals("VI", ris);
	}

}
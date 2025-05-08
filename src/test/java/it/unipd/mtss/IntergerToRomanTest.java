////////////////////////////////////////////////////////////////////
// [ELISA] [MARCHIORO] [2111941]
// [ANTONIO] [TANG] [2111017]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntergerToRomanTest {

    @Test
    public void testIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }
    
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

    @Test
	public void testConvert15() {
        int num = 15;
        String ris = IntegerToRoman.convert(num);
        assertEquals("XV", ris);
	}

    @Test
	public void testConvert19() {
        int num = 19;
        String ris = IntegerToRoman.convert(num);
        assertEquals("XIX", ris);
	}

    @Test
	public void testConvert20() {
        int num = 20;
        String ris = IntegerToRoman.convert(num);
        assertEquals("XX", ris);
	}

    @Test
	public void testConvert30() {
        int num = 30;
        String ris = IntegerToRoman.convert(num);
        assertEquals("XXX", ris);
	}

    @Test
	public void testConvert40() {
        int num = 40;
        String ris = IntegerToRoman.convert(num);
        assertEquals("XL", ris);
	}

    @Test
	public void testConvert50() {
        int num = 50;
        String ris = IntegerToRoman.convert(num);
        assertEquals("L", ris);
	}

    @Test
	public void testConvert60() {
        int num = 60;
        String ris = IntegerToRoman.convert(num);
        assertEquals("LX", ris);
	}

    @Test
	public void testConvert70() {
        int num = 70;
        String ris = IntegerToRoman.convert(num);
        assertEquals("LXX", ris);
	}

    @Test
	public void testConvert80() {
        int num = 80;
        String ris = IntegerToRoman.convert(num);
        assertEquals("LXXX", ris);
	}

    @Test
	public void testConvert90() {
        int num = 90;
        String ris = IntegerToRoman.convert(num);
        assertEquals("XC", ris);
	}

    @Test
	public void testConvert100() {
        int num = 100;
        String ris = IntegerToRoman.convert(num);
        assertEquals("C", ris);
	}

    @Test
	public void testConvert200() {
        int num = 200;
        String ris = IntegerToRoman.convert(num);
        assertEquals("CC", ris);
	}

    @Test
	public void testConvert300() {
        int num = 300;
        String ris = IntegerToRoman.convert(num);
        assertEquals("CCC", ris);
	}

    @Test
	public void testConvert400() {
        int num = 400;
        String ris = IntegerToRoman.convert(num);
        assertEquals("CD", ris);
	}

    @Test
	public void testConvert500() {
        int num = 500;
        String ris = IntegerToRoman.convert(num);
        assertEquals("D", ris);
	}

    @Test
	public void testConvert600() {
        int num = 600;
        String ris = IntegerToRoman.convert(num);
        assertEquals("DC", ris);
	}

    @Test
	public void testConvert700() {
        int num = 700;
        String ris = IntegerToRoman.convert(num);
        assertEquals("DCC", ris);
	}

    @Test
	public void testConvert800() {
        int num = 800;
        String ris = IntegerToRoman.convert(num);
        assertEquals("DCCC", ris);
	}

    @Test
	public void testConvert900() {
        int num = 900;
        String ris = IntegerToRoman.convert(num);
        assertEquals("CM", ris);
	}

    @Test
	public void testConvert1000() {
        int num = 1000;
        String ris = IntegerToRoman.convert(num);
        assertEquals("M", ris);
	}
}
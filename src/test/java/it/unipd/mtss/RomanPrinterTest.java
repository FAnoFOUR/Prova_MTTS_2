////////////////////////////////////////////////////////////////////
// [ELISA] [MARCHIORO] [2111941]
// [ANTONIO] [TANG] [2111017]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
	public void testPrinter1() {
		System.out.println("Test print numero 1");
        int num = 1;
        String art = RomanPrinter.print(num);
        assertEquals(" _____ " + "\n" 
                   + " |_ _| " + "\n"
                   + "  | |  " + "\n" 
                   + "  | |  " + "\n" 
                   + " _| |_ " + "\n" 
                   + "|_____|", art);
	}

    @Test
	public void testPrinter2() {
		System.out.println("Test print numero 2");
        int num = 2;
        String art = RomanPrinter.print(num);
        assertEquals(" _____  _____ " + "\n" 
                   + " |_ _|  |_ _| " + "\n"
                   + "  | |    | |  " + "\n" 
                   + "  | |    | |  " + "\n" 
                   + " _| |_  _| |_ " + "\n" 
                   + "|_____||_____|", art);
	}

    @Test
	public void testPrinter3() {
		System.out.println("Test print numero 3");
        int num = 3;
        String art = RomanPrinter.print(num);
        assertEquals(" _____  _____  _____ " + "\n" 
                   + " |_ _|  |_ _|  |_ _| " + "\n"
                   + "  | |    | |    | |  " + "\n" 
                   + "  | |    | |    | |  " + "\n" 
                   + " _| |_  _| |_  _| |_ " + "\n" 
                   + "|_____||_____||_____|", art);
	}

}

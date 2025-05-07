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
        int num = 3;
        String art = RomanPrinter.print(num);
        assertEquals(" _____  _____  _____ " + "\n" 
                   + " |_ _|  |_ _|  |_ _| " + "\n"
                   + "  | |    | |    | |  " + "\n" 
                   + "  | |    | |    | |  " + "\n" 
                   + " _| |_  _| |_  _| |_ " + "\n" 
                   + "|_____||_____||_____|", art);
	}

    @Test
	public void testPrinter4() {
        int num = 4;
        String art = RomanPrinter.print(num);
        assertEquals(" _____ __      __" + "\n"
                    +" |_ _| \\ \\    / /" + "\n"
                    +"  | |   \\ \\  / / " + "\n"
                    +"  | |    \\ \\/ /  " + "\n"
                    +" _| |_    \\  /   " + "\n"
                    +"|_____|    \\/    " , art);
	}

    @Test
	public void testPrinter5() {
        int num = 5;
        String art = RomanPrinter.print(num);
        assertEquals("__      __" + "\n"
                    +"\\ \\    / /" + "\n"
                    +" \\ \\  / / " + "\n"
                    +"  \\ \\/ /  " + "\n"
                    +"   \\  /   " + "\n"
                    +"    \\/    " , art);
	}

    @Test
	public void testPrinter6() {
        int num = 6;
        String art = RomanPrinter.print(num);
        assertEquals("__      __ _____ " + "\n" 
                   + "\\ \\    / / |_ _| " + "\n"
                   + " \\ \\  / /   | |  " + "\n" 
                   + "  \\ \\/ /    | |  " + "\n" 
                   + "   \\  /    _| |_ " + "\n" 
                   + "    \\/    |_____|", art);
	}

    @Test
	public void testPrinter7() {
        int num = 7;
        String art = RomanPrinter.print(num);
        assertEquals("__      __ _____  _____ " + "\n" 
                   + "\\ \\    / / |_ _|  |_ _| " + "\n"
                   + " \\ \\  / /   | |    | |  " + "\n" 
                   + "  \\ \\/ /    | |    | |  " + "\n" 
                   + "   \\  /    _| |_  _| |_ " + "\n" 
                   + "    \\/    |_____||_____|", art);
	}

    @Test
	public void testPrinter8() {
        int num = 8;
        String art = RomanPrinter.print(num);
        assertEquals("__      __ _____  _____  _____ " + "\n" 
                   + "\\ \\    / / |_ _|  |_ _|  |_ _| " + "\n"
                   + " \\ \\  / /   | |    | |    | |  " + "\n" 
                   + "  \\ \\/ /    | |    | |    | |  " + "\n" 
                   + "   \\  /    _| |_  _| |_  _| |_ " + "\n" 
                   + "    \\/    |_____||_____||_____|", art);
	}

    @Test
	public void testPrinter9() {
        int num = 9;
        String art = RomanPrinter.print(num);
        assertEquals(" _____ __   __" + "\n" 
                   + " |_ _| \\ \\ / /" + "\n"
                   + "  | |   \\ V / " + "\n" 
                   + "  | |    > <  " + "\n" 
                   + " _| |_  / . \\ " + "\n" 
                   + "|_____|/_/ \\_\\", art);
	}

    @Test
	public void testPrinter10() {
        int num = 10;
        String art = RomanPrinter.print(num);
        assertEquals("__   __" + "\n" 
                   + "\\ \\ / /" + "\n"
                   + " \\ V / " + "\n" 
                   + "  > <  " + "\n" 
                   + " / . \\ " + "\n" 
                   + "/_/ \\_\\", art);
	}

    @Test
	public void testPrinter15() {
        int num = 15;
        String art = RomanPrinter.print(num);
        assertEquals("__   ____      __" + "\n" 
                   + "\\ \\ / /\\ \\    / /" + "\n"
                   + " \\ V /  \\ \\  / / " + "\n" 
                   + "  > <    \\ \\/ /  " + "\n" 
                   + " / . \\    \\  /   " + "\n" 
                   + "/_/ \\_\\    \\/    ", art);
	}

    @Test
	public void testPrinter19() {
        int num = 19;
        String art = RomanPrinter.print(num);
        assertEquals("__   __ _____ __   __" + "\n" 
                   + "\\ \\ / / |_ _| \\ \\ / /" + "\n"
                   + " \\ V /   | |   \\ V / " + "\n" 
                   + "  > <    | |    > <  " + "\n" 
                   + " / . \\  _| |_  / . \\ " + "\n" 
                   + "/_/ \\_\\|_____|/_/ \\_\\", art);
	}

    @Test
	public void testPrinter20() {
        int num = 20;
        String art = RomanPrinter.print(num);
        assertEquals("__   ____   __" + "\n" 
                   + "\\ \\ / /\\ \\ / /" + "\n"
                   + " \\ V /  \\ V / " + "\n" 
                   + "  > <    > <  " + "\n" 
                   + " / . \\  / . \\ " + "\n" 
                   + "/_/ \\_\\/_/ \\_\\", art);
	}

}

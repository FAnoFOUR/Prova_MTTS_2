////////////////////////////////////////////////////////////////////
// [ELISA] [MARCHIORO] [2111941]
// [ANTONIO] [TANG] [2111017]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
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

    @Test
	public void testPrinter30() {
        int num = 30;
        String art = RomanPrinter.print(num);
        assertEquals("__   ____   ____   __" + "\n" 
                   + "\\ \\ / /\\ \\ / /\\ \\ / /" + "\n"
                   + " \\ V /  \\ V /  \\ V / " + "\n" 
                   + "  > <    > <    > <  " + "\n" 
                   + " / . \\  / . \\  / . \\ " + "\n" 
                   + "/_/ \\_\\/_/ \\_\\/_/ \\_\\", art);
	}

    @Test
    public void testPrinter40() {
        int num = 40;
        String art = RomanPrinter.print(num);
        assertEquals("__   __ _      " + "\n" 
                   + "\\ \\ / /| |     " + "\n"
                   + " \\ V / | |     " + "\n" 
                   + "  > <  | |     " + "\n" 
                   + " / . \\ | |____ " + "\n" 
                   + "/_/ \\_\\|______|", art);
	}

    @Test
    public void testPrinter50() {
        int num = 50;
        String art = RomanPrinter.print(num);
        assertEquals(" _      " + "\n" 
                   + "| |     " + "\n"
                   + "| |     " + "\n" 
                   + "| |     " + "\n" 
                   + "| |____ " + "\n" 
                   + "|______|", art);
	}

    @Test
    public void testPrinter60() {
        int num = 60;
        String art = RomanPrinter.print(num);
        assertEquals(" _      __   __" + "\n" 
                   + "| |     \\ \\ / /" + "\n"
                   + "| |      \\ V / " + "\n" 
                   + "| |       > <  " + "\n" 
                   + "| |____  / . \\ " + "\n" 
                   + "|______|/_/ \\_\\", art);
	}

    @Test
    public void testPrinter70() {
        int num = 70;
        String art = RomanPrinter.print(num);
        assertEquals(" _      __   ____   __" + "\n" 
                   + "| |     \\ \\ / /\\ \\ / /" + "\n"
                   + "| |      \\ V /  \\ V / " + "\n" 
                   + "| |       > <    > <  " + "\n" 
                   + "| |____  / . \\  / . \\ " + "\n" 
                   + "|______|/_/ \\_\\/_/ \\_\\", art);
	}

    @Test
    public void testPrinter80() {
        int num = 80;
        String art = RomanPrinter.print(num);
        assertEquals(" _      __   ____   ____   __" + "\n" 
                   + "| |     \\ \\ / /\\ \\ / /\\ \\ / /" + "\n"
                   + "| |      \\ V /  \\ V /  \\ V / " + "\n" 
                   + "| |       > <    > <    > <  " + "\n" 
                   + "| |____  / . \\  / . \\  / . \\ " + "\n" 
                   + "|______|/_/ \\_\\/_/ \\_\\/_/ \\_\\", art);
	}

    @Test
	public void testPrinter90() {
        int num = 90;
        String art = RomanPrinter.print(num);
        assertEquals("__   __  _____ " + "\n" 
                   + "\\ \\ / / / ____|" + "\n"
                   + " \\ V / | |     " + "\n" 
                   + "  > <  | |     " + "\n" 
                   + " / . \\ | |____ " + "\n" 
                   + "/_/ \\_\\ \\_____|", art);
	}

    @Test
	public void testPrinter100() {
        int num = 100;
        String art = RomanPrinter.print(num);
        assertEquals("  _____ " + "\n" 
                   + " / ____|" + "\n"
                   + "| |     " + "\n" 
                   + "| |     " + "\n" 
                   + "| |____ " + "\n" 
                   + " \\_____|", art);
	}

    @Test
	public void testPrinter200() {
        int num = 200;
        String art = RomanPrinter.print(num);
        assertEquals("  _____   _____ " + "\n" 
                   + " / ____| / ____|" + "\n"
                   + "| |     | |     " + "\n" 
                   + "| |     | |     " + "\n" 
                   + "| |____ | |____ " + "\n" 
                   + " \\_____| \\_____|", art);
	}

     @Test
	public void testPrinter300() {
        int num = 300;
        String art = RomanPrinter.print(num);
        assertEquals("  _____   _____   _____ " + "\n" 
                   + " / ____| / ____| / ____|" + "\n"
                   + "| |     | |     | |     " + "\n" 
                   + "| |     | |     | |     " + "\n" 
                   + "| |____ | |____ | |____ " + "\n" 
                   + " \\_____| \\_____| \\_____|", art);
	}

    @Test
	public void testPrinter400() {
        int num = 400;
        String art = RomanPrinter.print(num);
        assertEquals("  _____ _____   " + "\n" 
                   + " / ____|| __  \\ " + "\n"
                   + "| |     | |  | |" + "\n" 
                   + "| |     | |  | |" + "\n" 
                   + "| |____ | |__| |" + "\n" 
                   + " \\_____||_____/ ", art);
	}

    @Test
	public void testPrinter500() {
        int num = 500;
        String art = RomanPrinter.print(num);
        assertEquals("_____   " + "\n" 
                   + "| __  \\ " + "\n"
                   + "| |  | |" + "\n" 
                   + "| |  | |" + "\n" 
                   + "| |__| |" + "\n" 
                   + "|_____/ ", art);
	}



}

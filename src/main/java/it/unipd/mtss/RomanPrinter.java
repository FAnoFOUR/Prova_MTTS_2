////////////////////////////////////////////////////////////////////
// [ELISA] [MARCHIORO] [2111941]
// [ANTONIO] [TANG] [2111017]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    private static Letter I= new Letter(
        " _____ ",
        " |_ _| ",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    );
    private static Letter V= new Letter(
        "__      __",
        "\\ \\    / /",
        " \\ \\  / / ",
        "  \\ \\/ /  ",
        "   \\  /   ",
        "    \\/    "
    ); 
    private static Letter X= new Letter(
        "__   __",
        "\\ \\ / /",
        " \\ V / ",
        "  > <  ",
        " / . \\ ",
        "/_/ \\_\\"
    ); 
    private static Letter L= new Letter(
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |____ ",
        "|______|"
    ); 
    private static Letter C= new Letter(
        "  _____ ",
        " / ____|",
        "| |     ",
        "| |     ",
        "| |____ ",
        " \\_____|"
    ); 
    private static Letter D= new Letter(
        "_____   ",
        "| __  \\ ",
        "| |  | |",
        "| |  | |",
        "| |  | |",
        "|_____/ "
    ); 
    private static Letter M= new Letter(
        " __  __ ",
        "|  \\/  |",
        "| \\  / |",
        "| |\\/| |",
        "| |  | |",
        "|_|  |_|"
    ); 

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){

            String rigaF1 = "";
            String rigaF2 = "";
            String rigaF3 = "";
            String rigaF4 = "";
            String rigaF5 = "";
            String rigaF6 = "";

        for(char a : romanNumber.toCharArray()){

            if(a == 'I'){
                rigaF1.concat(I.getRiga1());
                rigaF2.concat(I.getRiga2());
                rigaF3.concat(I.getRiga3());
                rigaF4.concat(I.getRiga4());
                rigaF5.concat(I.getRiga5());
                rigaF6.concat(I.getRiga6());
            }

            if(a == 'V'){
                rigaF1.concat(V.getRiga1());
                rigaF2.concat(V.getRiga2());
                rigaF3.concat(V.getRiga3());
                rigaF4.concat(V.getRiga4());
                rigaF5.concat(V.getRiga5());
                rigaF6.concat(V.getRiga6());
            }

            if(a == 'X'){
                rigaF1.concat(X.getRiga1());
                rigaF2.concat(X.getRiga2());
                rigaF3.concat(X.getRiga3());
                rigaF4.concat(X.getRiga4());
                rigaF5.concat(X.getRiga5());
                rigaF6.concat(X.getRiga6());
            }

            if(a == 'L'){
                rigaF1.concat(L.getRiga1());
                rigaF2.concat(L.getRiga2());
                rigaF3.concat(L.getRiga3());
                rigaF4.concat(L.getRiga4());
                rigaF5.concat(L.getRiga5());
                rigaF6.concat(L.getRiga6());
            }

            if(a == 'C'){
                rigaF1.concat(C.getRiga1());
                rigaF2.concat(C.getRiga2());
                rigaF3.concat(C.getRiga3());
                rigaF4.concat(C.getRiga4());
                rigaF5.concat(C.getRiga5());
                rigaF6.concat(C.getRiga6());
            }

            if(a == 'D'){
                rigaF1.concat(D.getRiga1());
                rigaF2.concat(D.getRiga2());
                rigaF3.concat(D.getRiga3());
                rigaF4.concat(D.getRiga4());
                rigaF5.concat(D.getRiga5());
                rigaF6.concat(D.getRiga6());
            }
            
            if(a == 'M'){
                rigaF1.concat(M.getRiga1());
                rigaF2.concat(M.getRiga2());
                rigaF3.concat(M.getRiga3());
                rigaF4.concat(M.getRiga4());
                rigaF5.concat(M.getRiga5());
                rigaF6.concat(M.getRiga6());
            }
            //
        }
        return  rigaF1 + "\n" + 
        rigaF2 + "\n" + 
        rigaF3 + "\n" + 
        rigaF4 + "\n" + 
        rigaF5 + "\n" + 
        rigaF6;
    }

    
}

class Letter{
    public Letter(
        String riga_1, 
        String riga_2, 
        String riga_3,
        String riga_4,
        String riga_5,
        String riga_6)
        {
            riga1 = riga_1;
            riga2 = riga_2;
            riga3 = riga_3;
            riga4 = riga_4;
            riga5 = riga_5;
            riga6 = riga_6;
        };
    public String riga1;
    public String riga2;
    public String riga3;
    public String riga4;
    public String riga5;
    public String riga6;

    public String getRiga1() {
        return riga1;
    }
    public String getRiga2() {
        return riga2;
    }
    public String getRiga3() {
        return riga3;
    }
    public String getRiga4() {
        return riga4;
    }
    public String getRiga5() {
        return riga5;
    }
    public String getRiga6() {
        return riga6;
    }
    @Override
    public String toString() {
        return riga1 + riga2 + riga3 + riga4 + riga5 + riga6;
    }
}
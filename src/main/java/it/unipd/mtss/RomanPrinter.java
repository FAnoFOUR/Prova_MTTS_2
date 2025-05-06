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

        StringBuilder rigaF1 = new StringBuilder();
        StringBuilder rigaF2 = new StringBuilder();
        StringBuilder rigaF3 = new StringBuilder();
        StringBuilder rigaF4 = new StringBuilder();
        StringBuilder rigaF5 = new StringBuilder();
        StringBuilder rigaF6 = new StringBuilder();

        for(char a : romanNumber.toCharArray()){

            if(a == 'I'){
                rigaF1.append(I.getRiga1());
                rigaF2.append(I.getRiga2());
                rigaF3.append(I.getRiga3());
                rigaF4.append(I.getRiga4());
                rigaF5.append(I.getRiga5());
                rigaF6.append(I.getRiga6());
            }

            if(a == 'V'){
                rigaF1.append(V.getRiga1());
                rigaF2.append(V.getRiga2());
                rigaF3.append(V.getRiga3());
                rigaF4.append(V.getRiga4());
                rigaF5.append(V.getRiga5());
                rigaF6.append(V.getRiga6());
            }

            if(a == 'X'){
                rigaF1.append(X.getRiga1());
                rigaF2.append(X.getRiga2());
                rigaF3.append(X.getRiga3());
                rigaF4.append(X.getRiga4());
                rigaF5.append(X.getRiga5());
                rigaF6.append(X.getRiga6());
            }

            if(a == 'L'){
                rigaF1.append(L.getRiga1());
                rigaF2.append(L.getRiga2());
                rigaF3.append(L.getRiga3());
                rigaF4.append(L.getRiga4());
                rigaF5.append(L.getRiga5());
                rigaF6.append(L.getRiga6());
            }

            if(a == 'C'){
                rigaF1.append(C.getRiga1());
                rigaF2.append(C.getRiga2());
                rigaF3.append(C.getRiga3());
                rigaF4.append(C.getRiga4());
                rigaF5.append(C.getRiga5());
                rigaF6.append(C.getRiga6());
            }

            if(a == 'D'){
                rigaF1.append(D.getRiga1());
                rigaF2.append(D.getRiga2());
                rigaF3.append(D.getRiga3());
                rigaF4.append(D.getRiga4());
                rigaF5.append(D.getRiga5());
                rigaF6.append(D.getRiga6());
            }
            
            if(a == 'M'){
                rigaF1.append(M.getRiga1());
                rigaF2.append(M.getRiga2());
                rigaF3.append(M.getRiga3());
                rigaF4.append(M.getRiga4());
                rigaF5.append(M.getRiga5());
                rigaF6.append(M.getRiga6());
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
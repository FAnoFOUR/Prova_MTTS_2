////////////////////////////////////////////////////////////////////
// [ELISA] [MARCHIORO] [2111941]
// [ANTONIO] [TANG] [2111017]
////////////////////////////////////////////////////////////////////



package it.unipd.mtss;


public class IntegerToRoman {
  public static String convert(int number){
    StringBuilder roman = new StringBuilder();
    String[] romanletters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    if (number < 1 || number > 1000) {
      throw new IllegalArgumentException("Numero non valido");
    }
    for (int i = 0; i <= 12; i++) {
    while (number >= integers[i]){
      roman.append(romanletters[i]);
      number = number - integers[i];
    }
    }
    return roman.toString();
  }
}

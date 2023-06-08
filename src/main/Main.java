
package main;

public class Main {

    public static void main(String[] args) {
        String[] one_nine = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teen = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hundred = "hundred";
        
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            String wynik = "";
            int liczba = i;

            if (liczba == 1000) {
                wynik = "onethousand";
                sum += wynik.length();
                break;
            }
            if (liczba / 100 != 0) {
                wynik += one_nine[liczba / 100] + hundred;
                liczba = liczba % 100;
                if (liczba != 0) {
                    wynik += "and";
                }
            }
            if (liczba / 10 >= 2) {
                wynik += tens[liczba / 10];
                liczba = liczba % 10;
            }
            if (liczba >= 10 && liczba < 20) {
                wynik += teen[liczba % 10];
            }
            if (liczba < 10 && liczba != 0) {
                wynik += one_nine[liczba];
            }
            sum += wynik.length();
        }

        System.out.println(sum);
    }
}


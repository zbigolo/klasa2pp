package DebugowanieAplikacji;

//  https://pythontutor.com/visualize.html#mode=edit

public class Samples1 {

    public static void main(String[] args) {
        int ilosc = 5;

        String[] result = new String[ilosc];
        int[] liczba = {12, 45, 5, 55, 9};
        for (int i = 0; i < ilosc; i++) {
            if (liczba[i] % 15 == 0) result[i] = "TAK";
            else result[i] = "NIE";
        }

        for (int i = 0; i < ilosc; i++) System.out.println(result[i]);

    }
}

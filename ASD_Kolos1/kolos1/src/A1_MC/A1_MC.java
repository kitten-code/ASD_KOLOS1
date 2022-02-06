package A1_MC;
// N-ilosc przedmiotow

import java.util.Random;

public class A1_MC {
    final static int N = 6;
    static final int MAX_V = 10;
    final static int objetoscPlecaka = 10;
    final static int[] V = {6, 2, 3, 2, 3, 1};
    final static int[] W = {6, 4, 5, 7, 10, 2};

    public static void main(String[] args) {
        String optymalnaKonfiguracja = new String();
        int optV = -1;
        int optW = 0;

        Random los = new Random();

        for (int i = 0; i < 10; i++) {

            int[] ustaw = new int[N];

            for (int j = 0; j < N; j++) ustaw[j] = j;

            for (int j = 0; j < N; j++) // tasowanie przedmiotow
            {
                int rndIndex = los.nextInt(N);
                if (rndIndex != j) {
                    int pom = ustaw[j]; // zamiana elementow
                    ustaw[j] = ustaw[rndIndex];
                    ustaw[rndIndex] = pom;
                }
            }

            // parametry lokalnego rozwiazania
            String locKonfig = new String();
            int sumV = 0;
            int sumW = 0;
            int j = 0;

            // wkladamy do plecaka przedmioty rozpoczynajac od poczatku tablicy (przetasowanej) dopoki sie mieszcza
            while ((j < N) && (sumV + V[ustaw[j]] <= MAX_V)) {
                sumV = sumV + V[ustaw[j]];
                sumW = sumW + W[ustaw[j]];
                locKonfig = locKonfig + " " + ustaw[j];
                j++;
            }

            // jesli dane rozwiazanie (lokalne) jest lepsze od dotychczas najlepszego rozwiazania (globalnego)
            if (sumW > optW) { // podmiana wartosci optymalnego rozwiazania
                optW = sumW;
                optV = sumV;
                optymalnaKonfiguracja = locKonfig;
            }

        }

        System.out.println("Calkowita objetość: " + optV);
        System.out.println("Calkowita wartosc: " + optW);
        System.out.println("Konfiguracja: " + optymalnaKonfiguracja);
        System.out.println("Niewykorzystana objętość: " + (MAX_V - optV));
    }
}




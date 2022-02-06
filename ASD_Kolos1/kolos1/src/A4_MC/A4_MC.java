package A4_MC;

import java.util.Random;

// A-k1,k4  B-k2,k3,k4  C-k3,k5  D-k1,k2,k5
public class A4_MC {

    final static int LOS = 10;

    public static void main(String[] args) {
        int[][] umiejetnosciAstronautów = {{1, 4}, {2, 3, 4}, {3, 5}, {1, 2, 5}};
        int[] astronauta = {1, 2, 3, 4, 5};

        int N = astronauta.length;

        String optymalnaKonfiguracja = new String();
        int optymalneAstroLicz = N;

        Random los = new Random();

        for (int i = 0; i < LOS; i++) {

            System.out.println("Rozwiazanie nr " + (i + 1));
            for (int j = 0; j < astronauta.length; j++) {
                int randomowyIndex = los.nextInt(N);
                if (randomowyIndex != j) {
                    int pom = astronauta[j];
                    astronauta[j] = astronauta[randomowyIndex];
                    astronauta[randomowyIndex] = pom;
                }
            }

            System.out.print("\tkolejnosc astro po przemieszaniu:\n\t");
            for (int j : astronauta)
                System.out.println(j);

            String lokalneRozwiazanie = new String();
            int astroLicz = 0;
            int[] specStatus = new int[umiejetnosciAstronautów.length];
            int j = 0;
            int sumSpec = 0;

            while (sumSpec < umiejetnosciAstronautów.length) {
                for (int k = 0; k < umiejetnosciAstronautów.length; k++) {
                    for (int l = 0; l < umiejetnosciAstronautów[k].length; l++) {
                        if (umiejetnosciAstronautów[k][l] == astronauta[j]) {
                            specStatus[k]++;
                        }

                    }
                }
                lokalneRozwiazanie = lokalneRozwiazanie + "" + astronauta[j];
                astroLicz++;
                j++;
                sumSpec = 0;
                for (int specStat : specStatus) // oblicz ile teraz spec obsadzonych
                    if (specStat >= 1)
                        sumSpec++;

                System.out.println("\tastro zabrani: " + lokalneRozwiazanie);
                System.out.print("\tobsadzone specjalnosci:\t" + sumSpec + " :\t");
                for (int specStat : specStatus)
                    System.out.print(specStat + " ");
                System.out.println();
            }

            if (astroLicz < optymalneAstroLicz) {
                optymalnaKonfiguracja = lokalneRozwiazanie;
                optymalneAstroLicz = astroLicz;
            }
        }

        System.out.println("//////////////////////////////////");
        System.out.println("Moga leciec: " + optymalnaKonfiguracja);


    }

}


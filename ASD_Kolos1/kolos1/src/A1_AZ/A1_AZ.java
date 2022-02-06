package A1_AZ;

// v-objetosc 10
// ilosc przedmiotow 6
//kazdy ma okreslana wartosc wi i objetosc vi
//od najbardziej wartosciowego
public class A1_AZ {
    final static int iloscPrzedmiotow = 6;
    final static int objetoscPlecaka = 10;
    final static int[] V = {6, 2, 3, 2, 3, 1};
    final static int[] W = {6, 4, 5, 7, 10, 2};

    public static void main(String[] args) {

        boolean[] rozw = new boolean[iloscPrzedmiotow];
        for (int i = 0; i < iloscPrzedmiotow; i++) {
            rozw[i] = false;
        }

        int sumaWartosci = 0;
        int sumaObjetosci = 0;

        while (true) {
            int maxW = 0;
            int maxPoz = -1;

            for (int i = 0; i < iloscPrzedmiotow; i++) {

                if( !rozw[i]){
                    if( (sumaObjetosci+V[i]<=objetoscPlecaka)&&(W[i]>maxW)){
                        maxW=W[i];
                        maxPoz=i;
                    }
                }
            }

            if( maxPoz>-1){
                rozw[maxPoz]=true;
                sumaWartosci=sumaWartosci+W[maxPoz];
                sumaObjetosci=sumaObjetosci+V[maxPoz];
            }
            else break;
        }

        System.out.println("wartosci optymalnie zapakowanego plecaka  metodą Pakuj cenne  " + sumaWartosci);
        System.out.println("Przedmioty w plecaku: ");
        for( int i=0; i < iloscPrzedmiotow;i++){
            if(rozw[i]) System.out.println(i+ " ");
            System.out.println();

        }
    }
}


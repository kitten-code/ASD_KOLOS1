package com.company;

// liczba smakow 6
// zmiana smaku z i na j - czas - t
//minimyalny czas przestrojenia maszyny

public class Main {



    public static void main(String[] args) {

        final int liczba_smakow = 6;
        final int czas [][] = new int [6][6];

        czas[0][0] = 0;
        czas[0][1] = 7;
        czas[0][2] = 20;
        czas[0][3] = 21;
        czas[0][4] = 12;
        czas[0][5] = 23;

        czas[1][0] = 27;
        czas[1][1] = 0;
        czas[1][2] = 13;
        czas[1][3] = 16;
        czas[1][4] = 46;
        czas[1][5] = 5;

        czas[2][0] = 53;
        czas[2][1] = 15;
        czas[2][2] = 0;
        czas[2][3] = 25;
        czas[2][4] = 27;
        czas[2][5] = 6;

        czas[3][0] = 16;
        czas[3][1] = 2;
        czas[3][2] = 35;
        czas[3][3] = 0;
        czas[3][4] = 47;
        czas[3][5] = 10;

        czas[4][0] = 31;
        czas[4][1] = 29;
        czas[4][2] = 5;
        czas[4][3] = 18;
        czas[4][4] = 0;
        czas[4][5] = 4;

        czas[5][0] = 28;
        czas[5][1] = 24;
        czas[5][2] = 1;
        czas[5][3] = 17;
        czas[5][4] = 5;
        czas[5][5] = 0;

    }


}

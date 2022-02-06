package A4_AZ;

//int[] test = {1, 2, 3, 4};
//int[][] test1 = {{1,2,3,4}, {1,2,3}}

import java.util.ArrayList;

public class A4_AZ {
    public static void main(String[] args) {

                int[][] umiejetnosciAstronautow = {
                        {1, 4},
                        {2, 3, 4},
                        {3, 5},
                        {1, 2, 5}};

                int[] astronauta = {1, 2, 3, 4, 5};
                int index=0;
                ArrayList<Integer> naStatku= new ArrayList<Integer>();

                while(true){
                    if(index==astronauta.length) break;
                    System.out.println("Analizowany astronauta :" + astronauta[index]);
                    int skill=0;
                    for (int i=0;i<umiejetnosciAstronautow.length;i++){
                        for(int j=0;j<umiejetnosciAstronautow[i].length;j++){

                            if ( astronauta[index] == umiejetnosciAstronautow[i][j])
                                skill++;
                        }
                    }

                    System.out.println("astronauta" + astronauta[index]+naStatku.toString());

                    if( skill>=1){
                        naStatku.add(astronauta[index]);
                        System.out.println("na pokładzie :" + naStatku.toString());
                    }
                    else {
                        index++;
                        continue;
                    }

                    int match =0;
                    for ( int i =0; i<umiejetnosciAstronautow.length;i++){
                        for(int j=0; j<umiejetnosciAstronautow[i].length;j++){

                            if ( naStatku.contains(umiejetnosciAstronautow[i][j])){
                                match++;
                                break;
                            }
                        }


                    }
                    System.out.println("ilosc osadzonych dziedzin : " + match);

                    if(match== umiejetnosciAstronautow.length){
                        break; }
                    index ++;

                }

                if(index == astronauta.length){
                    System.out.println("brak rozwiązania");
                }
                else
                    System.out.println("kosmonauci mogą leciec" + naStatku.toString());

            }
        }




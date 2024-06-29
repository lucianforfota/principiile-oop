package algortimica;

import java.util.ArrayList;

public class Sda2Ex2 {

    //2. Scrie un program care citește un șir de numere întregi și două numere n și m.
    // Programul trebuie să verifice că n și m nu apar niciodată unul lângă celălalt (în orice ordine) în șir.


    public static void main(String[] args) {
        //a = 3,4,9,7, 8, 7, 4, 3
        //n = 4, m = 7

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(9);
        System.out.println(checkNearNumbers(numbers,4,7));

    }

    public static boolean checkNearNumbers (ArrayList<Integer> numbers, int n, int m ){
        //parcurg de la index 1 pana la penultimul
            //daca elementul curent este egal cu n
               //daca unul dintre vecini este m
                   //returnez true
        //returnez false

        for (int i = 1; i < numbers.size()-1; i++) {
            if (numbers.get(i)==n && (numbers.get(i-1) == m || numbers.get(i+1) ==m)){
                return true;
            }
        }
        return false;
    }

}




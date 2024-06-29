package algortimica;

import java.util.ArrayList;

public class Sda2Ex3 {

    //3. Scrie un program care citește un șir de numere întregi și afișează numărul de "triplete" din șir.
    //Un "triplet" reprezintă trei numere întregi consecutive în ordine crescătoare,
    // care diferă cu 1 (de exemplu, 3,4,5 este un triplet, dar 5,4,3 și 2,4,6 nu sunt).

    //3 2 7 8 9 10 11



    public static void main(String[] args) {

    }

    public static int getNumberOfTriplets (ArrayList<Integer> numbers){
        int numberOfTriplets = 0;
        for (int i = 0; i < numbers.size()-2; i++) {
            if (numbers.get(i) + 1 == numbers.get(i+1) && numbers.get(i+1) + 1 == numbers.get(i+2)){
                numberOfTriplets++;
            }
        }
        return numberOfTriplets;
    }

}

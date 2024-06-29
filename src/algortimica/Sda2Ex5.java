package algortimica;

import java.util.ArrayList;

public class Sda2Ex5 {


    //5
    //Acum transforma functia in felul urmator: functia va primi un array, un numar n si in plus si un numar k.
    // Returneaza index-ul celei de-a k aparitii a numarului n in array.
    // De exemplu, pentru 19 14 17 15 17, indexul celei de-a 2-a aparitii a lui 17 in array este 5.

    public static void main(String[] args) {

    }

    public static int getIndexOfKthOccurence(ArrayList<Integer> numbers, int k, int n) throws Exception{
        int count = 0;
        //pracrugi un array
        for (Integer number: numbers){
            if (number == n){
                count++;
                if (count == k){
                    return numbers.indexOf(number);
                }
            }
        }
        throw new Exception(k + "th occurcen of " +n + "don't exist");
    }
}

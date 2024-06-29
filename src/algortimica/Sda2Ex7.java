package algortimica;

public class Sda2Ex7 {

    //7. Scrie o functie care accepta un array bidimensional (o matrice) si doua numere: i si j.
    //Interschimba coloanele cu indicii i si j din matrice.
    //
    //De exemplu, pentru matricea:
    //
    //11 12 13 14
    //21 22 23 24
    //31 32 33 34
    //Daca vrem sa interschimba coloana 0 cu coloana 1, matricea va deveni:
    //
    //12 11 13 14
    //22 21 23 24
    //32 31 33 34


    public static void main(String[] args) {
        int[][] matrix = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34}
        };




        for (int[]  row : matrix) {
            for ( int element  : row ) {
                System.out.print(element);
            }
            System.out.println();
        }

    }

    public static void swapColumns (int[][] matrix, int m, int n){
        for (int i = 0; i < matrix.length; i++) {
            //interschimb matrix[i][m] cu matrix[i][n]
            int temp = matrix[i][m];
            matrix[i][m] = matrix[i][n];
            matrix[i][n] = temp;
            //11 12 13 14
            //21 22 23 24
            //31 32 33 34
        }
    }
}

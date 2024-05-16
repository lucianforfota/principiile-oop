package exercitii.perimeterchallenge;

public class Main {
    public static void main(String[] args) {
        // (-1,3)
        // (-1,-1),
        // (4,-1),
        // (1,3)

        //1. rezolva problema pe un exemplu
        //2. scrie ce ai facut
        //3. gasesti pattern-uri si dezvolti un algoritm
        //4. verifica algoritmul de mana
        //5. tradu in cod
        //6. testam si debug


        //calculez distanta de la P1 la P2
        //pana acum am 4
        //calculez distanta de la P2 la P3
        //adaug la 4 pe 5 si imi da 9
        //calculez disnta de la P3 la P4
        // adaug la 9 pe 5 si imi da 14
        //calculez distanta de la P4 la P1
        //adaug la 14 pe 2 si imi da 16
        //16 este rezultatul

        //generalizam

        //calculez distanta de la P1 la P2 (currDist = 4)
        //pana acum am currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //adaug la 4 pe currDist si imi da 9
        //calculez disnta de la P3 la P4 (currDist = 5)
        // adaug la 9 pe currDist si imi da 14
        //calculez distanta de la P4 la P1 (currDist = 2)
        //adaug la 14 pe currDist si imi da 16
        //16 este rezultatul

        //totatlPerim este initial 0
        //calculez distanta de la P1 la P2 (currDist = 4)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P2 la P3 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez disnta de la P3 la P4 (currDist = 5)
        //totalPerim devine totalPerim + currDist
        //calculez distanta de la P4 la P1 (currDist = 2)
        //totalPerim devine totalPerim + currDist
        //totalPerim este rezultatul


        //totalPerim este initial 0
        //pentru toate punctele din array (pana la penultimul)
           //calculez distanta de la points[i] la points[i+1] (currDist)
           //totalPerim devine totalPerim + currDist
        //calculez disntata dela ultimul (lenght-1) la primul (0)
        //totalPerim devine totalPerim + currDist
        //returnez totalPerim














    }

    public static int getPerimeter (Shape shape){
        return 0;
    }
}

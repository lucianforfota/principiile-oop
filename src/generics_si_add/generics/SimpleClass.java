package generics_si_add.generics;

public class SimpleClass {

    public <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

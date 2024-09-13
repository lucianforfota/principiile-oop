package algortimica.sda2ex1;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    //[[1,3],[2,6],[8,10],[15,18]]
    //[[1,6],[8,10],[15,18]]


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(6);
        List<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(10);
        List<Integer> list4 = new ArrayList<>();
        list4.add(15);
        list4.add(18);

        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(list1);
        intervals.add(list2);
        intervals.add(list3);
        intervals.add(list4);

        System.out.println(mergeIntervals(intervals));
    }
    public static List<List<Integer>> mergeIntervals(List<List<Integer>> intervals){
        //ordonam intervalele crescator dupa capatul din stanga
        //luam un array result
        //pentru fiecare interval
             //daca capatul din dreapta al intervalului curent mai mare decat c st al intervalului urmator
                 //creeam un array(interval) cu capataul din stanga = capatul din stanga al curentului
                  //si capatul din dreapta maxmiul dintre capat dr curent si capat st urm si capat dr urm
                 //bagam in result array-ul nou creat
                 //intervavlul curent devine array-ul nou creat
             //altfel
                 //intervalul curent devine ala din parcurgere
                 //bagam in result intervalul curent

        intervals.sort((interval1,interval2)-> Integer.compare(interval1.get(0),interval2.get(0)));

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentInterval = intervals.get(0);
        for (List<Integer> interval: intervals){
            int currentEnd = currentInterval.get(1);
            int nextStart = interval.get(0);
            int nextEnd = interval.get(1);
            if (currentEnd>nextStart){
                currentInterval.set(1, Math.max(currentEnd,nextEnd));
            }else{
                currentInterval = interval;
                result.add(currentInterval);
            }
        }
        return result;
    }
}

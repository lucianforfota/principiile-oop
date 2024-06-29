package algortimica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //input - o lista de evenimente
        //output - o lista cu numele evenimenteleor dintre 2 date

        Event event1 = new Event(LocalDate.of(2024, 6, 12), "concert");
        Event event2 = new Event(LocalDate.of(2024, 6, 13), "stand-up comedy");
        Event event3 = new Event(LocalDate.of(2024, 6, 14), "teatru");
        Event event4 = new Event(LocalDate.of(2024, 6, 17), "opera");

        ArrayList<Event> events = new ArrayList<>();
        events.add(event1);
        events.add(event2);
        events.add(event3);
        events.add(event4);

        ArrayList<String> eventNames = getEventsBetween(LocalDate.of(2024, 6, 12), LocalDate.of(2024, 6, 14), events);
        System.out.println(eventNames);
    }

    public static ArrayList<String> getEventsBetween(LocalDate start, LocalDate end, ArrayList<Event> events){
        //initilizez o lista de string-uri result
        //parcurg evenimentele
             //daca evenimentul curent este intre start si end
                   //bagam in arraylistul result numele evenimentului curent

        ArrayList<String> result = new ArrayList<>();
        for(Event event: events){
            if (event.getDate().isAfter(start)  &&  event.getDate().isBefore(end)){
                result.add(event.getName());
            }
        }
        return result;
    }
}

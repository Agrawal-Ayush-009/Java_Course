import java.util.*;

public class Ticket_Itinerary {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Delhi", "Goa");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Chennai", "Bangaluru");

        HashMap<String, String> path = new HashMap<>();

        Set<String> keys = tickets.keySet();

        for (String k : keys) {
            path.put(tickets.get(k), k);
        }

        String strt = "";

        for (String k : keys) {
            if(!path.containsKey(k)){
                strt = k;
            }
        }

        System.out.print(strt);
        while(tickets.containsKey(strt)){
            System.out.print(" -> " + tickets.get(strt));
            strt = tickets.get(strt);
        }
    }
}

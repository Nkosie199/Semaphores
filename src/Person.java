
import java.util.ArrayList;


/**
 *
 * @author gmdnko003
 */
public class Person {
    static int personNo;
    static ArrayList<Destination> destinations = new ArrayList<>();
    static ArrayList<Integer> durations = new ArrayList<>();
    static Destination destination;
    static int duration;
            
    public Person(int personNo){
        this.personNo = personNo;
    }
    
    public static void addDestination(Destination destination){
        destinations.add(destination);
    }
    
    public static void addDuration(int duration){
        durations.add(duration);
    }
    
//    public String toString(){
//        return "";
//    }
}

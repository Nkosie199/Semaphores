
import java.util.ArrayList;


/**
 *
 * @author gmdnko003
 */
public class Taxi {
    static ArrayList<Person> peopleInTaxi; // used to represent the people in the taxi
    static Destination location; // used to store the current destination of the taxi
    static int duration; // used to store the time the taxi takes when travelling
    
    public Taxi(){
        peopleInTaxi = new ArrayList<>();
    }
    
    public static void personEntersTaxi(Person person){
        peopleInTaxi.add(person);
    }
    
    public static void personExitsTaxi(Person person){
        peopleInTaxi.remove(person);
    }
}

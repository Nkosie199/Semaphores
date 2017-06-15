
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author gmdnko003
 */
public class Simulator {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<String> lines = new ArrayList<>();
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
        
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        // input
        while (line != null){
            lines.add(line);
            System.out.println(line);
            line = br.readLine();
        }
        System.out.println("");
        // file is now contained in lines array
        // now to the loading of the file ... 
        load();
    }
    
    static void load(){
        //<number of people> <newline>
        int noOfPeople = Integer.parseInt(lines.get(0));
        //<number of branches> <newline>
        int noOfBrances = Integer.parseInt(lines.get(1));
        //{<person number> (<branch, duration>) { , ( <branch, duration>)} <newline> }
        for (int i=2; i<lines.size(); i++){
            String detail = lines.get(i);
//            System.out.println(detail);
            String[] lineElements = detail.split(" ");
            Person person = new Person(Integer.parseInt(lineElements[0]));
            // now for the processing of the destination and duration of each person
            for (int j=1; j<lineElements.length; j++){
                
            }
            Destination branchlineElements[1];
        }
    }
    
}

package javaprogrammes5;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
import java.util.HashMap;
import java.util.Scanner;

public class Programme_10_Stations {

    public static void main(String[] args) {
        station();
    }
    public static void station() {
        // Create a HashMap to store Zone 1 stations and their associated Tube lines
        HashMap<String, String> stationsAndLines = new HashMap();
        stationsAndLines.put("Waterloo", "Bakerloo Line, Jubilee Line, Waterloo & City Line, Northern Line");
        stationsAndLines.put("Baker Street", "Bakerloo Line, Circle Line, Hammersmith & City Line, Jubilee, Metropolitan Line");
        stationsAndLines.put("London Bridge", "Jubilee Line, Northern Line");
        stationsAndLines.put("Embankment", "Bakerloo LIne, Circle Line, District Line, Northern Line");
        // Add more stations and lines as needed
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter a train station in Zone 1
        System.out.print("Enter a Zone 1 Station name: ");
        String stationName = scanner.nextLine();
        // Check if the station is in the map and retrieve the associated Tube lines
        if (stationsAndLines.containsKey(stationName)) {
            String tubeLines = stationsAndLines.get(stationName);
            System.out.println("The following Tube lines pass through " + stationName + ": " + tubeLines);
        } else {
            System.out.println("Station not found in Zone 1 or not in the provided list.");
        }
            scanner.close();
        }
    }


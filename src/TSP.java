import java.util.ArrayList;
import java.util.List;

public class TSP {
    public static void main (String args[]){
        System.out.println("TSP Brute force Program");
        System.out.println("");

        // Create list of Cities
        List<City> cities = new ArrayList<City>();

        // populate list of cities from file
        cities = FileScanner.scanFile("data/a280.tsp");
        // To see improvement over a reasonable span of time uncomment the following line
        //cities = FileScanner.scanFile("src/test.tsp");

        // get the number of nodes
        int numNodes = cities.size();
        System.out.println("Number of nodes: " + numNodes);

        // print the TSP solutions
        System.out.println("");
        System.out.println("The TSP solutions:");
        BruteForce bruteForce = new BruteForce();
        bruteForce.start(cities);
        System.out.println("");
        System.out.println("The optimal TSP solution:");
        System.out.println(bruteForce.shortestPath + " with a distance of " + bruteForce.shortestDistance);
    }
}

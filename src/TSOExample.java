import java.util.ArrayList;
import java.util.List;

public class TSOExample {
    public static void main (String args[]){
        System.out.println("TSO Brute force Program");
        System.out.println("");

        //System.out.println("List of Cities and their coordinates:");
        // Create list of Cities
        List<City> cities = new ArrayList<City>();

        // populate list of cities from file
        cities = FileScanner.scanFile("src/a280.tsp");

        /*
        // print out list of all Cities.
        for (City city : cities) {
            System.out.println(city.name + " " + city.x + " " + city.y);
        }
         */


        // get the number of nodes
        int numNodes = cities.size();
        System.out.println("Number of nodes: " + numNodes);

        // create a multi dimensional array to store the distances between each pair of cities
        int[][] distances = new int[numNodes][numNodes];

        // populate the distances array
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                distances[i][j] = cities.get(i).distanceTo(cities.get(j));
            }
        }

        /*
        // print out the distances array
        System.out.println("");
        System.out.println("The distances between each pair of cities:");
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                System.out.print(distances[i][j] + " ");
            }
            System.out.println("");
        }
         */

        // print the TSO solution
        System.out.println("");
        System.out.println("The TSO solution:");
        BruteForce bruteForce = new BruteForce();
        System.out.println(bruteForce.shortestPathSum(distances));
    }
}

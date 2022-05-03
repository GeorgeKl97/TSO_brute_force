import java.util.ArrayList;
import java.util.List;

public class TSOExample {
    public static void main (String args[]){
        System.out.println("TSO Brute force Program");
        System.out.println("");
        System.out.println("List of Cities and their coordinates:");
        // Create list of Cities
        List<City> cities = new ArrayList<City>();

        // Generate Test Cities
        City city1 = new City("1", 1, 1);
        City city2 = new City("2", 2, 2);
        City city3 = new City("3", 3, 4);
        City city4 = new City("4", 5, 5);
        City city5 = new City("5", 10, 10);

        // Add Cities to list
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);

        // print out list of all Cities.
        for (City city : cities) {
            System.out.println(city.toString());
        }

        // get the number of nodes
        int numNodes = cities.size();

        // create a multi dimensional array to store the distances between each pair of cities
        int[][] distances = new int[numNodes][numNodes];

        // populate the distances array
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                distances[i][j] = cities.get(i).distanceTo(cities.get(j));
            }
        }

        // print out the distances array
        System.out.println("");
        System.out.println("The distances between each pair of cities:");
        for (int i = 0; i < numNodes; i++) {
            for (int j = 0; j < numNodes; j++) {
                System.out.print(distances[i][j] + " ");
            }
            System.out.println("");
        }

        // print the TSO solution
        System.out.println("");
        System.out.println("The TSO solution:");
        BruteForce bruteForce = new BruteForce();
        System.out.println(bruteForce.shortestPathSum(distances));
    }
}

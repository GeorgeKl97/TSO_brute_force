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
        City city1 = new City("A", "1", "1");
        City city2 = new City("B", "1", "4");
        City city3 = new City("C", "5", "4");
        City city4 = new City("D", "5", "1");
        City city5 = new City("E", "9", "4");
        City city6 = new City("F", "9", "1");





        // Add Cities to list
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);




        // print out list of all Cities.
        for (City city : cities) {
            System.out.println(city.name + " " + city.x + " " + city.y);
        }




        // print the TSO solution
        System.out.println("");
        System.out.println("The TSO solution:");
        BruteForce bruteForce = new BruteForce();
        List<String> path = new ArrayList<String>();
        bruteForce.traverse(cities, path, 0, cities.get(0).getName());
        //BruteForce bruteForce = new BruteForce();
        //System.out.println(bruteForce.shortestPathSum(distances));
        System.out.println(bruteForce.shortestPath + " with a distance of " + bruteForce.shortestDistance);

    }
}

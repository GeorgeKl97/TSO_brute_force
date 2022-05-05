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
        City city7 = new City("G", "4", "7");
        City city8 = new City("H", "7", "7");
        City city9 = new City("I", "7", "4");
        City city10 = new City("J", "4", "1");
        City city11 = new City("K", "7", "9");
        City city12 = new City("L", "9", "9");
        City city13 = new City("M", "9", "7");
        City city14 = new City("N", "7", "5");
        City city15 = new City("O", "5", "5");
        City city16 = new City("P", "5", "7");






        // Add Cities to list
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);
        cities.add(city8);
        cities.add(city9);
        cities.add(city10);
        cities.add(city11);
        cities.add(city12);
        cities.add(city13);
        cities.add(city14);
        cities.add(city15);
        cities.add(city16);




        // print out list of all Cities.
        for (City city : cities) {
            System.out.println(city.name + " " + city.x + " " + city.y);
        }




        // print the TSO solution
        System.out.println("");
        System.out.println("The TSP solutions:");
        BruteForce bruteForce = new BruteForce();
        bruteForce.start(cities);
        System.out.println("");
        System.out.println("The optimal TSP solution:");
        System.out.println(bruteForce.shortestPath + " with a distance of " + bruteForce.shortestDistance);

    }
}

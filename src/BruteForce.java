import java.util.ArrayList;
import java.util.List;

public class BruteForce {

    int shortestDistance = Integer.MAX_VALUE;
    List<String> shortestPath = new ArrayList<>();


    void traverse (List<City> cities, List<String> path, int distance, String currentCity, City startCity) {

        Boolean pathFlag = false;
        List<String> currentPath = new ArrayList<>();
        currentPath.addAll(path);
        // Set the current city as the last city in the path
        for (String name : currentPath){
            if (name.equals(currentCity)){
                pathFlag = true;
            }
        }
        if (!pathFlag){
            currentPath.add(currentCity);
        }
        int currentCityId = 0;
        List<City> restOfCities = new ArrayList<City>();
        // add all other nodes to the restOfCities list
        for (int i = 0; i < cities.size(); i++) {
            if (cities.get(i).getName() != currentCity) {
                restOfCities.add(cities.get(i));
            } else {
                currentCityId = i;
            }
        }
        // we reached the end of the path
        if (restOfCities.size() == 0) {
            // go back to start city
            int distanceFromCurrentNode = cities.get(currentCityId).distanceTo(startCity);
            distance += distanceFromCurrentNode;
            // check if distance is smaller than current best distance
            if (distance < shortestDistance) {
                shortestDistance = distance;
                shortestPath.clear();
                shortestPath.addAll(currentPath);
                path.clear();
                currentPath.clear();
                System.out.println("Current shortest distance: " + shortestDistance + " with path: " + shortestPath);
            }
        }

        // get distance from the current node to all other nodes
        for (int j = 0; j < restOfCities.size(); j++) {
            int distanceFromCurrentNode = cities.get(currentCityId).distanceTo(restOfCities.get(j));
            // traverse this path further
            traverse(restOfCities, currentPath , distance + distanceFromCurrentNode, restOfCities.get(j).getName(), startCity);
        }
    }

    void start (List<City> cities) {
        List<String> path = new ArrayList<>();
        for (City city : cities) {
            traverse(cities, path, 0, city.getName(), city);
        }
    }
}

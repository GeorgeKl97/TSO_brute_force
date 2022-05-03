import java.util.ArrayList;
import java.util.List;

public class BruteForce {

    int shortestDistance = Integer.MAX_VALUE;
    List<String> shortestPath = new ArrayList<>();
    Boolean pathFlag = false;

    void traverse (List<City> cities, List<String> path, int distance, String currentCity) {

        // Set the current city as the last city in the path
        for (String name : path){
            if (name.equals(currentCity)){
                pathFlag = true;
            }
        }
        if (!pathFlag){
            path.add(currentCity);
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
            // check if distance is smaller than current best distance
            if (distance < shortestDistance) {
                shortestDistance = distance;
                shortestPath = path;
            }
        }

        // get distance from the current node to all other nodes
        for (int j = 0; j < restOfCities.size(); j++) {
            int distanceFromCurrentNode = cities.get(currentCityId).distanceTo(restOfCities.get(j));
            // traverse this path further
            traverse(restOfCities, path, distance + distanceFromCurrentNode, restOfCities.get(j).getName());
        }
    }
}

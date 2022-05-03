import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileScanner {

    // scans the file and returns a list of Cities
    public static List<City> scanFile(String fileName) {
        List<City> cities = new ArrayList<City>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if("NODE_COORD_SECTION".equals(line)){
                    while (scanner.hasNextLine()) {
                        line = scanner.nextLine();
                        String[] tokens = line.split("\\s+");
                        if (tokens.length == 3) {
                            City city = new City(tokens[0], tokens[1], tokens[2]);
                            cities.add(city);
                        }
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return cities;
    }
}

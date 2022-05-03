public class City {
    // instance variables
    String name;
    int x;
    int y;


    // method to create Cities
    public City(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public int distanceTo(City city) {
        int dx = x - city.x;
        int dy = y - city.y;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }
}

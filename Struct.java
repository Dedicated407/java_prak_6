package ikbo.prak6;

public class Struct {
    public String name;
    public int points;

    Struct(String name, int points){
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}

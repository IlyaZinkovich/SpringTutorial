package tutorial;

import java.util.List;

public class Triangle {

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    private List<Point> points;




    public void draw() {
        points.forEach(System.out::println);
    }
}

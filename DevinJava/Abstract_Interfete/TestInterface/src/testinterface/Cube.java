package testinterface;

public class Cube implements Shape {

    int x = 10;

    public double Area() {
        return (6 * x * x);
    }

    public double Volume() {
        return (x * x * x);
    }
}

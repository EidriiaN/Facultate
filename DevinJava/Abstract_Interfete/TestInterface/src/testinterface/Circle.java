package testinterface;

public class Circle implements Shape {

    int radious = 10;

    public double Area() {
        return (Math.PI * radious * radious);
    }

    public double Volume() {
        return 0;
    }
}

package Task_1_2;

public class Circle implements GeometricCalculation {


    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    @Override
    public double calculateArea() {
        return  (3.14*Math.pow(radious,2));
    }

    @Override
    public double calculatePerimeter() {

        return 2.00*3.14*radious;
    }
}

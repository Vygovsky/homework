package L10.task1.circle;

import L10.task1.shape.Shape;

/**
 * Created by roman_v on 02.06.17.
 */
public class Circle extends Shape{
    private double length;
    private double Area;
    private double radius;


    public void lengthCircle(double length) {
        lengthCircle(2 * Math.PI * radius);
    }

    public void circleArea(double ar) {
        circleArea(Math.PI * (radius * radius));
    }

    public Circle(double length, double area, double radius) {
        this.length = length;
        Area = area;
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.length, length) != 0) return false;
        if (Double.compare(circle.Area, Area) != 0) return false;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(Area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" + "length=" + length + ", Area=" + Area + ", radius=" + radius + '}';
    }

    @Override
    public void draw() {

    }
}

package lesson19.javadoc;

/**
 * @author Roman
 * @version 1
 * on 25.07.2017.
 */

public abstract class Shape {

    private String color;

    /**
     * Abstract method for drawing shapes
     */
    abstract void draw();

    /**
     * Returns the @return area of the default shape area
     */
    public double area() {
        return 0;
    }

    /**
     * The constructor takes @param color parameter color
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * @return The method returns the specified color
     */

    public String getColor() {
        return color;
    }

    /**
     * The @param color method in which you can write a color
     */
    public void setColor(String color) {
        this.color = color;
    }
}



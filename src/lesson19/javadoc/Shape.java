package lesson19.javadoc;

/**
 * @author Roman
 * @version 1
 * on 01.07.2017.
 */

public abstract class Shape {

    private String color;

    /**
     * Абстрактный  метод для рисования фигуры
     */
    abstract void draw();

    /**
     * Возвращает {@return area}площадь фигуры по умолчанию
     */
    public double area() {
        return 0;
    }

    /**
     * Конструктор принимат {@param color}  параметр цвет
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * @return Метод возвращает заданный цвет
     */

    public String getColor() {
        return color;
    }

    /**
     * Метот {@param color} в который можно записать цвет
     */
    public void setColor(String color) {
        this.color = color;
    }
}



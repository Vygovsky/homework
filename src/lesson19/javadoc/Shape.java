package lesson19.javadoc;

/**
 * @author Roman
 * @version 2
 * on 01.07.2017.
 */
public abstract class Shape {
    /**
     * <p>Абстрактный класс.</p>
     * <p>Присваевам приватную переменную, создаем
     * абстрактный метод и площадь фигуры, добавляем геттеры и сеттеры; </p>
     */

    private String color;

    /**
     * Абстрактный  метод для рисования фигуры
     */
    abstract void draw();

    /**
     * @return Возвращает плолощадь фигуры
     */
    public double area() {
        return 0;
    }

    /**
     * @param color Конструктор с параметрами color
     */
    public Shape(String color) {
        this.color = color;
    }

    /**
     * @return Возвращает метод геттера
     */

    public String getColor() {
        return color;
    }

    /**
     * @param color Возвращает метод сеттера
     */
    public void setColor(String color) {
        this.color = color;
    }
}



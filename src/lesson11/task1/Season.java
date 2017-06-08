package lesson11.task1;

/**
 * Created by roman_v on 07.06.17.
 */
enum Season {
    WINTER(0), SPRING(10), SUMMER(23), AUTUMN(16);

    Season(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    private int temp;
}
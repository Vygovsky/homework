package lesson25;

public enum Genre {
    DETECTIVE(10),
    FANTASTIC(15),
    CLASSIC(28),
    CHILDRENS_LITERATURE(25),
    DISPLAYS(12),
    POEMS(5);

    private int count;

    Genre(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Pear extends Fruit {
    private String sortNme;

    public Pear(String sortName, double cost, String sortNme) {
        super(sortName, cost);
        this.sortNme = sortNme;
    }

    @Override
    public double cost() {
        return 0;
    }


}

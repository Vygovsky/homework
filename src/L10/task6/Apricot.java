package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Apricot extends Fruit {
    private String sortName;

    public Apricot(String sortName, double cost, String sortName1) {
        super(sortName, cost);
        this.sortName = sortName1;
    }

    @Override
    public double cost() {
        return 0;
    }
}

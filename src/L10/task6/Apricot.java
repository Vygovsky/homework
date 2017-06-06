package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Apricot extends Fruit {
    enum Apricots {
        CUNAMI(60),
        LEDANA(58),
        LESKORE(63.52),
        KIOTO(69.30);
        private double cost;

        Apricots(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    public Apricot apricot;

    public Apricot(String name, Apricot apricot) {
        super(name);
        this.apricot = apricot;
    }

    public Apricot getApricot() {
        return apricot;
    }

    public void setApricot(Apricot apricot) {
        this.apricot = apricot;
    }

    public double cost() {
        return cost();
    }

}

package L10.task5;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Trumpet implements Tool {
    private double diameter;

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " труба.");
    }
}

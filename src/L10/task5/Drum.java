package L10.task5;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Drum implements Tool {
    private double size;

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " барабан.");
    }
}

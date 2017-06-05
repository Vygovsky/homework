package L9.task5;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Guitar implements Tool {
    private int stringNumber;

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " гитара.");

    }
}

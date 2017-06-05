package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Fruit[] type={
            new Apple("Макинтош ",Apple.Apples.MAKENTOSH),
            new Apple("Грин смит ",Apple.Apples.GREEN_SMIT),
            new Apple("Легол ",Apple.Apples.LIGOL),
        };
        double appels=0;
        for (Fruit apple : type) {
            appels+=apple.cost();

        }
    }
}

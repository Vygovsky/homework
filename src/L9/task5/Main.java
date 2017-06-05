package L9.task5;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Tool[] tools = {
            new Guitar(),
            new Drum(),
            new Trumpet()
        };
        for (Tool tool : tools) {
            tool.play();
        }
    }
}

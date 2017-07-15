package lesson17.task3;

import java.io.Serializable;

/**
 * Created by Roman_v on 15.07.2017.
 */
public class Horse extends Animal implements Serializable{
    private String name;
    private String halter;

    public Horse(String name, String halter) {
        this.name = name;
        this.halter = halter;
    }
}

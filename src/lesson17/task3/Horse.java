package lesson17.task3;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Roman_v on 15.07.2017.
 */
public class Horse extends Animal implements Serializable {
    private String name;
    private transient Halter halter;

    public Horse(String name, Halter halter) {
        this.name = name;
        this.halter = halter;
    }

    public Horse() {
    }

    public Halter getHalter() {
        return halter;
    }

    public void writObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeInt(halter.getSize());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            halter = new Halter(is.readInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

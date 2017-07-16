package lesson17.task3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Roman_v on 15.07.2017.
 */
public class MySerializableDemo {
    public static void main(String[] args) {
        Halter halter = new Halter(5);
        Horse horse = new Horse("Лошадка", halter);
        Horse horse1 = new Horse();

        System.out.println("До сереализации: " + horse);
        try (FileOutputStream fs = new FileOutputStream("src\\lesson17\\task3\\testSerHorse.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("src\\lesson17\\task3\\testSerHorse.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse1 = (Horse) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("После десереализации: " + horse1);
    }
}


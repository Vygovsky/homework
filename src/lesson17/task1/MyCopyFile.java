package lesson17.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by roman_v on 14.07.17.
 */
public class MyCopyFile {
    public static void main(String args[]) {
        try (FileInputStream fIn = new FileInputStream("src\\lesson17\\task1\\file.txt");
             FileOutputStream fOut = new FileOutputStream("src\\lesson17\\task1\\copied_file.txt")) {
            int a;
            while ((a = fIn.read()) != -1) {
                fOut.write(a);
            }
        } catch (IOException e) {
            System.out.println();
        }
    }
}

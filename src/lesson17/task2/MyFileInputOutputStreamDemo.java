package lesson17.task2;

import java.io.*;

/**
 * Created by roman_v on 14.07.17.
 */
public class MyFileInputOutputStreamDemo {
    public static void main(String args[]) {
        try(OutputStream output = new FileOutputStream("src\\lesson17\\task2\\file.txt")) {
            char c[] = {'a', 'b', 'c'};
            for (char c1:c) {
                output.write(c1); // Запись каждого символа в текстовый файл
            }
            output.close();

            InputStream input = new FileInputStream("src\\lesson17\\task2\\file.txt");
            int size = input.available();

            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
            }
            input.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}



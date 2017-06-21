package lesson17.task4;

import java.io.File;

public class DirList {
    public static void main(String args[]) {
        File catalog = new File("src");
        printInfo(catalog," ");
    }

    private static void printInfo(File file, String emptyString) {
        if (file.isDirectory()) {
            System.out.println(emptyString + file.getName());
            for (File f : file.listFiles()) {
                printInfo(f, emptyString + "  ");
            }

        } else {
            System.out.println(emptyString + file.getName());
        }
    }
}

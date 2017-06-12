package lesson11.task2;

/**
 * Created by roman_v on 09.06.17.
 */
public class Studio {
    public void clotheMan(Clothes[] clothes) {
        for (Clothes clotheMan : clothes) {
            if (clotheMan instanceof MenClothes) {
                System.out.println("Одеваем на мужщину " + clotheMan);
            }
        }
    }
}


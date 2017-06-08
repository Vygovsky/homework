package lesson11.task1;

/**
 * Created by roman_v on 08.06.17.
 */
public class DemoSeason {
    public static void main(String[] args) {
        Season season = Season.WINTER;
        Season temp = Season.WINTER;
        temp.getTemp();

        switch (season) {
            case WINTER: {
                System.out.println("Падает снег. Холодно");
                break;
            }
            case SPRING: {
                System.out.println("Тает снег");
                break;
            }
            case SUMMER: {
                System.out.println("Тепло");
                break;
            }
            case AUTUMN: {
                System.out.println("Опадают листья");
                break;
            }
        }
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getTemp());
            s.getTemp();
        }
        System.out.println();

        season = Season.valueOf("WINTER");
        System.out.println("Мой любимый сезон " + season);
    }
}

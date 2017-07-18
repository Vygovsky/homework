package lesson16.task2;

/**
 * Created by roman_v on 18.07.17.
 */
public class ShopTopSportDemo {
    public static void main(String[] args) {
        checkEnter(1);
        checkCategory(2);


    }

    public static void checkEnter(int x) {
        switch (x) {
            case 1:
                System.out.println("Авторизовать пользователя");
                break;
            case 2:
                System.out.println("Ввойти как гость");
                break;
            default:
                System.out.println("Некорректный выбор");
        }
    }

    public static void checkCategory(int x) {
        switch (x) {
            case 1:
                System.out.println("Мужская одежда");
                break;
            case 2:
                System.out.println("Женская одежда");
                break;
            case 3:
                System.out.println("Детская одежда");
                break;
            case 4:
                System.out.println("Инвентарь");
            default:
                System.out.println("Некорректный выбор");
        }
    }
}

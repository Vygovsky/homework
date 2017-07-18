package lesson16.task2;

import java.util.Scanner;

/**
 * Created by roman_v on 18.07.17.
 */
public class ShopTopSportDemo {
    public static void main(String[] args) {
        checkEnter(1);

        checkCategory(1);
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
                break;
            default:
                System.out.println("Некорректный выбор");
        }
    }

    public static int getEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Выберите как Вы хотите войти на сайт: ");

        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Некорректный выбор");
            System.exit(0);
        }
        return -1;
    }
}
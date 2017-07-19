package lesson16.task2;

import java.util.Scanner;

/**
 * Created by roman_v on 18.07.17.
 */
public class ShopTopSportDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.print("Выберите как Вы хотите войти на сайт:\n 1- Зарегистрироваться.\n 2- Зайти как гость: ");
            value = getEnter(scanner);
            checkEnter(value);
        } while (value < 1 || value > 2);

        System.out.println();
        int value2;
        do {
            System.out.print("Выберите категорию:\n 1-\"Мужская одежда\"\n 2-\"Женская одежда\"\n 3-\"Детская одежда\"\n 4-\"Инвентарь\"\n");
            value2 = getEnter(scanner);
            checkCategory(value2);
        } while (value2 < 1 || value2 > 4);
        checkCategory(getEnter(scanner));
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

    public static int getEnter(Scanner sc) {
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            sc.nextLine();
            return -1;
        }
    }
}
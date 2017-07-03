package lesson12.task2;

/**
 * Created by Roman_v on 17.06.2017.
 */
public class DemoLatinWords {
    public static void main(String[] args) {
        String s = "Сута: Суто:ри:) — видеоигра серии Sonic the Hedgehog в жанре гонки, изданная компанией\n " +
                "Sega для игровых приставок PlayStation\n" +
                " 2 и Wii в 2008 году. Официальным локализатором игры в России выступила компания «1С-СофтКлаб».";

        System.out.println(Seacher.getWords(s, "[A-Za-z]+"));
        System.out.println("Найдено количество латинских слов: " + Seacher.numberOfWords());
    }
}

package L8.flowers;

/**
 * Created by student on 5/24/2017.
 */
public class Main {
    public static void main(String[] args) {
        Flower[] buket = {
                new Flower("Tulip", 20),
                new Flower("Rose", 45),
                new Flower("Chrysanthemum", 15)
        };
        Flower[] buket2 = {
                new Flower("Romashka", 20),
                new Flower("Liliya", 45),
                new Flower("Mak", 10),
                new Flower("Kamish", 27),
                new Flower("Gladiolus", 10)
        };
        Flower[] buket3 = {
                new Flower("Helicodiceros muscivorus", 500),
                new Flower("Dracunculus vulgaris", 250),
                new Flower("Rafflesia arnoldii", 369),
        };
        System.out.println("Букет1 стоит " + getTotalCost(buket) + " гривен");
        System.out.println("Букет2 стоит " + getTotalCost(buket2) + " гривен");
        System.out.println("Букет3 стоит " + getTotalCost(buket3) + " гривен");
        System.out.println("Всего продано " + Flower.getCount() + " цветков");
    }

    public static double getTotalCost(Flower[] buket) {
        double totalCost = 0;
        for (Flower flower : buket) {
            totalCost += flower.getCost();
        }
        return totalCost;
    }
}
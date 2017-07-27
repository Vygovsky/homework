package lesson19.task4;

public class DemoPhilosopher {
    public static void main(String[] args) {
        Fork[] forks = new Fork[]{
                new Fork(),
                new Fork(),
                new Fork(),
                new Fork(),
                new Fork(),

        };
        Philosopher[] philosophers = new Philosopher[]{
                new Philosopher("Сократ", forks[0], forks[1]),
                new Philosopher("Николай", forks[1], forks[2]),
                new Philosopher("Анатолий", forks[3], forks[2]),
                new Philosopher("Генрих", forks[3], forks[4]),
                new Philosopher("Алексей", forks[4], forks[0]),
        };
        for (Philosopher philosopher : philosophers)
            new Thread(philosopher).start();
    }
}

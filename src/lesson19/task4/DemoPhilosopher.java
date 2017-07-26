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
                new Philosopher(1, forks[0], forks[1]),
                new Philosopher(2, forks[1], forks[2]),
                new Philosopher(3, forks[3], forks[2]),
                new Philosopher(4, forks[3], forks[4]),
                new Philosopher(5, forks[4], forks[0]),
        };
        for (Philosopher philosopher : philosophers)
            new Thread(philosopher).start();

    }
}

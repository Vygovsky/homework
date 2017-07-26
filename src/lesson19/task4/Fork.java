package lesson19.task4;

/**
 * Created by Roman_v on 24.07.2017.
 */
public class Fork {
    private Philosopher philosopher;

    public synchronized void takeFork() {
        philosopher.eat();
        while (true) {
            try {
                wait(2000);
                System.out.println("Ест " + philosopher);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        philosopher = null;
        notify();
    }

    public void dropFork() {
        System.out.println("Филосов кладет вилку на стол");

    }
}

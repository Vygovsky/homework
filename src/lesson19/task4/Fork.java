package lesson19.task4;

/**
 * Created by Roman_v on 24.07.2017.
 */
public class Fork {
    private Philosopher philosopher;

    public synchronized void takeFork(Philosopher philosopher) {
        while (this.philosopher != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.philosopher = philosopher;
    }

    public synchronized void dropFork() {
        this.philosopher = null;
        notify();
    }
}


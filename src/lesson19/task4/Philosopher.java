package lesson19.task4;

/**
 * Created by Roman_v on 24.07.2017.
 */
public class Philosopher implements Runnable {
    private int number;
    private Fork fork1;
    private Fork fork2;

    public Philosopher(int number, Fork fork1, Fork fork2) {
        this.number = number;
        this.fork1 = fork1;
        this.fork2 = fork2;
    }


    public void think() {
        fork1.dropFork();
        fork2.dropFork();
        try {
            System.out.println("Кладет вилки на стол");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void eat() {
        fork1.takeFork(this);
        fork2.takeFork(this);
        try {
            System.out.println("Кушает спагетти");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            eat();
            think();
        }
    }
}

package lesson19.task2;

public class MyThread2 extends Thread {
    private StringBuilder sb;

    public MyThread2(StringBuilder sb) {
        this.sb = sb;
    }
@Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(sb);
        }
        System.out.println();
        char ch=sb.charAt(0);
        sb.setCharAt(0,++ch);
    }
}

package lesson19.task2;

public class MyThread2 extends Thread {
    private StringBuilder sb;

    public MyThread2(StringBuilder sb) {
        this.sb = sb;
    }
@Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(sb);
        }
        char ch=sb.charAt(0);
        sb.setCharAt(0,++ch);
    }
}

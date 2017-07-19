package lesson19.task2;

public class MyThresdDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("p");
        MyThread2 thread1 = new MyThread2(sb);
        MyThread2 thread2 = new MyThread2(sb);
        MyThread2 thread3 = new MyThread2(sb);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

package lesson7.task2;

/**
 * Created by Roman_v on 20.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Matrix matrix= new Matrix();
        Matrix matrix2= new Matrix();
        matrix.fillRandomMatrix();
        matrix2.fillRandomMatrix();
        matrix.sum(matrix2);
        matrix.print();
    }

}

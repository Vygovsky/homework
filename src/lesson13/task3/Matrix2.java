package lesson13.task3;

/**
 * Created by roman_v on 10.07.17.
 */
public class Matrix2 {
    public static void main(String[] args) {
        Integer[][] iMatrix = new Integer[][]{{-50, 2, 23,}, {19, 6, -8}};
        Double[][] dMatrix = new Double[][]{{53.9, -2.3, 62.0,}, {28.3, 0.3, -5.0,}};
        Matrix <Integer> integerMatrix=new Matrix<>(iMatrix);
        Matrix <Double>doubleMatrix=new Matrix<>(dMatrix);
        Matrix sum=integerMatrix.sum(integerMatrix);
        Matrix multiply = doubleMatrix.multiply(doubleMatrix);
        System.out.println(multiply);
        System.out.println();
        System.out.println(sum);


    }
}
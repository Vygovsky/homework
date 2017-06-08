package lesson7.task2;

public class Matrix {
    private double[][] matrix;
    private int rowsNum;
    private int colunsNum;

    public Matrix() {
        this(4, 4);
    }

    public Matrix(int rowsNum, int colunsNum) {
        matrix = new double[rowsNum][colunsNum];
        this.setRowsNum(rowsNum);
        this.setColunsNum(colunsNum);
    }

    public int getRowsNum() {
        return rowsNum;
    }

    private void setRowsNum(int rowsNum) {
        this.rowsNum = rowsNum;
    }

    public int getColunsNum() {
        return colunsNum;
    }

    private void setColunsNum(int colunsNum) {
        this.colunsNum = colunsNum;
    }

    public void setElement(int row, int column, double value) {
        matrix[row][column] = value;
    }

    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public void print() {
        for (int i = 0; i < getRowsNum(); i++) {
            for (int j = 0; j < getColunsNum(); j++) {
                System.out.print(getElement(i, j) + "\t");
            }
            System.out.println();
        }
    }

    public void fillRandomMatrix() {
        for (int i = 0; i < getRowsNum(); i++) {
            for (int j = 0; j < getColunsNum(); j++) {
                setElement(i, j, Math.random() * 100);
            }
        }
    }

    public void sum(Matrix m2) {
        if (this.getRowsNum() == m2.getRowsNum() && this.getColunsNum() == m2.getColunsNum()) {
            System.out.println("Матрицы имеет одинаковую размерность");
            for (int i = 0; i < getRowsNum(); i++) {
                for (int j = 0; j < getColunsNum(); j++) {
                    this.setElement(i, j, this.getElement(i, j) + m2.getElement(i, j));
                }
            }
        } else {
            System.out.println("Матрицы имеют разные размерности");
        }
    }

    public void multiply(double d) {
        for (int i = 0; i < getRowsNum(); i++) {
            for (int j = 0; j < getColunsNum(); j++) {
                this.setElement(i, j, this.getElement(i, j) * d);
            }
        }
    }
}


package Models;

import Shared.Complex;

import java.util.Arrays;

public class Matrix {
    private int rows;
    private int columns;
    private Complex[][] data;

    public Matrix(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.data = new Complex[rows][columns];
    }

    /**
     * Add the given item to the given location in the matrix
     * @param item
     * @param row
     * @param column
     */
    public void add(Complex item, int row, int column){
        data[row][column] = item;
    }

    public Complex getDataAt(int row, int column){
        return data[row][column];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}

package Controllers;

import Models.Matrix;
import Shared.Complex;
import Views.MatrixView;

import javax.swing.*;

public class MatrixController {
    public MatrixController(){
        JFrame frame = new JFrame("Matrix Calculator");
        frame.setContentPane(new MatrixView().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public Matrix mul(Matrix A, Matrix B){

        Matrix newMatrix = new Matrix(A.getRows(), B.getColumns());

        if(A.getColumns() != B.getRows()){
            try {
                throw new Exception("The two Matrices cannot be multiplied.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for(int rowA = 0; rowA < A.getRows(); rowA++ ){
            // for each row
            for (int columnB = 0; columnB < B.getColumns(); columnB++) {
                Complex results = new Complex(0,0);
                for(int columnA = 0; columnA < A.getColumns(); columnA++ ){
                    // For each item in the row
                    Complex a = A.getDataAt(rowA, columnA);
                    Complex b = B.getDataAt(columnA, columnB);
                    Complex product = a.mul(b);
                    results = results.add(product);
                }
                newMatrix.add(results, rowA, columnB);
            }
        }

        return newMatrix;
    }

}

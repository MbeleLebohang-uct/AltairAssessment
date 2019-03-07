package Controllers;

import Models.Matrix;
import Shared.Complex;
import Views.MatrixView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MatrixController {
    private MatrixView view;

    public MatrixController(MatrixView view, String title){
        this.view = view;

        JFrame frame = new JFrame(title);
        frame.setContentPane(view.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        // Initialize the controller
        initController();
    }

    /**
     * Multiply the given matrix and return the results. That is C = AB. Note AB != BA according to algebra,
     * so the order is important
     * @param A
     * @param B
     * @return
     */
    private Matrix mul(Matrix A, Matrix B){

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

    /**
     * Initialize the controller
     */
    private void initController(){
        view.getCalculateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Matrix matrixA = getMatrixA();
                Matrix matrixB = getMatrixB();

                Matrix matrixC = mul(matrixA, matrixB);

                // Update the view with the results
                setMatrixCView(matrixC);


                int row = (view.getRowTextField().getText().isEmpty()) ? 0 : Integer.parseInt(view.getRowTextField().getText());
                int column = (view.getColumnTextField().getText().isEmpty()) ? 0 : Integer.parseInt(view.getColumnTextField().getText());

                if(row >= column) {
                    // Get floyd value
                    int floydValue = getFloydValue(row, column);

                    // Set floyd value
                    view.getItemValueTextField().setText(floydValue + "");
                }
                else{
                    JOptionPane.showMessageDialog(null,"The Row number cannot be smaller that the Column number.", "Logic Error", JOptionPane.ERROR_MESSAGE);
                }

            }

            /**
             * Collect all the values in the field of matrix A and generate a matrix
             * @return Matrix A object
             */
            private Matrix getMatrixA() {
                // get item x,y real and imag values, and make a complex number with them. Add that to the matrix
                double real, imag;
                Matrix matrixA = new Matrix(2, 3);

                // Get items in Row 1
                real = (view.getRealAIndex11().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealAIndex11().getText());
                imag = (view.getImagAIndex11().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagAIndex11().getText());
                matrixA.add(new Complex(real, imag), 0, 0);

                real = (view.getRealAIndex12().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealAIndex12().getText());
                imag = (view.getImagAIndex12().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagAIndex12().getText());
                matrixA.add(new Complex(real, imag), 0, 1);

                real = (view.getRealAIndex13().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealAIndex13().getText());
                imag = (view.getImagAIndex13().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagAIndex13().getText());
                matrixA.add(new Complex(real, imag), 0, 2);

                // Get the items in Row 2
                real = (view.getRealAIndex21().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealAIndex21().getText());
                imag = (view.getImagAIndex21().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagAIndex21().getText());
                matrixA.add(new Complex(real, imag), 1, 0);

                real = (view.getRealAIndex22().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealAIndex22().getText());
                imag = (view.getImagAIndex22().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagAIndex22().getText());
                matrixA.add(new Complex(real, imag), 1, 1);

                real = (view.getRealAIndex23().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealAIndex23().getText());
                imag = (view.getImagAIndex23().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagAIndex23().getText());
                matrixA.add(new Complex(real, imag), 1, 2);

                return matrixA;
            }

            /**
             * Collect all the values in the field of matrix B and generate a matrix
             * @return Matrix B object
             */
            private Matrix getMatrixB() {
                // get item x,y real and imag values, and make a complex number with them. Add that to the matrix
                double real, imag;
                Matrix matrixB = new Matrix(3, 2);

                // Get items in Row 1
                real = (view.getRealBIndex11().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealBIndex11().getText());
                imag = (view.getImagBIndex11().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagBIndex11().getText());
                matrixB.add(new Complex(real, imag), 0, 0);

                real = (view.getRealBIndex12().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealBIndex12().getText());
                imag = (view.getImagBIndex12().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagBIndex12().getText());
                matrixB.add(new Complex(real, imag), 0, 1);

                // Get items in Row 2
                real = (view.getRealBIndex21().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealBIndex21().getText());
                imag = (view.getImagBIndex21().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagBIndex21().getText());
                matrixB.add(new Complex(real, imag), 1, 0);

                real = (view.getRealBIndex22().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealBIndex22().getText());
                imag = (view.getImagBIndex22().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagBIndex22().getText());
                matrixB.add(new Complex(real, imag), 1, 1);

                // Get items in Row 3

                real = (view.getRealBIndex31().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealBIndex31().getText());
                imag = (view.getImagBIndex31().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagBIndex31().getText());
                matrixB.add(new Complex(real, imag), 2, 0);

                real = (view.getRealBIndex32().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getRealBIndex32().getText());
                imag = (view.getImagBIndex32().getText().isEmpty()) ? 0.0 : Double.parseDouble(view.getImagBIndex32().getText());
                matrixB.add(new Complex(real, imag), 2, 1);

                return matrixB;
            }

            /**
             * Set the values of the Matrix C field using the given matrix
             * @param matrix
             */
            private void setMatrixCView(Matrix matrix) {
                // Set the fields of row 1
                view.getRealCIndex11().setText(matrix.getDataAt(0, 0).getReal() + "");
                view.getImagCIndex11().setText(matrix.getDataAt(0, 0).getImag() + "");

                view.getRealCIndex12().setText(matrix.getDataAt(0, 1).getReal() + "");
                view.getImagCIndex12().setText(matrix.getDataAt(0, 1).getImag() + "");

                // Set the fields of row 2
                view.getRealCIndex21().setText(matrix.getDataAt(1, 0).getReal() + "");
                view.getImagCIndex21().setText(matrix.getDataAt(1, 0).getImag() + "");

                view.getRealCIndex22().setText(matrix.getDataAt(1, 1).getReal() + "");
                view.getImagCIndex22().setText(matrix.getDataAt(1, 1).getImag() + "");
            }

            /**
             * Recursively find the Floyd's value at the given position(row, column).
             * row = 0, 1, 2, 3, ... and column = 0, 1, 2, 3, ...
             * @param row
             * @param column
             * @return floyds value
             */
            private int getFloydValue(int row, int column) {
                /*
                 * Before I get into it, let me explain my train of thought. if we write this values down, we can
                 * see some patterns and relationships between the row, column and value.
                 *
                 * Row          Column          Value
                 * 0            0               1
                 * 1            0               2
                 * 1            1               3
                 * 2            0               4
                 * 2            1               5
                 * 2            2               6
                 * 3            0               7
                 * 3            1               8
                 * 3            2               9
                 * 3            3               10
                 * 4            0               11
                 * 4            1               12
                 * 4            2               13
                 * 4            3               14
                 * 4            4               15
                 *
                 * We can clearly see that, For all values of Value, Column <= Row. That is, the value of Column never
                 * exceeds the value of Row.
                 *
                 * The base case of this algorithm is Row = 0, Column = 0.
                 * */

                if(row == 0 && column == 0){
                    // Base case
                    return 1;
                }
                else {
                    /*
                     * We are going to decrement our row and column until we get to the Base case.
                     * Thus, as we can see see from above, we are going to first decrement the column until its 0.
                     * When Column - 1 == -1, we know that its time to decrement the Row. At this point the column will
                     * start counting for the value of the row, that is Column = Row
                     */
                    if(column - 1 < 0){
                        row -= 1;
                        column = row;
                        return 1 + getFloydValue(row, column);
                    }
                    else{
                        return 1 + getFloydValue(row, column - 1);
                    }
                }
            }
        });

    }
}

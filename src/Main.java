import Controllers.MatrixController;
import Models.Matrix;
import Shared.Complex;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Matrix A = new Matrix(2, 3);
        A.add(new Complex(1, -3), 0, 0);
        A.add(new Complex(2, 0), 0, 1);
        A.add(new Complex(2, 3), 0, 2);
        A.add(new Complex(2, 1), 1, 0);
        A.add(new Complex(-1, -1), 1, 1);
        A.add(new Complex(1, 2), 1, 2);



        A.PrintMaxtrix();
        System.out.println();

        Matrix B = new Matrix(3, 2);
        B.add(new Complex(1, 1), 0, 0);
        B.add(new Complex(2, 3), 0, 1);
        B.add(new Complex(0, 2), 1, 0);
        B.add(new Complex(1, 0), 1, 1);
        B.add(new Complex(2, -1), 2, 0);
        B.add(new Complex(0, -2), 2, 1);
        B.PrintMaxtrix();

        MatrixController c = new MatrixController();

        Matrix C = c.mul(A, B);
        System.out.println("--------------------");
        C.PrintMaxtrix();


    }
}

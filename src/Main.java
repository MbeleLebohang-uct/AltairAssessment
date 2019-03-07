import Controllers.MatrixController;
import Models.Matrix;
import Shared.Complex;
import Views.MatrixView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Altair!");

        MatrixView view = new MatrixView();
        MatrixController controller = new MatrixController(view, "Matrix Calculator");

        System.out.println("--------- End -----------");

    }
}

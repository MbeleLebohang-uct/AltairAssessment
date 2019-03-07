package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatrixView {
    private JProgressBar statusBar;
    private JToolBar menuBar;
    private JPanel matrixAPanel;
    private JPanel matrixCPanel;
    private JLabel rowLabel;
    private JLabel columnLabel;
    private JLabel itemValueLabel;
    private JPanel matrixBPanel;
    private JPanel textFieldsPanel;
    private JLabel emptyLabel0;
    private JLabel rowA1;
    private JLabel rowA2;
    private JLabel realColumnALabel1;
    private JLabel imagColumnALabel1;
    private JLabel realColumnALabel2;
    private JLabel realColumnALabel3;
    private JLabel imagColumnALabel2;
    private JLabel imagColumnALabel3;
    private JLabel EmptyLabel1;
    private JLabel rowB1;
    private JLabel rowB2;
    private JLabel realColumnB1;
    private JLabel realColumnB2;
    private JLabel imagColumnB1;
    private JLabel imagColumnB2;
    private JLabel EmptyLabel2;
    private JLabel rowC1;
    private JLabel rowC2;
    private JLabel rowB3;
    private JLabel realColumnC1;
    private JLabel realColumnC2;
    private JLabel imagColumnC1;
    private JLabel imagColumnC2;

    // Matrix A fields
    private JTextField realAIndex11;
    private JTextField imagAIndex11;
    private JTextField realAIndex12;
    private JTextField imagAIndex12;
    private JTextField realAIndex13;
    private JTextField realAIndex21;
    private JTextField imagAIndex21;
    private JTextField realAIndex22;
    private JTextField imagAIndex22;
    private JTextField realAIndex23;
    private JTextField imagAIndex23;
    private JTextField imagAIndex13;

    // Matrix B fields
    private JTextField realBIndex11;
    private JTextField imagBIndex11;
    private JTextField realBIndex12;
    private JTextField imagBIndex12;
    private JTextField imagBIndex22;
    private JTextField imagBIndex21;
    private JTextField realBIndex21;
    private JTextField realBIndex31;
    private JTextField imagBIndex31;
    private JTextField realBIndex32;
    private JTextField imagBIndex32;
    private JTextField realBIndex22;

    // Matrix C fields
    private JTextField realCIndex11;
    private JTextField imagCIndex11;
    private JTextField realCIndex12;
    private JTextField imagCIndex12;
    private JTextField realCIndex21;
    private JTextField imagCIndex21;
    private JTextField realCIndex22;
    private JTextField imagCIndex22;

    // Other fields
    private JTextField rowTextField;
    private JTextField columnTextField;
    private JTextField itemValueTextField;

    private JButton calculateButton;
    private JPanel mainPanel;

    public MatrixView() {
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
    public JButton getCalculateButton(){
        return calculateButton;
    }

    public JTextField getRealAIndex11() {
        return realAIndex11;
    }

    public JTextField getImagAIndex11() {
        return imagAIndex11;
    }

    public JTextField getRealAIndex12() {
        return realAIndex12;
    }

    public JTextField getImagAIndex12() {
        return imagAIndex12;
    }

    public JTextField getRealAIndex13() {
        return realAIndex13;
    }

    public JTextField getRealAIndex21() {
        return realAIndex21;
    }

    public JTextField getImagAIndex21() {
        return imagAIndex21;
    }

    public JTextField getRealAIndex22() {
        return realAIndex22;
    }

    public JTextField getImagAIndex22() {
        return imagAIndex22;
    }

    public JTextField getRealAIndex23() {
        return realAIndex23;
    }

    public JTextField getImagAIndex23() {
        return imagAIndex23;
    }

    public JTextField getImagAIndex13() {
        return imagAIndex13;
    }

    public JTextField getRealBIndex11() {
        return realBIndex11;
    }

    public JTextField getImagBIndex11() {
        return imagBIndex11;
    }

    public JTextField getRealBIndex12() {
        return realBIndex12;
    }

    public JTextField getImagBIndex12() {
        return imagBIndex12;
    }

    public JTextField getImagBIndex22() {
        return imagBIndex22;
    }

    public JTextField getImagBIndex21() {
        return imagBIndex21;
    }

    public JTextField getRealBIndex21() {
        return realBIndex21;
    }

    public JTextField getRealBIndex31() {
        return realBIndex31;
    }

    public JTextField getImagBIndex31() {
        return imagBIndex31;
    }

    public JTextField getRealBIndex32() {
        return realBIndex32;
    }

    public JTextField getImagBIndex32() {
        return imagBIndex32;
    }

    public JTextField getRealBIndex22() {
        return realBIndex22;
    }

    public JTextField getRealCIndex11() {
        return realCIndex11;
    }

    public JTextField getImagCIndex11() {
        return imagCIndex11;
    }

    public JTextField getRealCIndex12() {
        return realCIndex12;
    }

    public JTextField getImagCIndex12() {
        return imagCIndex12;
    }

    public JTextField getRealCIndex21() {
        return realCIndex21;
    }

    public JTextField getImagCIndex21() {
        return imagCIndex21;
    }

    public JTextField getRealCIndex22() {
        return realCIndex22;
    }

    public JTextField getImagCIndex22() {
        return imagCIndex22;
    }

    public JTextField getRowTextField() {
        return rowTextField;
    }

    public JTextField getColumnTextField() {
        return columnTextField;
    }

    public JTextField getItemValueTextField() {
        return itemValueTextField;
    }

}

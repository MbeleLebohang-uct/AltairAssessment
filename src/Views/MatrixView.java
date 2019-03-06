package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatrixView {
    private JProgressBar statusBar;
    private JToolBar menuBar;
    private JPanel matrixAPanel;
    private JPanel matrixCPanel;
    private JTextField rowTextField;
    private JTextField columnTextField;
    private JTextField itemValueTextField;
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
    private JTextField realAIndex11;
    private JTextField imagAIndex11;
    private JTextField realAIndex12;
    private JTextField imagAIndex12;
    private JTextField realAIndex13;
    private JPasswordField imagAIndex13;
    private JTextField realAIndex21;
    private JTextField imagAIndex21;
    private JTextField realAIndex22;
    private JTextField imagAIndex22;
    private JTextField realAIndex23;
    private JTextField imagAIndex23;
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
    private JTextField realBIndex11;
    private JTextField imagBIndex11;
    private JTextField realBIndex12;
    private JTextField imagBIndex12;
    private JTextField imagBIndex22;
    private JPasswordField realBIndex22;
    private JTextField imagBIndex21;
    private JTextField realBIndex21;
    private JTextField realBIndex31;
    private JTextField imagBIndex31;
    private JTextField realBIndex32;
    private JTextField imagBIndex32;
    private JTextField realCIndex11;
    private JTextField imagCIndex11;
    private JTextField realCIndex12;
    private JTextField imagCIndex12;
    private JTextField realCIndex21;
    private JTextField imagCIndex21;
    private JTextField realCIndex22;
    private JTextField imagCIndex22;
    private JButton calculateButton;
    private JPanel mainPanel;

    public MatrixView() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}

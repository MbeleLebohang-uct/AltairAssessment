package Controllers;
import Models.User;
import Views.UserView;

import javax.swing.*;

public class UserConstroller {
    private User user;
    private UserView userView;

    public UserConstroller(User user, UserView userView) {
        this.user = user;
        this.userView = userView;

        this.initView();
    }

    private void initView(){
        userView.getFirstnameTextfield().setText(user.getFirstname());
        userView.getLastnameTextfield().setText(user.getLastname());
    }

    public void initController(){
        userView.getFirstnameSaveButton().addActionListener(e -> saveFirstName());
        userView.getLastnameSaveButton().addActionListener(e -> saveLastName());
        userView.getHello().addActionListener(e -> sayHello());
        userView.getBye().addActionListener(e -> sayBye());
    }

    private void saveFirstName() {
        user.setFirstname(userView.getFirstnameTextfield().getText());

        JOptionPane.showMessageDialog(null, "First name saved", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveLastName() {
        user.setLastname(userView.getLastnameTextfield().getText());

        JOptionPane.showMessageDialog(null, "Last name saved", "Info", JOptionPane.INFORMATION_MESSAGE);

    }

    private void sayHello() {
        JOptionPane.showMessageDialog(null, "Hello " + user.getFirstname() + " " + user.getLastname(), "Greeting", JOptionPane.INFORMATION_MESSAGE);

    }

    private void sayBye() {
        JOptionPane.showMessageDialog(null, "Bye " + user.getFirstname() + " " + user.getLastname(), "Greeting", JOptionPane.INFORMATION_MESSAGE);

    }



}

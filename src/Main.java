import Controllers.UserConstroller;
import Models.User;
import Views.UserView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        User user = new User("Mbele", "Lebohang");
        UserView userView = new UserView("Altair Challenge");

        UserConstroller userConstroller = new UserConstroller(user, userView);
        userConstroller.initController();
    }
}

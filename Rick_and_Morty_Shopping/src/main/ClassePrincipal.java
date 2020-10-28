package main;

import Views.Login;
import conexoes.MySQL;

public class ClassePrincipal {
    public static void main(String[] args) {
        MySQL mysql = new MySQL();
        mysql.conectaBanco();
        Login login = new Login();
        login.setVisible(true);
    }
}

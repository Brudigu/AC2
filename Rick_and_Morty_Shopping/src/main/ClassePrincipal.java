package main;

import conexoes.MySQL;

public class ClassePrincipal {
    public static void main(String[] args) {
        MySQL mysql = new MySQL();
        mysql.conectaBanco();
    }
}

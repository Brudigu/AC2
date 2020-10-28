package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {
    private static Connection conn = null;
    private static Statement statement;
    private static ResultSet resultSet;
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "banco_morick";
    private String usuario;
    private String senha;
    
    public MySQL(){
        
    }
    
    MySQL(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        MySQL.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        MySQL.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        MySQL.resultSet = resultSet;
    }
    
    public void conectaBanco() {
        try {
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_morick?useTimezone=true&serverTimezone=UTC" + servidor + "/" + nomeDoBanco, usuario, senha);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_morick?useTimezone=true&serverTimezone=UTC", "root", "@gowB12345");
            if(conn != null) System.out.println("Conexão efetuada com sucesso!" + "ID: " + conn);
        } catch (SQLException e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        } 
    }
    
    public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
 
    public int insertSQL(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());
 
            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(SQL);            
 
            return status;
        } catch (SQLException ex) {
            return status;
        }
    }
 
    public void executarSQL(String sql) {
        try {
            MySQL.statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            MySQL.resultSet = MySQL.statement.executeQuery(sql);
 
//            while (this.getResultSet().next()) {
//                System.out.println(this.getResultSet().getInt(1));
//            }
        } catch (SQLException sqlex) {
        }
    }
 
}

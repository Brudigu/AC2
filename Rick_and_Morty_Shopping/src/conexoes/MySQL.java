package conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQL {
    private Connection conn = null;
    private Statement statement;
    
    private String servidor = "localhost:3306";
    private String nomeDoBanco = "banco_morick";
    private String usuario = "root";
    private String senha = "@gowB12345";
    
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
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }
    
    public void conectaBanco(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
            if(conn != null) System.out.println("Conexão efetuada com sucesso!" + "ID: " + conn);
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
}

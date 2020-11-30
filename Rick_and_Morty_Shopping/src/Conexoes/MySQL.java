package conexoes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MySQL {
    
    private Connection conn = null;
    private Statement statement;
    private ResultSet resultSet;

    
    private String servidor = "127.0.0.1:3306";
    private String nomedoBanco = "banco_loja";
    private String usuario = "root";
    private String senha = "root";

    
    public ResultSet getResultSet() {
        return resultSet;
    }
    
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
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

    public String getServidor() {
        return servidor;
    }

    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    public String getNomedoBanco() {
        return nomedoBanco;
    }

    public void setNomedoBanco(String nomedoBanco) {
        this.nomedoBanco = nomedoBanco;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
            public void conectaBanco(){
            try {
            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomedoBanco, usuario, senha);
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
            }
            
            public boolean fechaBanco(){
                try {
                    conn.close();
                    return true;
                    
                } catch (Exception e) {
                    System.out.println("Erro ao fechar conexao" + e.getMessage());
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
            ex.printStackTrace();
            return status;
        }
    }
 
    public void executarSQL(String sql) {
        try {
            this.statement = conn.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);
 
//            while (this.getResultSet().next()) {
//                System.out.println(this.getResultSet().getInt(1));
//            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }
             
    public boolean updateSQL(String pSQL){
        try {            
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            getStatement().executeUpdate(pSQL);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
          
           
            
            
            
            
}
            
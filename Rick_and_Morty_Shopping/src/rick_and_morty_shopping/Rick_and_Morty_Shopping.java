/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rick_and_morty_shopping;

import Conexoes.ConexaoMySql;

/**
 *
 * @author Win10
 */
public class Rick_and_Morty_Shopping {

    public static void main(String[] args) {
        
        ConexaoMySql Conexao = new ConexaoMySql();
        Conexao.conectar();
        
    }
    
}

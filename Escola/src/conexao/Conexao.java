/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

   private Connection conexao;

        
    public Conexao() {        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/crud_escola", 
                "root", 
                    "");
            
            System.out.println("Conectado");
        }
        catch ( Exception e ){
            System.out.println("Não conectado");
            e.printStackTrace();
        }
    }
    
    public Connection getConexao(){
        return conexao;
    } 

    public static void main(String[] args) {
        Conexao c = new Conexao();
    }    

  
}


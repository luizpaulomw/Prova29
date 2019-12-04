package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
        String url = "jdbc:mysql://localhost:3306/contas";
        String user = "root";
        String password = "";
        
        Connection Conexao = DriverManager.getConnection(url,user,password);

        System.out.println("Conexão OK " + Conexao.toString() );

    

    
}
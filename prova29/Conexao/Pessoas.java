package Conexao;

import java.sql.Connection;

public class Pessoas {
   
    
    private static int id;
    private static String nome;
    private String email;
 

    public Pessoas() {
    }

    public Pessoas(int id) {
        Pessoas.id = id;
    }

    public Pessoas(String nome, String email) {
        Pessoas.nome = nome;
        this.email = email;    
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Pessoas id(int id) {
        this.id = id;
        return this;
    }

    public Pessoas nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoas email(String email) {
        this.email = email;
        return this;
    }

	public static Connection getConnection() {
        return null;
    }


} 






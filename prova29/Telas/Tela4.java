package Telas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Tela4 extends JFrame {
    private JTextArea textArea;
    String textoTela;

    public Tela4(int mostrar) {

        super("Contas");
        String url = "jdbc:mysql://localhost:3306/contas";
        String user = "root";
        String password = "";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = " Select * from pessoas ";
            Statement statement = connection.createStatement();
            ResultSet resultados = statement.executeQuery(sql);
            while (resultados.next()) {
                Tela1 pessoa = new Tela1 (resultados.getInt("id"), resultados.getString("Nome"),
                        resultados.getString("Email"));
               
                textoTela = textoTela + "Nome: " + resultados.getString("Nome") + "\n Email: "
                        + resultados.getString("Email") + "\n";

                if (mostrar == 1) {
                   
                }
            }
        } catch (Exception er) {
            System.out.println("Não foi possivel cadastra " + er);
        }

        textArea = new JTextArea(textoTela);
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));
        pane.add(textArea);
        this.setVisible(true);
        this.setSize(300,300 );
        this.setContentPane(pane);
    }

}
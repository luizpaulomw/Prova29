
package Telas;
import java.awt.*;
import javax.swing.*;

import Conexao.Proventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;;

public class Tela2 extends JFrame {
    private JButton botao;
    private JTextField textAno;
    private JLabel labelAno;
    private JTextField textValor;
    private JLabel labelValor;
    private JTextField textMes;
    private JLabel labelMes;
    private JTextField textImposto;
    private JLabel labelImposto;
    private JTextField textPessoa;
    private JLabel labelPessoa;

    public Tela2() {
        super("Proventos");
        botao = new JButton("Gravar");
        textAno = new JTextField(25);
        labelAno = new JLabel("Ano");
        textValor = new JTextField(25);
        labelValor = new JLabel("Valor");
        textMes = new JTextField(25);
        labelMes = new JLabel("Mes");
        textImposto = new JTextField(25);
        labelImposto = new JLabel("Imposto");
        textPessoa = new JTextField(25);
        labelPessoa = new JLabel("Id Pessoas");

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(labelPessoa);
        pane.add(textPessoa);

        pane.add(labelMes);
        pane.add(textMes);

        pane.add(labelAno);
        pane.add(textAno);

        pane.add(labelValor);
        pane.add(textValor);

        pane.add(labelImposto);
        pane.add(textImposto);

        pane.add(botao);
        this.setVisible(true);
        this.setSize(300, 300);
        this.setContentPane(pane);

        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(final ActionEvent event) {
                methodAction(event);
            }
        };
       
        botao.addActionListener(handlerAction);
    }

    private void methodAction(final ActionEvent e) {
     
        if (e.getSource() == botao) {
            int Ano = Integer.parseInt(textAno.getText());
            double Valor = Double.parseDouble(textValor.getText());
            int Mes = Integer.parseInt(textMes.getText());
            int Imposto = Integer.parseInt(textMes.getText());
            String url = "jdbc:mysql://localhost:3306/contas";
            String user = "root";
            String password = "";
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String sql = " Select * from pessoas where id =" + textPessoa.getText();
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultados = statement.executeQuery(sql);
                while (resultados.next()) {

                            
                    DAO dao = new DAO();
                    String insertUser = "INSERT INTO proventos " + 
                                            "(mes,ano,valor,imposto) " + 
                                        "VALUES(?,?,?,?)";
                  
                    
                    System.out.println("Exibindo os Usuários: ");
                    Conexao.findUser(connection);
                    connection.close();
                    
                }
            } catch (Exception er) {
                System.out.println("Não Foi Cadastrado " + er);
            }

            
        }

    }

	public static JButton getSource() {
		return null;
	    }
    }
}
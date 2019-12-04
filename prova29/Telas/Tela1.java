package Telas;


import java.awt.*;

import javax.crypto.MacSpi;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Tela1 extends JFrame {
  
    private static final long serialVersionUID = 1L;
    private JButton botao;
    private JTextField textNome;
    private JLabel labelNome;
    private JTextField textEmail;
    private JLabel labelEmail;
    private JTextField textId;
    private JLabel labelId;

    public Tela1(int i, String string, String string2) {
        super("Pessoas");
        botao = new JButton("Cadastra");

        textId = new JTextField(25);
        labelId = new JLabel("Id");

        textNome = new JTextField(25);
        labelNome = new JLabel("Nome");

        textEmail = new JTextField(25);
        labelEmail = new JLabel("Email");


        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(labelId);
        pane.add(textId);

        pane.add(labelNome);
        pane.add(textNome);

        pane.add(labelEmail);
        pane.add(textEmail);

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
                                            "(id,nome,email) " + 
                                        "VALUES(?,?,?)";
                  
                    
                    System.out.println("Exibindo os Usuários: ");
                    Conexao.findUser(connection);
                    connection.close();
                    
                }
            } catch (Exception er) {
                System.out.println("Não Foi Cadastrado " + er);
            }
            
	public static JButton getSource() {
		return null;

    } 

    }
           
}
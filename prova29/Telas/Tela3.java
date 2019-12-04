package Telas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela3 extends JFrame {
    private JButton botao;
    private JTextField textAno;
    private JLabel labelAno;
    private JTextField textValor;
    private JLabel labelValor;
    private JTextField textMes;
    private JLabel labelMes;
    private JTextField textPerd;
    private JLabel labelPerd;

    public Tela3() {
        super("Dividas");
        botao = new JButton("Cadastra");
        textAno = new JTextField(25);
        labelAno = new JLabel("Ano");
        textValor = new JTextField(25);
        labelValor = new JLabel("Valor");
        textMes = new JTextField(25);
        labelMes = new JLabel("Mes");
        textPerd = new JTextField(25);
        labelPerd = new JLabel("Desconto");

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(labelMes);
        pane.add(textMes);

        pane.add(labelAno);
        pane.add(textAno);

        pane.add(labelValor);
        pane.add(textValor);

        pane.add(labelPerd);
        pane.add(textPerd);

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
     
        if (e.getSource() == botao) {
            int ano = Integer.parseInt(textAno.getText());
            double valor = Double.parseDouble(textValor.getText());
            int mes = Integer.parseInt(textMes.getText());
            double percentual_desconto = Double.parseDouble(textPerd.getText());

          Tela3 Dividas = new Tela3();
           

        }

    }

	public static JButton getSource() {
		return null;
	}

 

}
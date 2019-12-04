package Telas;


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
   
    private static final long serialVersionUID = 1L;

    private static final GraphicsConfiguration Conexao = null;

    private JButton botaoPessoa;
    private JButton botaoDivida;
    private JButton botaoProvento;
    private JButton botaoConsultaPessoa;
    private JButton botaoConsultaDivida;
    private JButton botaoConsultaProvento;

    public TelaPrincipal() {
        super(Conexao);
      
        botaoPessoa = new JButton(" Pessoa");
        botaoDivida = new JButton("Divida");
        botaoProvento = new JButton(" Proventos");
        botaoConsultaPessoa = new JButton(" consulta pessoa");
        botaoConsultaDivida = new JButton(" condulta dividas");
        botaoConsultaProvento = new JButton("consulta provento");

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(botaoPessoa);
        pane.add(botaoDivida);
        pane.add(botaoProvento);
        pane.add(botaoConsultaPessoa);
        pane.add(botaoConsultaDivida);
        pane.add(botaoConsultaProvento);

        this.setVisible(true);
        this.setSize(200, 200);
        this.setContentPane(pane);

        ActionListener handlerAction = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Tela1.getSource() == botaoPessoa) {
                    new Tela1();
                } else if (Tela2.getSource() == botaoProvento) {
                    new Tela2();
                } else if (Tela3.getSource() == botaoDivida) {
                    new Tela3();
                } else if (Tela1.getSource() == botaoConsultaPessoa) {
                    new Tela4(1);
                } else if (Tela2.getSource()== botaoConsultaProvento){
                    new Tela4(2);
                } else if (Tela3.getSource()== botaoConsultaDivida){
                    new Tela4(3);
                }
                
            }
        };
       
        botaoPessoa.addActionListener(handlerAction);
        botaoDivida.addActionListener(handlerAction);
        botaoProvento.addActionListener(handlerAction);
        botaoConsultaPessoa.addActionListener(handlerAction);
        botaoConsultaDivida.addActionListener(handlerAction);
        botaoConsultaProvento.addActionListener(handlerAction);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }

}
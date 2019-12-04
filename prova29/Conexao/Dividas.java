package Conexao;

public class Dividas extends Conta {

    
    private Double  desconto;
  
                public Dividas () {
                }

                public Dividas (int id, int ano, int mes,Double valor, Double desconto, Pessoas pessoas) {
                    super(id, mes, ano, valor, pessoas);
                    this.desconto = desconto;
                
                }

                public double getPercentualDescontos() {
                    return this.desconto = desconto;
                }

                public void setPercentualDescontos(double percentualdescontos) {
                    this.desconto = desconto;
                }

                          
                
}
                

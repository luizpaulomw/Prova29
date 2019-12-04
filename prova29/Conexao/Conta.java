package Conexao;


public class Conta {


    private int id;
    private int mes;
    private int ano;
    private double valor;
    private Pessoas pessoa;

    
    public Conta(){

    }
    
    Conta(int id, int mes, int ano, double valor,Pessoas pessoa){
        this.mes=id;
        this.mes=mes;
        this.mes=ano;
        this.valor=valor;
        this.pessoa = pessoa;
    }
   
        
    public int getAno() {
        return ano;
    }
  
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getMes() {
        return mes;
    }
  
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public double getValor() {
        return valor;
    }
   
    public void setValor(double valor) {
        this.valor = valor;
    }
}

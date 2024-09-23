package edu.revisao.descomplica.automoveis.veiculos;

public class Automoveis{

    //Atributos
    private String nome;
    private String combustivel;
    private String cor;
    private int anoFabricacao;
    private String cambioAutomatico;
    private String oleoMotor;

    //Construtor
    public Automoveis(String nome, String combustivel, String cor, int anoFabricacao, String cambioAutomatico) {
        this.nome = nome;
        this.combustivel = combustivel;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.cambioAutomatico = cambioAutomatico;
    }
    
    //Gets e Setts
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public String getOleoMotor() {
        return oleoMotor;
    }

    public void setOleoMotor(String oleoMotor) {
        this.oleoMotor = oleoMotor;
    }
   
    //Print
    @Override
    public String toString() {
        return "Automóvel: nome = " + nome + ", combustível = " + combustivel + ", cor = " + cor + ", ano fabricação = "
                + anoFabricacao + ", cambio automático = " + cambioAutomatico + ".";
    }

        
}

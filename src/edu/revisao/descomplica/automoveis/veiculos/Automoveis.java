package edu.revisao.descomplica.automoveis.veiculos;

public class Automoveis{

    //Atributos
    private String modelo;
    private String marca;
    private String combustivel;
    private String cor;
    private int anoFabricacao;
    private String cambioAutomatico;
    private String codCarroChave;
    private String oleoMotor;

    //Construtor
    public Automoveis(String modelo, String marca, String combustivel, String cor, int anoFabricacao, String cambioAutomatico, String codCarroChave) {
        this.modelo = modelo;
        this.marca = marca;
        this.combustivel = combustivel;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.cambioAutomatico = cambioAutomatico;
        this.codCarroChave = codCarroChave;
    }
    
    //Gets e Setts
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
    public String getCodCarroChave() {
        return codCarroChave;
    }

    public void setCodCarroChave(String codCarroChave) {
        this.codCarroChave = codCarroChave;
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
        return "Automóvel: Modelo = " + modelo + ", marca = " + marca + ", combustível = " + combustivel + ", cor = " + cor + ", ano de fabricação = "
                + anoFabricacao + ", cambio automático = " + cambioAutomatico + ".";
    }

        
}

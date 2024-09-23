package edu.revisao.descomplica.automoveis.comandos;

import edu.revisao.descomplica.automoveis.veiculos.Automoveis;

public class SobreAutomovel {
    
    public static void verificarCambio(Automoveis automovel){
        if(automovel.getCambioAutomatico().equals("Não")){
            System.out.println("Verifique se está no neutro e ligue... Ligando.");
        }else{
            System.out.println("Coloque no P e pode ligar o carro... Ligando");
        }
    }

    public static void verificarOleo(Automoveis automovel){
        if(automovel.getOleoMotor().equals("baixo")){
            System.out.println("O carro não pode ligar. Oleo do motor baixo!");
            System.out.println("Desligado");
        }else if(automovel.getOleoMotor().equals("medio")){
            System.out.println("O carro pode ligar. Oleo do motor medio com risco!.. Ligando!");
            System.out.println("Ligado");
        }else {
            System.out.println("Oleo no nivel... Ligando");
            System.out.println("Ligado");
        }
    }
}

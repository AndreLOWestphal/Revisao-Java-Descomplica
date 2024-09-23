package edu.revisao.descomplica.automoveis.funcionar;

import java.util.Scanner;

import edu.revisao.descomplica.automoveis.comandos.SobreAutomovel;
import edu.revisao.descomplica.automoveis.veiculos.Automoveis;


public class Funcionamento {
    
    public static void ligarAutomovel(Automoveis automovel){
        SobreAutomovel.verificarCambio(automovel);
        SobreAutomovel.verificarOleo(automovel);
    }

    public static void desligarAutomovel(Automoveis automovel){
        System.out.println("Carro desligado");
    }

    public static void ligarArcondicionado(Automoveis automovel){
        System.out.println("Ar Condicionado ligado");
    }

    public static void desligarArcondicionado(Automoveis automovel){
        System.out.println("Ar Condicionado desligado");
    }

    public static void regularArCondicionado(Automoveis automovel){
        try {Scanner valor = new Scanner(System.in);
            System.out.println("Digite o valor desejado: ");
            int n = valor.nextInt();
            System.out.println("Temperatura regulada para " + n + ".");
            valor.close();
        } catch (Exception e) {
            System.err.println("Você deve digitar um valor numérico!");
        }
    }


}

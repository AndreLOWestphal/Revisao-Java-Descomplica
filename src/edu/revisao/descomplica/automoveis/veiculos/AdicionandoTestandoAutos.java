package edu.revisao.descomplica.automoveis.veiculos;

import edu.revisao.descomplica.automoveis.funcionar.Funcionamento;

public class AdicionandoTestandoAutos{
    public static void main(String[] args) {
        Automoveis prisma = new Automoveis("Prisma LTZ", "Flex", "Branca", 2014, "Não");

        prisma.setOleoMotor("normal");
        System.out.println(prisma.toString());
        System.out.println(prisma.getOleoMotor());
        Funcionamento.ligarAutomovel(prisma);
        Funcionamento.regularArCondicionado(prisma);
        //Funcionamento.desligarArcondicionado(prisma);
        //Funcionamento.desligarAutomovel(prisma);

    }
    
}

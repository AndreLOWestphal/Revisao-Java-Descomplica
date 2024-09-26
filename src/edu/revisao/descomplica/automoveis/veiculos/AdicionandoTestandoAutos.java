package edu.revisao.descomplica.automoveis.veiculos;

import edu.revisao.descomplica.automoveis.funcionar.Funcionamento;

public class AdicionandoTestandoAutos{
    public static void main(String[] args) {
        Automoveis prisma = new Automoveis("Prisma 1.4 LTZ", "CHEVROLET", "Flex", "Branca", 2014, "Sim", "9x5j2");

        prisma.setOleoMotor("baixo");
        System.out.println(prisma.toString());
        System.out.println(prisma.getOleoMotor());
        Funcionamento.ligarAutomovel(prisma);
        Funcionamento.ligarArcondicionado(prisma);
        Funcionamento.regularArCondicionado(prisma);
        Funcionamento.desligarArcondicionado(prisma);
        Funcionamento.desligarAutomovel(prisma);

    }
    
}

package Composite;

import java.util.ArrayList;

public class mainComposite {
    public static void main(String[] args) {
        Projeto upgradePC = new Projeto(new ArrayList<Item>());

        upgradePC.adicionarItem(new Produto("RAM 256", 100));
        upgradePC.adicionarItem(new Produto("RAM 512", 150));
        upgradePC.adicionarItem(new Produto("PLACA DE VIDEO A4500", 2000));

        Projeto projetoServidor = new Projeto(new ArrayList<Item>());
        projetoServidor.adicionarItem(new Produto("RAM 1024", 250));
        projetoServidor.adicionarItem(new Produto("RAM 1024", 250));
        projetoServidor.adicionarItem(new Produto("PLACA DE VIDEO B8900", 4000));
        upgradePC.adicionarItem(projetoServidor);

        Projeto cabeamento = new Projeto(new ArrayList<Item>());
        cabeamento.adicionarItem(new Produto("CABO CAT 5E 500M", 1400));
        cabeamento.adicionarItem(new Produto("CONECTORES RJ45 x 100", 1500));

        upgradePC.adicionarItem(cabeamento);

        System.out.println("Projeto avaliado no total de: R$ " + upgradePC.calcularPrecoFinal());
    }



    }


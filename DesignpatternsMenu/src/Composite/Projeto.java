package Composite;

import java.util.List;

public class Projeto implements Item {
    private List<Item> itensProjeto;

    public Projeto(List<Item> itens) {
        this.itensProjeto = itens;
    }

    public void adicionarItem(Item item) {
        this.itensProjeto.add(item);
    }

    @Override
    public double calcularPrecoFinal() {
        double precoTotal = 0;
        for (Item item : itensProjeto){
            precoTotal += item.calcularPrecoFinal();
            System.out.println("Item: " + Produto.getNomeProduto() + ". Valor: R$ " + item.calcularPrecoFinal());
        }
        return precoTotal;
    }
}

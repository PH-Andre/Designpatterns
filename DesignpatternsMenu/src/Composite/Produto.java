package Composite;

public class Produto implements Item {
    private static String nomeProduto;
    private double precoProduto;

    public static String getNomeProduto() {
        return nomeProduto;
    }
    public Produto(String nome, double preco) {
        this.nomeProduto  = nome;
        this.precoProduto = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoProduto;
    }
}

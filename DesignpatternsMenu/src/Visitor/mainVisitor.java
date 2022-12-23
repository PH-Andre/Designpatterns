
package Visitor;

public class mainVisitor {
    public static void main (String [] args){
        Item[] itens = new Item []{
            new Computador(2000, "com1234" ), new Computador(14500, "com323"),
            new Impressora(1000, 6, "HP 302x"), new Impressora(950, 7, "epson 45")
        };
        int valorTotal = calcularPreco(itens);
        System.out.println("\nValor toral: " + valorTotal);
    }
    private static int calcularPreco(Item[] items){
        ICarrinhoComprasVisitor visitor = new CarrinhoComprasVisitorImpl();
        int soma = 0;
        for(Item item:items){
           soma = soma +item.accept(visitor);
        }
        return soma;
    }
    
}

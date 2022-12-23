
package Visitor;


public class CarrinhoComprasVisitorImpl implements ICarrinhoComprasVisitor {
    
    public int visit(Computador computador){
        int preco = 0;
        if(computador.getPreco() > 15000){
            preco = computador.getPreco() - 50;
        }
        else{
            preco = computador.getPreco();
        }
        System.out.println("---Computador--- SerialNumber: " + computador.getNumeroSerie() + ", Valor: " + preco);
        return preco;
      }
    
    public int visit(Impressora impressora){
      int preco = impressora.getValorCartucho() * impressora.getSemCartucho();
        System.out.println("---Impressora---  " + impressora.getModelo() + ", Valor: " + preco);
        return preco;
    }
}
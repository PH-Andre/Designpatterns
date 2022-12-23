
package Visitor;

public class Computador implements Item {

    private int preco;
    private String numeroSerie;
    Computador(int cost, String serialNumber){
        this.preco = cost;
        this.numeroSerie = serialNumber;
    }
    
    public int getPreco(){
        return preco;
    }
    
    public String getNumeroSerie(){
        return numeroSerie;
    }
    
    @Override
    public int accept(ICarrinhoComprasVisitor visitor) {
        return visitor.visit(this);
    }

    
}


package Visitor;

public class Impressora implements Item {

    private final int valorCartucho;
    private final int semCartucho;
    private final String modelo;
    
    public Impressora(int valorCartucho, int semCartucho, String modelo){
        this.valorCartucho = valorCartucho;
        this.semCartucho = semCartucho;
        this.modelo = modelo;
    }
    
    public int getValorCartucho(){
        return valorCartucho;
    }
    
    public int getSemCartucho(){
        return semCartucho;
    }
    
    public String getModelo(){
        return this.modelo;
    }

    @Override
    public int accept(ICarrinhoComprasVisitor visitor) {
   
    return visitor.visit(this);
        
    }
    
}

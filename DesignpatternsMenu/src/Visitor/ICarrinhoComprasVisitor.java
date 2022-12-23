
package Visitor;


public interface ICarrinhoComprasVisitor {
 
    int visit(Computador computador);
    int visit (Impressora impressora);
    
}

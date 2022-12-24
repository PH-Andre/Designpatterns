package ChainOfResponsability;

public class mainChainReponsability {
    public static void main(String[] args) {
        Corrente corrente = new Corrente();

        corrente.processo(new Numero(90));
        corrente.processo(new Numero(-50));
        corrente.processo(new Numero(0));
        corrente.processo(new Numero(91));
    }
}

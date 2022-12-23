package ChainOfResponsability;

public class Corrente {
    Processador corrente;
    public Corrente(){
        construirCorrente();
    }

    private void construirCorrente() {
        corrente = new ProcessadorNegativo(new ZeroProcessor(new ProcessadorPositivo(null)));
    }
    public void processo(Numero solicitacao) {
        corrente.processar(solicitacao);
    }
}

abstract class Processador {
    private Processador proximoProcessador;
    public Processador(Processador proximoProcessador){

        this.proximoProcessador = proximoProcessador;
    }

    public void processar(Numero solicitacao){
        if(proximoProcessador != null)
            proximoProcessador.processar(solicitacao);
    }
}

class Numero {
    private int numero;

    public Numero(int numero) {

        this.numero = numero;
    }

    public int getNumero() {

        return numero;
    }
}

class ProcessadorNegativo extends Processador {
    public ProcessadorNegativo(Processador proximoProcessador){
        super(proximoProcessador);
    }

    public void processar(Numero solicitacao) {
        if (solicitacao.getNumero() < 0) {
            System.out.println("ProcessadorNegativo : " + solicitacao.getNumero());
        } else {
            super.processar(solicitacao);
        }
    }
}

class ZeroProcessor extends Processador {
    public ZeroProcessor(Processador nextProcessor){

        super(nextProcessor);
    }

    public void processar(Numero solicitacao) {
        if (solicitacao.getNumero() == 0) {
            System.out.println("ZeroProcessor : " + solicitacao.getNumero());
        } else {
            super.processar(solicitacao);
        }
    }
}

class ProcessadorPositivo extends Processador {

    public ProcessadorPositivo(Processador proximoProcessador){

        super(proximoProcessador);
    }

    public void processar(Numero solicitacao) {
        if (solicitacao.getNumero() > 0) {
            System.out.println("Processo positivo : " + solicitacao.getNumero());
        } else {
            super.processar(solicitacao);
        }
    }
}

class mainChainReponsability {
    public static void main(String[] args) {
        Corrente corrente = new Corrente();

        corrente.processo(new Numero(90));
        corrente.processo(new Numero(-50));
        corrente.processo(new Numero(0));
        corrente.processo(new Numero(91));
    }
}

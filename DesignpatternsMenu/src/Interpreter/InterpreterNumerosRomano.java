package Interpreter;

public abstract class InterpreterNumerosRomano {
    public void interpretar(Contexto contexto) {
        if (contexto.getDadosEntrada().length() == 0) {
            return;
        }
        if (contexto.getDadosEntrada().startsWith(nove())) {
            adicionarValorDadoSaida(contexto, 9);
            consumirDuasCasasDadosEntrada(contexto);

        } else if (contexto.getDadosEntrada().startsWith(quatro())) {
            adicionarValorDadoSaida(contexto, 4);
            consumirDuasCasasDadosEntrada(contexto);

        } else if (contexto.getDadosEntrada().startsWith(cinco())) {
            adicionarValorDadoSaida(contexto, 5);
            consumirUmaCasaDadosEntrada(contexto);
        }
        while (contexto.getDadosEntrada().startsWith(um())) {
            adicionarValorDadoSaida(contexto, 1);
            consumirUmaCasaDadosEntrada(contexto);
        }
    }

    private void consumirUmaCasaDadosEntrada(Contexto contexto) {
        contexto.setDadosEntrada(contexto.getDadosEntrada().substring(1));
    }

    private void consumirDuasCasasDadosEntrada(Contexto contexto) {
        contexto.setDadosEntrada(contexto.getDadosEntrada().substring(2));
    }

    private void adicionarValorDadoSaida(Contexto contexto, int numero) {
        contexto.setDadosSaida(contexto.getDadosSaida() + (numero * multiplicador()));
    }

    public abstract String um();

    public abstract String quatro();

    public abstract String cinco();
    public abstract String nove();
    public abstract int multiplicador();
}
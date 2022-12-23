package Interpreter;

public class Contexto {
    protected String dadosEntrada;
    protected int dadosSaida;
    public Contexto(String input) {
        this.dadosEntrada = input;
    }
    public String getDadosEntrada() {
        return dadosEntrada;
    }
    public void setDadosEntrada(String dadosEntrada) {
        this.dadosEntrada = dadosEntrada;
    }
    public int getDadosSaida() {
        return dadosSaida;
    }
    public void setDadosSaida(int dadosSaida) {
        this.dadosSaida = dadosSaida;
    }
}
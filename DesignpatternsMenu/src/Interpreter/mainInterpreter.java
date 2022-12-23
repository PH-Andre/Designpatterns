package Interpreter;

import java.util.ArrayList;

public class mainInterpreter {
    public static void main(String[] args) {
        ArrayList<InterpreterNumerosRomano> interpretadores = new ArrayList<InterpreterNumerosRomano>();
        interpretadores.add(new QuatroDigitosDecimal());
        interpretadores.add(new TresDigitosDecimal());
        interpretadores.add(new DoisDigitosDecimal());
        interpretadores.add(new UmDigitoDecimal());

        String numeroRomano = "XX";
        Contexto contexto = new Contexto(numeroRomano);
        for (InterpreterNumerosRomano numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }

        System.out.println(numeroRomano + " = "
                + Integer.toString(contexto.getDadosSaida()));
    }
}
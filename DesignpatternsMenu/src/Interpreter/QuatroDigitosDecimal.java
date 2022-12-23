package Interpreter;

public class QuatroDigitosDecimal extends InterpreterNumerosRomano {
    @Override
    public String um() {
        return "M";
    }
    @Override
    public String quatro() {
        return " ";
    }
    @Override
    public String cinco() {
        return " ";
    }
    @Override
    public String nove() {
        return " ";
    }
    @Override
    public int multiplicador() {
        return 1000;
    }
}
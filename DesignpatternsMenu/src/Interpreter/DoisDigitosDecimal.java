package Interpreter;

public class DoisDigitosDecimal extends InterpreterNumerosRomano {
    @Override
    public String um() {
        return "X";
    }
    @Override
    public String quatro() {
        return "XL";
    }
    @Override
    public String cinco() {
        return "L";
    }
    @Override
    public String nove() {
        return "XC";
    }
    @Override
    public int multiplicador() {
        return 10;
    }
}
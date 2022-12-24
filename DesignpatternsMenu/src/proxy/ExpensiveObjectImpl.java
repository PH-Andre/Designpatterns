package proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("processamento completo.");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Carregando configuração inicial...");
    }

}
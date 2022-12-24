package proxy;

public class Mainproxy {
    public static void main(String[] args) {

        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}

package Prototype;

public class Circulo extends FormaGeometrica {
    public int raio;
    public Circulo() {}

    public Circulo(Circulo circulo) {
        super(circulo);
        if (circulo != null) {
            this.raio = circulo.raio;
        }
    }

    @Override
    public FormaGeometrica clone() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object objetoCirculo) {
        if (!(objetoCirculo instanceof Circulo) || !super.equals(objetoCirculo)) return false;
        Circulo forma2 = (Circulo) objetoCirculo;
        return forma2.raio == raio;
    }
}
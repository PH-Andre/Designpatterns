package Prototype;

public class Retangulo extends FormaGeometrica {
    public int largura;
    public int altura;
    public Retangulo() {}

    public Retangulo(Retangulo retangulo) {
        super(retangulo);
        if (retangulo != null) {
            this.largura = retangulo.largura;
            this.altura  = retangulo.altura;
        }
    }

    @Override
    public FormaGeometrica clone() {
        return new Retangulo(this);
    }

    @Override
    public boolean equals(Object objetoRetangulo) {
        if (!(objetoRetangulo instanceof Retangulo) || !super.equals(objetoRetangulo)) return false;
        Retangulo forma2 = (Retangulo) objetoRetangulo;
        return forma2.largura == largura && forma2.altura == altura;
    }
}
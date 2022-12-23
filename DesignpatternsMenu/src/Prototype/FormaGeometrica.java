package Prototype;

import java.util.Objects;

public abstract class FormaGeometrica {
    public int x;
    public int y;
    public String cor;
    public FormaGeometrica() {}

    public FormaGeometrica(FormaGeometrica FormaGeometrica) {
        if (FormaGeometrica != null) {
            this.x = FormaGeometrica.x;
            this.y = FormaGeometrica.y;
            this.cor = FormaGeometrica.cor;
        }
    }

    public abstract FormaGeometrica clone();

    @Override
    public boolean equals(Object objetoFormaGeometrica) {
        if (!(objetoFormaGeometrica instanceof FormaGeometrica)) return false;
        FormaGeometrica forma2 = (FormaGeometrica) objetoFormaGeometrica;
        return forma2.x == x && forma2.y == y && Objects.equals(forma2.cor, cor);
    }
}

package flyweight.model;

public class Arbol {
    private double alto;
    private double ancho;
    private String color;
    private ETipoArbol tipoArbol;
    private static int contador = 0;

    public Arbol(double alto, double ancho, String color, ETipoArbol tipoArbol) {
        this.alto = alto;
        this.ancho = ancho;
        this.color = color;
        this.tipoArbol = tipoArbol;
        contador++;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ETipoArbol getTipoArbol() {
        return tipoArbol;
    }

    public void setTipoArbol(ETipoArbol tipoArbol) {
        this.tipoArbol = tipoArbol;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arbol.contador = contador;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", color='" + color + '\'' +
                ", tipoArbol=" + tipoArbol +
                '}';
    }
}

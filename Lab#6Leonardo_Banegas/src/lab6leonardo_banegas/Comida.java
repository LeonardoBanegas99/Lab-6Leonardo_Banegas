package lab6leonardo_banegas;

public class Comida extends Producto {

    private String tipodecomida;

    public Comida() {
    }

    public Comida(String tipodecomida, double preciodecosto, double preciodeventa, String nombre) {
        super(preciodecosto, preciodeventa, nombre);
        this.tipodecomida = tipodecomida;
    }

    public String getTipodecomida() {
        return tipodecomida;
    }

    public void setTipodecomida(String tipodecomida) {
        this.tipodecomida = tipodecomida;
    }

    @Override
    public String toString() {
        return super.toString() + tipodecomida;
    }

}

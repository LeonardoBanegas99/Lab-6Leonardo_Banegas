package lab6leonardo_banegas;

public class Bebida extends Producto {

    private String estado;
    private int tamano;
    private String tipo;

    public Bebida() {
    }

    public Bebida(String estado, int tamano, String tipo, double preciodecosto, double preciodeventa, String nombre) {
        super(preciodecosto, preciodeventa, nombre);
        this.estado = estado;
        this.tamano = tamano;
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + tipo;
    }

}

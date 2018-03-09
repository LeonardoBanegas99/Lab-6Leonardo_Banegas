package lab6leonardo_banegas;

public class Producto {

    private double preciodecosto;
    private double preciodeventa;
    private String nombre;

    public Producto(double preciodecosto, double preciodeventa, String nombre) {
        this.preciodecosto = preciodecosto;
        this.preciodeventa = preciodeventa;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public double getPreciodecosto() {
        return preciodecosto;
    }

    public void setPreciodecosto(double preciodecosto) {
        this.preciodecosto = preciodecosto;
    }

    public double getPreciodeventa() {
        return preciodeventa;
    }

    public void setPreciodeventa(double preciodeventa) {
        this.preciodeventa = preciodeventa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
    @Override
    public String toString() {
        return nombre + " " + preciodeventa + " ";
    }

}

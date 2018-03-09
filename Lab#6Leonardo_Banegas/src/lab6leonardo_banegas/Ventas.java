package lab6leonardo_banegas;

public class Ventas {

    private int totalventa;
    private String fecha;

    public Ventas(int totalventa, String fecha) {
        this.totalventa = totalventa;
        this.fecha = fecha;
    }

    public int getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(int totalventa) {
        this.totalventa = totalventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ventas{" + "totalventa=" + totalventa + ", fecha=" + fecha + '}';
    }

}

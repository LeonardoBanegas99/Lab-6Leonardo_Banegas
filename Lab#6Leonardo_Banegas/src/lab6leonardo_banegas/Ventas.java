package lab6leonardo_banegas;

public class Ventas {

    private double totalventa;
    private String fecha;

    public Ventas(double totalventa, String fecha) {
        this.totalventa = totalventa;
        this.fecha = fecha;
    }

    public double getTotalventa() {
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

package lab6leonardo_banegas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Factura {

    private ArrayList<Producto> productos = new ArrayList();
    private String correo;
    private String nombredelcliente;
    private int RTN;
    private String CAI;
    private String fecha;

    public Factura(String correo, String nombredelcliente, int RTN, String CAI, String fecha) {
        this.correo = correo;
        this.nombredelcliente = nombredelcliente;
        this.RTN = RTN;
        this.CAI = CAI;
        this.fecha = fecha;
    }

    public Factura() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombredelcliente() {
        return nombredelcliente;
    }

    public void setNombredelcliente(String nombredelcliente) {
        this.nombredelcliente = nombredelcliente;
    }

    public int getRTN() {
        return RTN;
    }

    public void setRTN(int RTN) {
        this.RTN = RTN;
    }

    public String getCAI() {
        return CAI;
    }

    public void setCAI(String CAI) {
        this.CAI = CAI;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void generarFactura() {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./src\\FacturaActual.txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            String prod = "            Dunkin Donuts          \n\n";
            prod = prod + "CAI: " + CAI + "\n" + "\n"
                    + "Fecha: " + fecha + "\n" + "\n"
                    + "Correo: " + correo + "\n" + "\n"
                    + "Cliente: " + nombredelcliente + "\n" + "\n"
                    + "Productos\n" + "\n";
            String product = "";
            double subtotal = 0;
            for (int i = 0; i < productos.size(); i++) {
                prod = prod + productos.get(i).getNombre() + "      L." + productos.get(i).getPreciodeventa() + "\n";
                subtotal = subtotal + productos.get(i).getPreciodeventa();
            }
            double impuesto = subtotal * 0.15;
            double total = impuesto + subtotal;
            prod = prod + "\n"
                    + "Sub Total: " + subtotal + "\n" + "\n"
                    + "Impuesto: " + impuesto + "\n" + "\n"
                    + "Total: " + total + "\n";
            System.out.println(prod);
            bw.write(prod);
            bw.flush();
            JOptionPane.showMessageDialog(null, "Archivo guardado exitosamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {

        }
    }

    @Override
    public String toString() {
        return "Factura{" + "productos=" + productos + ", correo=" + correo + ", nombredelcliente=" + nombredelcliente + ", RTN=" + RTN + ", CAI=" + CAI + ", fecha=" + fecha + '}';
    }

}

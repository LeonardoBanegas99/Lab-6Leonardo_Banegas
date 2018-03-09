package lab6leonardo_banegas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inventario {

    private ArrayList<Producto> productos = new ArrayList();
    private String direccion;

    public Inventario(String direccion) {
        this.direccion = direccion;
    }

    public Inventario() {
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    private Scanner sc;

    public void guardar(Producto p) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./src\\Inventario.txt");
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            String prod = "";
            if (p instanceof Bebida) {
                prod = prod + "1,"
                        + ((Bebida) p).getPreciodecosto()
                        + "," + ((Bebida) p).getPreciodeventa() + ","
                        + ((Bebida) p).getNombre() + "," + ((Bebida) p).getEstado() + ","
                        + ((Bebida) p).getTamano() + "," + ((Bebida) p).getTipo() + ";";
            } else if (p instanceof Comida) {
                prod = prod + "2,"
                        + ((Comida) p).getPreciodecosto()
                        + "," + ((Comida) p).getPreciodeventa() + ","
                        + ((Comida) p).getNombre() + "," + ((Comida) p).getTipodecomida() + ";";
            }
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

    public void modificar() {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File("./src\\Inventario.txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            String prod = "";
            for (int i = 0; i < productos.size(); i++) {
                if (productos.get(i) instanceof Bebida) {
                    prod = prod + "1,"
                            + ((Bebida) productos.get(i)).getPreciodecosto()
                            + "," + ((Bebida) productos.get(i)).getPreciodeventa() + ","
                            + ((Bebida) productos.get(i)).getNombre() + "," + ((Bebida) productos.get(i)).getEstado() + ","
                            + ((Bebida) productos.get(i)).getTamano() + "," + ((Bebida) productos.get(i)).getTipo() + ";";
                } else if (productos.get(i) instanceof Comida) {
                    prod = prod + "2,"
                            + ((Comida) productos.get(i)).getPreciodecosto()
                            + "," + ((Comida) productos.get(i)).getPreciodeventa() + ","
                            + ((Comida) productos.get(i)).getNombre() + "," + ((Comida) productos.get(i)).getTipodecomida() + ";";
                }
            }
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
        return "Inventario{" + "productos=" + productos + ", direccion=" + direccion + '}';
    }

}

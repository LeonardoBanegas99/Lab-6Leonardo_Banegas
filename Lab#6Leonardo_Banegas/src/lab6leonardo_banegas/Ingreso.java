package lab6leonardo_banegas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ingreso {

    private ArrayList<Ventas> ventas = new ArrayList();
    private String direccion;

    public Ingreso(String direccion) {
        this.direccion = direccion;
    }

    public Ingreso() {
    }

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void guardarIngreso(Ventas v) {
        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            archivo = new File(direccion);
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            String linea = "";
            linea = linea + v.getTotalventa() + "," + v.getFecha() + ";";
            bw.write(linea);
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
        return "Ingreso{" + "ventas=" + ventas + ", direccion=" + direccion + '}';
    }

}

package paquetelibreria;

import javax.swing.*;

public class Consola {
    public static String SaludoVentana(String mensajeVentana) {
        JOptionPane.showMessageDialog(null,mensajeVentana);
        return mensajeVentana;
    }
}
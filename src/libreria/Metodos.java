package libreria;

import javax.swing.*;

public class Metodos {

    public static void SaludoVentana(String mensajeVentana) {
        JOptionPane.showMessageDialog(null,mensajeVentana);
    }

    public static void SaludoConsola(String mensajeConsola) {
        System.out.println(mensajeConsola);
    }
}

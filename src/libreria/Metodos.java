package libreria;

import javax.swing.*;

public class Metodos {

    //Modificación de Librería 1

    public static String SaludoVentana(String mensajeVentana) {
        JOptionPane.showMessageDialog(null,mensajeVentana);
        return mensajeVentana;
    }

    public static void SaludoConsola(String mensajeConsola) {
        System.out.println(mensajeConsola);
    }
}

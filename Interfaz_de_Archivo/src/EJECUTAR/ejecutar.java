package EJECUTAR;

import Interfaz.Fondo;
import Interfaz.ventana;
import Metodos_Archivos.PersonaDao;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import modelo.PersonaImp;

public class ejecutar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana ven = new ventana();
                Fondo todo = new Fondo(ven);
                todo.setLocationRelativeTo(null);
                todo.setVisible(true);
                todo.componentes();
                todo.lectura();
                todo.mostrar();
                todo.fondo();
            }
        });
    }
}

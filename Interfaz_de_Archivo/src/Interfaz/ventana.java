package Interfaz;
import java.awt.*;
import javax.swing.*;
public class ventana extends JFrame {

    public ventana() {
        this.setSize(600, 430);
        this.setLayout(null);
        this.setTitle("Carga y Lectura de archivo");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    }
    public void componentes() {               
        JTextArea equiquetaintruccion = new JTextArea("(llene los campos solicitados)");
        equiquetaintruccion.setBounds(20, 100, 160, 20);
        equiquetaintruccion.setBackground(Color.white);
        equiquetaintruccion.setEditable(false);
        this.add(equiquetaintruccion);

        JTextField equiquetaId = new JTextField("ID:  ");
        equiquetaId.setBounds(20, 150, 60, 30);
        equiquetaId.setBackground(Color.ORANGE);
        equiquetaId.setEditable(false);
        this.add(equiquetaId);

        JTextField equiquetaNombre = new JTextField("Nombre: ");
        equiquetaNombre.setBounds(20, 200, 60, 30);
        equiquetaNombre.setBackground(Color.ORANGE);
        equiquetaNombre.setEditable(false);
        this.add(equiquetaNombre);

        JTextField equiquetaEdad = new JTextField("Edad: ");
        equiquetaEdad.setBounds(20, 250, 60, 30);
        equiquetaEdad.setBackground(Color.ORANGE);
        equiquetaEdad.setEditable(false);
        this.add(equiquetaEdad);

        JTextField etiquetaArchivo = new JTextField("nombre archivo:");
        etiquetaArchivo.setEditable(false);
        etiquetaArchivo.setBounds(20, 300, 100, 30);
        etiquetaArchivo.setBackground(Color.yellow);
        this.add(etiquetaArchivo);

        JTextField consultaArchivo = new JTextField("Nombre Archivo a consultar:");
        consultaArchivo.setBounds(255, 100, 160, 30);
        consultaArchivo.setEditable(false);
        consultaArchivo.setBackground(Color.yellow);
        this.add(consultaArchivo);

        ImageIcon logo = new ImageIcon("Logo.JPEG");
        JLabel logo1 = new JLabel(logo);
        Panel pegar = new Panel();
        pegar.add(logo1);                
        pegar.setBackground(Color.white);
        pegar.setSize(590, 92);
        this.add(pegar);                             
    }   
}

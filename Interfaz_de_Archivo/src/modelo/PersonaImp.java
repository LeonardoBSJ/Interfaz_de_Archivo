package modelo;

import Interfaz.ventana;
import Metodos_Archivos.Persona;
import Metodos_Archivos.PersonaDao;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.*;

public class PersonaImp extends ventana implements PersonaDao {

    public PersonaImp() {
    }

    @Override
    public void lectura() {
        JTextField Idleer = new JTextField();
        Idleer.setBounds(100, 150, 60, 30);
        Idleer.setBackground(Color.cyan);
        this.add(Idleer);

        JTextField nombreleer = new JTextField();
        nombreleer.setBounds(100, 200, 60, 30);
        nombreleer.setBackground(Color.cyan);
        this.add(nombreleer);

        JTextField edadleer = new JTextField();
        edadleer.setBounds(100, 250, 60, 30);
        edadleer.setBackground(Color.cyan);
        this.add(edadleer);

        JTextField nombreArchivo = new JTextField("default");
        nombreArchivo.setBounds(130, 300, 60, 30);
        nombreArchivo.setBackground(Color.cyan);
        this.add(nombreArchivo);

        JButton guarda = new JButton("guarda");
        guarda.setBounds(55, 350, 80, 30);
        guarda.setBackground(Color.green);
        this.add(guarda);

        guarda.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Persona registro;
                int id;
                String nombre;
                int edad;
                String archivo = nombreArchivo.getText() + ".txt";

                try ( FileWriter file = new FileWriter(archivo, true);  BufferedWriter escritor = new BufferedWriter(file)) {
                    id = Integer.parseInt(Idleer.getText());
                    nombre = nombreleer.getText();
                    edad = Integer.parseInt(edadleer.getText());
                    registro = new Persona(id, nombre, edad);
                    escritor.write("  Id: " + registro.getId() + "  Nombre:  " + registro.getNombre() + "   edad:   " + registro.getEdad());
                    escritor.write("");
                    escritor.newLine();
                } catch (NumberFormatException | IOException ee) {
                    JOptionPane.showMessageDialog(null, "ingresa (id ó edad) valido");
                    System.out.println("cerrado");
                    System.out.println(ee.getMessage());
                }
                Idleer.setText("");
                nombreleer.setText("");
                edadleer.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    @Override
    public void mostrar() {
        JTextField consultaArchivoleer = new JTextField();
        consultaArchivoleer.setBounds(430, 100, 100, 30);
        consultaArchivoleer.setBackground(Color.white);
        this.add(consultaArchivoleer);

        JTextArea mostrarText = new JTextArea();
        mostrarText.setEditable(false);
        mostrarText.setBounds(250, 150, 300, 180);
        mostrarText.setBackground(Color.white);
        this.add(mostrarText);

        JButton consultar = new JButton("Consultar");
        consultar.setBounds(350, 350, 100, 30);
        consultar.setBackground(Color.green);
        this.add(consultar);

        consultar.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Thread ve = new Thread(new Runnable() {

                    @Override
                    public void run() {
                        String archivo = consultaArchivoleer.getText() + ".txt";

                        try ( FileReader file = new FileReader(archivo);  BufferedReader obj = new BufferedReader(file)) {
                            mostrarText.setText("");
                            boolean leido = false;
                            while (!leido) {
                                String line;
                                line = obj.readLine();
                                if (line != null) {
                                    mostrarText.append(line + "\n");
                                    System.out.println("leyendo datos");
                                } else {
                                    leido = true;
                                }
                            }
                        } catch (IOException er) {
                            JOptionPane.showMessageDialog(null, er.getMessage());
                        }
                    }
                });
                ve.start();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    public void fondo() {
        ImageIcon imagen = new ImageIcon("paisaje.gif");
        JLabel fon = new JLabel(imagen);
        Panel fondo = new Panel();
        fondo.add(fon);
        this.add(fondo);
        fondo.setSize(600, 430);
    }

}

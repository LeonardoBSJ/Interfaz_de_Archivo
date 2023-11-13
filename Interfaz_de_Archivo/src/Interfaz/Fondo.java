package Interfaz;
import modelo.PersonaImp;
public class Fondo extends PersonaImp {
    public ventana ven;
    public Fondo(ventana ven){
        this.ven = ven;
    }      
    public void todosmetodos(){
        componentes();       
        lectura();
        mostrar();
    }   
}

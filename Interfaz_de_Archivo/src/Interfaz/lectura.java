
package Interfaz;

import java.io.*;

public class lectura extends ObjectOutputStream {
 
    public lectura(OutputStream out) throws IOException {
        super(out);
    }
    protected lectura() throws IOException,SecurityException{
        super();
    }
   
    protected void writeStreamHeader() throws IOException {
        
    }
}

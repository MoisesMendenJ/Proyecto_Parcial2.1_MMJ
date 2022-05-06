/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_parcial2.pkg1_mmj;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author 52561
 */
public class Archivos {
    
    File archivo;
    
    public void crearArchivo() {
        try {
            archivo = new File("AgendaContactos.txt");
            if (archivo.createNewFile()) {
               JOptionPane.showMessageDialog(null,"Archivo Creado");     
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void escribirArchivo(Persona persona){
        try{
            try (FileWriter escritura = new FileWriter(archivo, true)) {
                escritura.write(persona.getNombre()+ "%" + persona.getCorreo() + "%" + persona.getNumero() + "%" + persona.getOcupacion() + "\r\n");
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}

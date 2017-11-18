
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sara
 */
public class FileLoader {
     JFileChooser seleccionar = new JFileChooser();
        File archivo;
        FileInputStream entrada;
        FileOutputStream salida;
    
    public void AbrirArchivo (File archivo){
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int i;
            while ((i=entrada.read()) != -1){ // 
                char caracter = (char) i;
                documento += caracter;
            }
        }catch (Exception e){ 
        }
        System.out.print(documento);
    }
}

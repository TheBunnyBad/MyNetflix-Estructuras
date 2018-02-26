/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYNETFLIX;


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *Clase que permite la lectura de un archivo
 * @author JCuartas
 */
public class Read {
    
    /////////////////
    //Atributos
    /////////////////
    
    
    
    //Objeto que permite leer el archivo
    private FileReader reader;
    
    //Objeto que guarda el contenido del lector
    private BufferedReader content;
    
    //String que contiene todo el texto del archivo
    
        
    ///////////
    //Metodos
    //////////
    
    
    public void inicializarLector() throws FileNotFoundException {
        reader = new FileReader(".../textData.txt");
    }
    
    public void inicializarBuffered() {
        content = new BufferedReader(reader);
    }
    
    public String retornaTextoDeArchivo() throws IOException {
        String dataText = content.readLine();   
        return  dataText;
    }
    
    
    
   
}

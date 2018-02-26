package MYNETFLIX;

/*Clase que permite escribir en un archivo de texto*/

//Importamos clases que se usaran
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Write {
    
    ///////////////////
    //Atributos
    ///////////////////
    
    //Se crea un objeto File se encarga de crear o abrir acceso 
    //a un archivo que se especifica en su constructor
    private File archive;
        
    //Se crea un objeto FileWriter que sera el que escriba sobre archivo
    private FileWriter writer;
    
    
    ////////////////
    //Metodos
    ////////////////
    public File getArchive() {
        return archive;
    }

    public void setArchive(File archive) {
        this.archive = archive;
    }

    public FileWriter getWriter() {
        return writer;
    }

    public void setWriter(FileWriter writer) {
        this.writer = writer;
    }

       
    public void inicialiazarArchivo() {
        archive = new File(".../textData.txt");
    }
    
    
    public void inicializarWriter() throws IOException {
        writer = new FileWriter(archive, true);
               
    }         
    
    public void escribirEnArchivo(String movieInfo) throws IOException {
        writer.write(movieInfo);
    }
    
    public void cerrarConexion() throws IOException {
        writer.close();
    }
       
}
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MYNETFLIX;

import java.io.IOException;

/**
 *Clase que cse encarga de recorrer el archivo y buscar un segmento determinado.
 * @author JCuartas
 */
public class DataBrowser {
    Read lector = new Read();
    Write escritor = new Write();
    
    public boolean search(String busqueda) throws IOException {
        String buffer = "";
        while((buffer = lector.retornaTextoDeArchivo()) != null) {
            if (busqueda == buffer) {
                return true;
            } else {
                return false;
            }            
        }
        return false;
    }
}

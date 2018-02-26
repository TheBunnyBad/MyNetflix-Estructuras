/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author usuario
 */
public class Loader {
    /**
     * Carga la fuente externa que se necesite del paquete Resources
     * @param ruta del archivo .ttf
     * @return Objeto tipo Font del archivo .ttf para usarse en el proyecto o un Font (Dialog, Bold, 12) si no se encuentra
     */
    public static Font cargarFuente(final String ruta, float tam){
        Font fuente = null;
        InputStream entrada = ClassLoader.class.getResourceAsStream("/Resources/" + ruta + ".ttf");
        System.out.println("HOLA");
        try{
            fuente = Font.createFont(Font.TRUETYPE_FONT, entrada);
            fuente = fuente.deriveFont(tam);
        } catch(FontFormatException | IOException e){
            System.out.println("Font error");
            System.out.println(e);
            return new Font(Font.DIALOG, Font.BOLD, 12);
        }
        
        return fuente;
    }
}

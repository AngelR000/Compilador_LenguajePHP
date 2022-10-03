/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

/**
 *
 * @author angel
 */
public class Principal {
    public static void main(String[] args) throws Exception {
        String ruta1 = "C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/src/codigo/Lexer.flex";
        String[] rutaS = {"-parser", "sintax", "C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/src/codigo/sintax.cup"};
        generar(ruta1, rutaS);
    }
    
    public static void generar(String ruta1, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        
        Path rutasym = Paths.get("C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/src/codigo/sym.java");
        if (Files.exists(rutasym)) {
            Files.delete(rutasym);
        }
                Files.move(
                Paths.get("C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/sym.java"), 
                Paths.get("C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/src/codigo/sym.java"));
                
        Path rutasin = Paths.get("C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/src/codigo/sintax.java");
        if (!Files.exists(rutasin)) {
            Files.move(
                Paths.get("C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/sintax.java"), 
                Paths.get("C:/Users/angel/OneDrive/Documentos/7mo/Traductores/jflex_/src/codigo/sintax.java"));
            
        }else{
            Files.delete(rutasin);
        }
                
         
    }
    
   
    
}

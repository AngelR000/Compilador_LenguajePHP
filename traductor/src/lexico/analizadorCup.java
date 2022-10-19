/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexico;

/**
 *
 * @author angel
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java_cup.runtime.Symbol;

public class analizadorCup {
    public static void main(String[] args) throws IOException {
        Reader lector = new BufferedReader(new FileReader("src/lexico/declaraciones.txt"));
        sintax s = new sintax(new Lexer(lector));
        
        try {
            System.out.println(s.parse());
            System.out.println("Analisis realizado correctamente");
        } catch (Exception ex) {
            Symbol sym = s.getS();
            System.out.println("Error de sintaxis. Linea: " + (sym.right + 1) +
              " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
        System.out.println(ex.getMessage());
        }
    }
}

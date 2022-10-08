package lexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java_cup.runtime.Symbol;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author angel
 */
public class AnalisisLexico {
    private static File file;
    private static BufferedReader bf;
    private static Lexer lexer;
    boolean t = true;
    public String salida;
   
    public void analizararchivo(String file) throws FileNotFoundException, IOException{
    
       bf = new BufferedReader(new FileReader(file));
       lexer = new Lexer(bf);
       
       while(t){
           
           Symbol token = lexer.next_token();
           switch(token.sym){
               case 0:
                   salida +="Fin del archivo";
                   t=false;
           break;
               case 3:
                   if (this.salida == null) {
                       salida =token + "    " + token.value + "\n";
                   }else{
                        salida +=token + "    " + token.value + "\n";
                   }
                   
                   break;
                   
                case 22:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 95:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                case 26:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                case 6:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 91:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 57:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 41:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 55:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 33:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 28:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 64:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 47:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 61:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 77:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 30:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 45:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 82:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 78:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 4:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 35:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 12:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 59:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 90:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 75:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 21:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 63:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 40:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 25:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 20:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 87:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 50:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 54:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 2:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 19:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 46:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 96:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 18:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 39:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 31:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 56:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 23:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 42:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 92:
                   salida +="Coma "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 86:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 49:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 71:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 60:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 81:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 15:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 88:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 68:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 70:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 79:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 76:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 84:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 67:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 69:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 27:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 14:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 38:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 17:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 16:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 37:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 36:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 43:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 8:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 73:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 52:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 44:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 11:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 72:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 1:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 48:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 9:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 85:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 51:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 34:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 62:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 66:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 58:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 13:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 7:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 32:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 53:
                   salida += token + "    " + token.value + "\n";
                   break;
                   
                   case 29:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 10:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 97:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 65:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 24:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 74:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 80:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 5:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 89:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 83:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 94:
                   salida +=token + "    " + token.value + "\n";
                   break;
                   
                   case 93:
                   salida += token + "    " + token.value + "\n";
                   break;
           }
           
           
           
       }    
       
    
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
       
    }
}

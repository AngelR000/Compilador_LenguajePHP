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
                       salida ="Operador Logico " + token + "    " + token.value + "\n";
                   }else{
                        salida +="Operador Logico " + token + "    " + token.value + "\n";
                   }
                   
                   break;
                   
                case 22:
                   salida +="Comillas "+ token + "    " + token.value + "\n";
                   break;
                   
                case 26:
                   salida +="As "+ token + "    " + token.value + "\n";
                   break;
                   
                case 6:
                   salida +="Identifier "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 91:
                   salida +="From "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 57:
                   salida +="Include Once "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 41:
                   salida +="End Declare "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 55:
                   salida +="Implements "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 33:
                   salida +="Const "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 28:
                   salida +="Callable "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 64:
                   salida +="Namespace "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 47:
                   salida +="Eval "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 61:
                   salida +="Isset "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 77:
                   salida +="Require "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 30:
                   salida +="Catch "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 45:
                   salida +="End Switch "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 82:
                   salida +="Throw "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 78:
                   salida +="Require Once "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 4:
                   salida +="Cierre Interrogacion "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 35:
                   salida +="Declare "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 12:
                   salida +="Operador Relacional "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 59:
                   salida +="Instead Of "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 90:
                   salida +="Yield "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 75:
                   salida +="Protected "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 21:
                   salida +="Corchete Cierre "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 63:
                   salida +="Match "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 40:
                   salida +="Else If "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 25:
                   salida +="Array "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 20:
                   salida +="Corchete abre "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 87:
                   salida +="Var "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 50:
                   salida +="Final "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 54:
                   salida +="Goto "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 2:
                   salida +="Halt Compiler "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 19:
                   salida +="Llave Cierre "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 46:
                   salida +="End While "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 18:
                   salida +="Llave Abre "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 39:
                   salida +="Empty "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 31:
                   salida +="Class "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 56:
                   salida +="Include "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 23:
                   salida +="Abstract "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 42:
                   salida +="End For "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 92:
                   salida +="Php Inicio "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 86:
                   salida +="Use "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 49:
                   salida +="Extends "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 71:
                   salida +="Each "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 60:
                   salida +="Interface "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 81:
                   salida +="Switch "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 15:
                   salida +="Operador Booleano "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 88:
                   salida +="Variable "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 68:
                   salida +="Do "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 70:
                   salida +="For "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 79:
                   salida +="Return "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 76:
                   salida +="Public "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 84:
                   salida +="Try "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 67:
                   salida +="Else "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 27:
                   salida +="Break "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 14:
                   salida +="Operador Incremento o Decremento "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 38:
                   salida +="Echo "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 17:
                   salida +="Parentesis Cierre "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 16:
                   salida +="Parentesis Abre "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 37:
                   salida +="Die "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 36:
                   salida +="Default "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 43:
                   salida +="End For Each "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 8:
                   salida +="Suma "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 73:
                   salida +="Print "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 52:
                   salida +="Function "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 44:
                   salida +="End if "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 11:
                   salida +="Operador Logico "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 72:
                   salida +="Or "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 1:
                   salida +="Error "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 48:
                   salida +="Exit "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 9:
                   salida +="Resta "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 85:
                   salida +="Unset "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 51:
                   salida +="Finally "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 34:
                   salida +="Continue "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 62:
                   salida +="List "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 66:
                   salida +="If "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 58:
                   salida +="Instance of "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 13:
                   salida +="Operador Atribucion "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 7:
                   salida +="Operador Logico "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 32:
                   salida +="Clone "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 53:
                   salida +="Global "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 29:
                   salida +="Case "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 10:
                   salida +="Multiplica "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 65:
                   salida +="New "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 24:
                   salida +="And "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 74:
                   salida +="Private "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 80:
                   salida +="Static "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 5:
                   salida +="Punto y coma "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 89:
                   salida +="Xor "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 83:
                   salida +="Trait "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 94:
                   salida +="Coma "+ token + "    " + token.value + "\n";
                   break;
                   
                   case 95:
                   salida +="Apostrofe "+ token + "    " + token.value + "\n";
                   break;
           }
           
           
           
       }    
       
    
    }
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
       
    }
}

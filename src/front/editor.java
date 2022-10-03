/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package front;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lexico.AnalisisLexico;

/**
 *
 * @author rodriguez
 */
public class editor extends javax.swing.JPanel {
 
public File archivo;
public String patronDebug;
    /**
     * Creates new form editor
     * @param archivo
     */
    public editor(File archivo) {
        this.archivo=archivo;
        if(!archivo.exists()){
            try {
                if (!archivo.createNewFile()){
                    JOptionPane.showMessageDialog(this, "No fue posible crear el archivo");
                    
                }else{
                initComponents();
                }
            } catch (IOException ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            };
        };
    }
    
    public void crear(String ruta) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
        bw.write("");
        initComponents();
    }
    
    public void crearDebug() throws IOException{
        AnalisisLexico an = new AnalisisLexico();
        initComponents();
        this.patronDebug = archivo.getAbsolutePath();
        an.analizararchivo(patronDebug);
        txaContenido.setText("");
        txaContenido.setText(an.salida);
        an.salida = " ";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaContenido = new javax.swing.JTextArea();

        setLayout(new java.awt.BorderLayout());

        txaContenido.setColumns(20);
        txaContenido.setRows(5);
        jScrollPane1.setViewportView(txaContenido);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
public void guardar(String patron) throws IOException {
    
    BufferedWriter bw = new BufferedWriter(new FileWriter(patron));
    bw.write(txaContenido.getText());
    bw.close();
   
}

public void guardarComo(String fichero, String conte) throws IOException {
    
    FileWriter fw=new FileWriter(fichero, true);
    fw.write(txaContenido.getText());
    fw.close();
   
}

public void abrir(String texto) {
    initComponents();
    txaContenido.setText(texto);

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea txaContenido;
    // End of variables declaration//GEN-END:variables

}
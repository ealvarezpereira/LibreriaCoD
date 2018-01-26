/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dialogos.quique;

import javax.swing.JOptionPane;



/**
 *
 * @author quique
 */
public class Dialogos {

    /**
     * 
     * 
     * @param recibirMensaje es un metodo para recibir un mensaje por teclado
     */
    
    /**
     *  @param dialogButton es una variable para el cuadro de dialogo de SI/NO
     */
    private static int dialogButton;
    
     public static void recibirMensaje(String recibirMensaje) {
        JOptionPane.showMessageDialog(null, recibirMensaje);
    }
     /**
      * 
      * @param pregunta es la pregunta que aparece en el cuadro de texto
      * @param cabecera El texto que le pones a la cabecera del cuadro de texto
      * @return retorna un true o un false segun la condicion del if
      */
    public static boolean sioNO(String pregunta, String cabecera) {
         dialogButton = JOptionPane.showConfirmDialog(null, pregunta, cabecera, JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * 
     * @param label es una variable para definir el texto que quieres que te convierta
     * @return retorna null
     */
   
        public static Object meterDato(String label) {

        Object converted = null;
        Object obj = JOptionPane.showInputDialog(label);

        if (obj == null ) {         
            converted = (int) obj;
        } else if (obj == obj.toString()) {
            converted = String.valueOf(obj);
        } else if (obj == double.class){
            converted = (double) obj;
        }

        return converted;
    }
}

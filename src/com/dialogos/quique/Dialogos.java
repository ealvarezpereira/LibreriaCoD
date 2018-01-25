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

     public static void recibirMensaje(String recibirMensaje) {
        JOptionPane.showMessageDialog(null, recibirMensaje);
    }

    public static boolean sioNO(String pregunta, String cabecera) {
        int dialogButton = JOptionPane.showConfirmDialog(null, pregunta, cabecera, JOptionPane.YES_NO_OPTION);
        if (dialogButton == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }
   
}

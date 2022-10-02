/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gatos_app;

import java.io.IOException;
import javax.swing.JOptionPane;


/**
 *
 * @author Luis Rayo
 */
public class Inicio {

    public static void main(String[] args) throws IOException {
        
        int opcion_Menu = -1;
        String[] botones = {
            "1. Ver gatos",
            "2. ver favoritos",
            "3. Salir"
        };
        
        do {
            //menu Principal
            String opcion = (String)JOptionPane.showInputDialog(null, "Gatitos Java", 
                    "Menu Principla", JOptionPane.INFORMATION_MESSAGE, null, botones, botones[0]);
            
            
            //validando que opcion selecciona el usuario
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcion_Menu = i;
                } 
            }
            
           switch(opcion_Menu){
                case 0:
                    GatosService.verGatos();
                    break;
                case 1:
                    Gatos gato = new Gatos();
                    GatosService.verFavorito(gato.getApiKey());
                default:
                    break;
                }
            
            
        } while (opcion_Menu != 1);
        
    }
}

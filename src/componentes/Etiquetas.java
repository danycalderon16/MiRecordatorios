/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Calderon
 */
public class Etiquetas extends JLabel{

    public Etiquetas() {
        setFont(new Font("Monospaced", Font.PLAIN , 20));
        
    }
    
    public void escribir(String text){
        this.setText(text);
    }
    
    public void fontSize(int s){
        setFont(new Font("Monospaced", Font.PLAIN , s));
        
    }
}

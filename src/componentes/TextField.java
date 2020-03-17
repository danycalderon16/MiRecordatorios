/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author Calderon
 */
public class TextField extends JTextField {

    public TextField() {
        setFont(new Font("Monospaced", Font.PLAIN , 30));            
    }
    
    public void setTexto(String texto){
        this.setText(texto);
    }
    
    
}

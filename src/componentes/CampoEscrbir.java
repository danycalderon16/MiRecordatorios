/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static proyecto.Utils.blanco;

/**
 *
 * @author Calderon
 */
public class CampoEscrbir extends JTextArea {
    
    private JTextArea jta;

    public CampoEscrbir() {        
        setBackground(blanco);
        setOpaque(false);
        setSize(350,100);        
    }
    
    
    
}

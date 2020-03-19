/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import java.awt.Color;
import javax.swing.JPanel;
import static util.Utils.*;

/**
 *
 * @author Calderon
 */
public class PanelRecordatorio extends JPanel{

    public PanelRecordatorio() {        
        setBackground(blanco);
        setSize(400, 80);
        
    }
    
    public void setColor(Color newColor){
        this.setBackground(newColor);
    }
    
    public void enviarTamanio(int w, int h){
        this.setSize(w, h);
    }
    
    
}

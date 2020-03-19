/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static util.Utils.blanco;

/**
 *
 * @author EG
 */
public class BotonCambiar extends JPanel{
    public BotonCambiar() {
    super();
        setBackground(blanco);
        setOpaque(false); 
        JLabel next = new JLabel();
        next.setSize(70, 70);
        next.setIcon(new ImageIcon(this.getClass().getResource("/img/change.png")));
        add(next);
    }
}

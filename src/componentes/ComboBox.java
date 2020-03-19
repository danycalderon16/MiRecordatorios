/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import static util.Utils.blanco;

/**
 *
 * @author EG
 */
public class ComboBox extends JPanel{

    public ComboBox() {
        super();
        setBackground(blanco);
        setOpaque(false); 
        JComboBox next = new JComboBox();
        next.addItem("Fecha");
        next.addItem("Prioridad");
        next.addItem("Agregue Otra Opción");
        add(next);
    }
    
}

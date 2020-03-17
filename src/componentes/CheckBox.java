/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author EG
 */
public class CheckBox extends JPanel{

    public CheckBox() {
        JCheckBox check = new JCheckBox("Tareas Cumplidas");
        add(check);
    }
    
}

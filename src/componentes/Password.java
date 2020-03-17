/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import static proyecto.Utils.blanco;

/**
 *
 * @author EG
 */
public class Password extends JPanel{

    public Password() {
        super();
        setBackground(blanco);
        setOpaque(false); 
        JPasswordField next = new JPasswordField();
        next.setText("                        ");
        add(next);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import static proyecto.Utils.blanco;

/**
 *
 * @author EG
 */
public class Calendario extends JPanel{

    public Calendario() {
        super();
        setBackground(blanco);
        setOpaque(false); 
        JCalendar next = new JCalendar();
        add(next);
    }
    
}

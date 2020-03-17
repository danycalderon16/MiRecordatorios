
package componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static proyecto.Utils.blanco;
import static proyecto.Utils.teal;


public class Toolbar extends JPanel {

    public Toolbar() {
        //setLayout(new GridBagLayout());
        setSize(1300,80);
        setBackground(teal);
    }
    
    public void setTitle(String title){
        JLabel t = new JLabel(title);
        //t.setHorizontalAlignment(SwingConstants.CENTER);
        //t.setVerticalAlignment(JLabel.CENTER);
        t.setFont(new Font("Monospaced", Font.BOLD , 30));
        t.setForeground(blanco);
        this.add(t);
        
    }
    
    public void setColor(Color newColor){
        this.setBackground(newColor);
    }
    
    public static void main(String[] args) {
        new Toolbar().setVisible(true);
    }
    
}

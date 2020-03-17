
package componentes;

import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import static proyecto.Utils.blanco;

public class SeleccionarHora extends JPanel{
    
    private JComboBox hora;
    private JComboBox min;
    private JComboBox seg;
    
    private JLabel h;
    private JLabel m;
    private JLabel s;

    public SeleccionarHora() {
        super();
        setLayout(new GridBagLayout());
        setSize(500,50);
        setBackground(blanco);
        setOpaque(false); 
        
        hora = new JComboBox();  
        hora.setBorder(new EmptyBorder(0, 10, 0, 10));
        min = new JComboBox();
        min.setBorder(new EmptyBorder(0, 10, 0, 10));
        seg = new JComboBox();
        seg.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        h = new JLabel("Hora");
        h.setBorder(new EmptyBorder(0, 10, 0, 10));
        m = new JLabel("min");
        m.setBorder(new EmptyBorder(0, 10, 0, 10));
        s = new JLabel("Seg");
        s.setBorder(new EmptyBorder(0, 10, 0, 10));
        
        for (int i = 0; i < 24; i++) {
            hora.addItem(i);
        }
        for (int i = 0; i < 60; i++) {
            min.addItem(i);
        }
        for (int i = 0; i < 60; i++) {            
            seg.addItem(i);
        }
        add(hora);
        add(h);
        add(min);
        add(m);
        add(seg);
        add(s);
    }
    
    public String obtenerHora(){
        return hora.getSelectedIndex()+":"+min.getSelectedIndex()+":"+seg.getSelectedIndex();
    }
    
    
}

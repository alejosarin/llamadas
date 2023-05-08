package vista;
import java.awt.Font;
import java.awt.Color;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
public class PanelOperaciones extends JPanel
{
    //Atributos
    public JButton bCalcularCosto;
    
    
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.white);
         //Borde y titulo del panel
         TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
         borde.setTitleColor(Color.black);
         this.setBorder(borde);
         
        //Creación y adicion de los botones
        bCalcularCosto = new JButton("Calcular costo del plan ");
        bCalcularCosto.setFont(new Font("Arial", BOLD, 13));
        bCalcularCosto.setBounds(10,20,200,50);
        add(bCalcularCosto);
        bCalcularCosto.setActionCommand("calcular");

    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
        bCalcularCosto.addActionListener(pAL);
        
        
    }
    
}
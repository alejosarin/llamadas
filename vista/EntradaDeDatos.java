package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class EntradaDeDatos extends JPanel
// Atributos

{
    private  JLabel lbOperadores;
    private JComboBox cbOperadores;
    private JTextField tfnumeroCelular;
    private JTextField tfcantidadMinutos;
    private JTextField tfvalorMinutos;
    private JLabel lbnumeroCelular;
    private JLabel lbcantidadMinutos;
    private JLabel lbvalorMinutos;
    public EntradaDeDatos()
    {

    
    //Definición del contenedor del panel
    this.setLayout(null);
    this.setBackground(Color.WHITE);

    //Borde y titulo del panel
    TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
    borde.setTitleColor(Color.black);
    this.setBorder(borde);

    //labels-------
    lbnumeroCelular = new JLabel("Numero celular  = ");
    lbnumeroCelular.setBounds(25,30,120,20);
    add(lbnumeroCelular);

    //labels-------
    lbcantidadMinutos = new JLabel("Cantidad Minutos  = ");
    lbcantidadMinutos.setBounds(25,110,120,20);
    add(lbcantidadMinutos);
    
     //labels-------
    lbvalorMinutos = new JLabel("Valor del minuto   = ");
    lbvalorMinutos.setBounds(25,150,120,20);
    add(lbvalorMinutos);

    //Crear y agregar etiqueta operadores
    lbOperadores = new JLabel("Operadores : ", JLabel.RIGHT);
    lbOperadores.setBounds(0,70,100,20);
    this.add(lbOperadores);

    //Cajas de texto 
    tfnumeroCelular = new JTextField();
    tfnumeroCelular.setBounds(130,30,120,20);
    add(tfnumeroCelular);
    
    //Cajas de texto 
    tfcantidadMinutos = new JTextField();
    tfcantidadMinutos.setBounds(150,110,120,20);
    add(tfcantidadMinutos);

    //Cajas de texto 
    tfvalorMinutos = new JTextField();
    tfvalorMinutos.setBounds(150,150,120,20);
    add(tfvalorMinutos);


    //Crear y agregar combo lista Empleados
    cbOperadores = new JComboBox();
    cbOperadores.setBounds(100,70,260,20);
    this.add(cbOperadores);

    cbOperadores.addItem("Claro");
    cbOperadores.addItem("Movistar");
    cbOperadores.addItem("WOW");
    cbOperadores.addItem("Virgin");
    }
    //Metodos de acceso a la informacion 
    public String getNumeroCelular()
    {
        return tfnumeroCelular.getText();
    }
    public String getCantidadMinutos()
    {
        return tfcantidadMinutos.getText();
    }
    public String getValorMinuto()
    {
        return tfvalorMinutos.getText();
    }
    public String getOperador()
    {
        return (String) cbOperadores.getSelectedItem();
    }
    
}



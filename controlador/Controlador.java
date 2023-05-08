package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.PlanTelefonia;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private PlanTelefonia model;
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, PlanTelefonia pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("calcular"))
        {
            //String Operador=venPrin.miPanelEntradaDatos.getOperador();
            double precioPlan;
            precioPlan=0;
            int numeroCel = Integer.parseInt(venPrin.miPanelEntradaDatos.getNumeroCelular());
            String Operador = venPrin.miPanelEntradaDatos.getOperador();
            int cantidadMinutos = Integer.parseInt(venPrin.miPanelEntradaDatos.getCantidadMinutos());
            Double valorMinuto = Double.parseDouble(venPrin.miPanelEntradaDatos.getValorMinuto());

            PlanTelefonia tele = new PlanTelefonia(numeroCel, cantidadMinutos, valorMinuto,Operador);
            
            
           tele.calcularPlan();
           venPrin.miPanelResultados.mostrarResultado( "Numero: " + tele.getNumeroCelular() + "\nOperador: "+tele.getOperador() + "\nConsumo de minutos: "+tele.getCantidadMinutos() + "\nPrecio por minutos: " + tele.getValorMinuto()+"\nEl precio de el plan telefonico es "+tele.getCostoPlan());
        }
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        
        
        
    }    
}


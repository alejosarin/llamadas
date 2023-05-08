package ejecutable;
import controlador.Controlador;
import vista.VentanaPrincipal;
import modelo.PlanTelefonia;
public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        PlanTelefonia miModelo =null;
        Controlador miControlador = new Controlador(miVentana,miModelo);
    }    
}

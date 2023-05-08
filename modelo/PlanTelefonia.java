package modelo;
import vista.EntradaDeDatos;
import vista.VentanaPrincipal;

public class PlanTelefonia {
    private int numeroCelular;
    private int cantidadMinutos;
    private double valorMinuto;
    private double costoPlan;
    private VentanaPrincipal venPrin;

    public PlanTelefonia(int pNumeroCelular , int pCantidadMinutos, double pValorMinuto)
    {
        this.numeroCelular=pNumeroCelular;
        this.cantidadMinutos=pCantidadMinutos;
        this.valorMinuto=pValorMinuto;
        this.costoPlan = 0;
    }
    
    
    public void setNumeroCelular(int pNumeroCelular)
    {
        this.numeroCelular=pNumeroCelular;
    }

    public int getNumeroCelular()
    {
        return this.numeroCelular;
    }

    public void setCantidadMinutos(int pCantidadMinutos)
    {
        this.cantidadMinutos=pCantidadMinutos;
    }

    public int getCantidadMinutos()
    {
        return this.cantidadMinutos;
    }

    public void setValorMinuto(double pValorMinuto)
    {
        this.valorMinuto = pValorMinuto;
    }
    public double getValorMinuto()
    {
        return this.valorMinuto;
    }
    
    
    
    
}

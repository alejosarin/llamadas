package modelo;
import vista.EntradaDeDatos;
import vista.VentanaPrincipal;

public class PlanTelefonia {
    private int numeroCelular;
    private int cantidadMinutos;
    private double valorMinuto;
    private double costoPlan;
    private String operador;
    private VentanaPrincipal venPrin;


    public PlanTelefonia(int pNumeroCelular , int pCantidadMinutos, double pValorMinuto, String pOperador)
    {
        this.numeroCelular=pNumeroCelular;
        this.cantidadMinutos=pCantidadMinutos;
        this.valorMinuto=pValorMinuto;
        this.operador = pOperador;
        this.costoPlan = 0;
    }
    public void setOperador( String pOperador)
    {
        this.operador=pOperador;
    }
    public String getOperador()
    {
        return operador;
    }
    public void setNumeroCelular(int pNumeroCelular)
    {
        this.numeroCelular=pNumeroCelular;
    }

    public int getNumeroCelular()
    {
        return numeroCelular;
    }

    public void setCantidadMinutos(int pCantidadMinutos)
    {
        this.cantidadMinutos=pCantidadMinutos;
    }

    public int getCantidadMinutos()
    {
        return cantidadMinutos;
    }

    public void setValorMinuto(double pValorMinuto)
    {
        this.valorMinuto = pValorMinuto;
    }
    public double getValorMinuto()
    {
        return valorMinuto;
    }
    public void calcularPlan()
    {
        if(operador.equals("WOM"))
        {
            costoPlan=(valorMinuto*cantidadMinutos)/2;
        }
        else
        {
            costoPlan = valorMinuto*cantidadMinutos;
        }
    }
    public double getCostoPlan()
    {
        return costoPlan;
    }
    
    
    
}

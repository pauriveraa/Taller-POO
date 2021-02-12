package paquete;
import java.util.Scanner;

public class Electrodomestico {

    protected String Procedencia;
    protected String Consumo;

    public Electrodomestico( String procedencia, String consumo)
    {
        this.Procedencia = procedencia;
        this.Consumo = consumo;
    }

    public String GetProcedencia()
    {
        return this.Procedencia;
    }

    public void SetProcedencia(String procedencia)
    {
    this.Procedencia = procedencia;
    }

    public String GetConsumo()
    {
        return this.Consumo;
    }

    public void SetConsumo(String consumo)
    {
        this.Consumo = consumo;
    }
}





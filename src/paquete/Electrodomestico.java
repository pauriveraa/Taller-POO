package paquete;
import java.util.Scanner;

public class Electrodomestico {

    boolean Procedencia;
    char Consumo;

    public Electrodomestico(boolean procedencia, char consumo)
    {
        this.Procedencia = procedencia;
        this.Consumo = consumo;
    }

    public boolean GetProcedencia()
    {
        return this.Procedencia;
    }

    public void SetProcedencia(boolean procedencia)
    {
    this.Procedencia = procedencia;
    }

    public char GetConsumo()
    {
        return this.Consumo;
    }

    public void SetConsumo(char consumo)
    {
        this.Consumo = consumo;
    }
}


//Se crea una clase televisores con padre Electrodomesticos

class Televisores extends Electrodomestico
{
    int Pulgadas;
    boolean TDT;

    public Televisores(int pulgadas, boolean tdt)
    {
        this.Pulgadas=pulgadas;
        this.TDT=tdt;
    }

    public Televisores(int pulgadas)
    {
        this.Pulgadas=pulgadas;
    }
}


package paquete;

public class Televisores extends Electrodomestico
{
    //Se crea una clase televisores con padre Electrodomestico
    int Pulgadas;
    boolean TDT;

    public Televisores(String Procedencia, String Consumo, int pulgadas, boolean tdt)
    {
        super(Procedencia, Consumo);
        this.Pulgadas=pulgadas;
        this.TDT=tdt;
    }

    public void SetPulgadas(int pulgadas)
    {
        this.Pulgadas=pulgadas;
    }
}


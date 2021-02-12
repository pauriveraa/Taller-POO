package paquete;

public class Televisores extends Electrodomestico
{
    //Se crea una clase televisores con padre Electrodomestico
    int Pulgadas;
    int TDT;

    public Televisores(String Procedencia, char Consumo, double Precio, int Pulgadas, int TDT)
    {
        super(Procedencia, Consumo, Precio);
        this.Pulgadas = Pulgadas;
        this.TDT = TDT;
    }

    public void Factura()
    {
        super.FacturaInicial(); //Valor inicial heredado

        //Se verifica si el televisor es mayor a 40 pulgadas

        if(Pulgadas > 40)
        {
            Precio += (Precio*0.3);
        }
        else
        {
            Precio = Precio;
        }

        //Se verifica si el televisor tiene sincronizador TDT

        if (TDT == 1)
        {
            Precio += 250000;
        }
        else
        {
            Precio = Precio;
        }
    }


}


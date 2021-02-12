package paquete;

public class Neveras extends Electrodomestico
{
    //Se crea una clase Neveras con padre Electrodomestico
    double Capacidad;

    public Neveras(String Procedencia, char Consumo, double Precio, double Capacidad)
    {
        super(Procedencia, Consumo, Precio);
        this.Capacidad=Capacidad;
    }

    public void FacturaNeveras()
    {
        super.FacturaInicial(); //Valor inicial heredado

        if(Capacidad<=120)
        {
            Precio=Precio;
        }
        else if (Capacidad>120)
        {
            double temp;
            temp = (Capacidad-120)/10;
            if(temp == 0)
            {
                Precio=Precio;
            }
            else
            {
                temp = temp*(Precio*0.05);
                Precio += temp;
            }
        }
    }


}


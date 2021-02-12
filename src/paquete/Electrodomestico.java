package paquete;


public class Electrodomestico {

    protected String Procedencia;
    protected char Consumo;
    protected double Precio;

    public Electrodomestico( String procedencia, char consumo, double Precio)
    {
        this.Procedencia = procedencia;
        this.Consumo = consumo;
        this.Precio = Precio;
    }

    public void FacturaInicial()
    {
        System.out.println("FACTURA");
        if(Procedencia == "procedencia")
        {
            Precio = 250000;
            System.out.println("Electrodomestico Nacional.");
        }
        else
        {
            Precio = 350000;
            System.out.println("Electrodomestico Importado.");
        }

        if(Consumo == 'A' || Consumo =='a')
        {
            Precio = 450000 + Precio;
        }
        else if (Consumo == 'B' || Consumo =='b')
        {
            Precio = 350000 + Precio;
        }
        else if (Consumo == 'C'|| Consumo =='c')
        {
            Precio = 250000 + Precio;
        }
        else
        {
            System.out.println("No ha seleccionado un tipo de consumo correcto. \n Vuelva intentarlo.");
        }

    }
/*
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

 */
}





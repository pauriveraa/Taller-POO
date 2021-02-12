package paquete;
import paquete.Electrodomestico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("BIENVENIDO, elija entre los dos tipos de productos: \n"+"1. Nacional. \n"+"2. Importado.");
            String tipo = sc.nextLine();
            System.out.println("El tipo de electrodomestico es: " + tipo);
        }
        catch (Exception e)
        {
            System.out.println("No seleccionó un electrodomestico");
        }

    }
}

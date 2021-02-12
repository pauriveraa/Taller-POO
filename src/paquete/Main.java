package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            ListaEnlazada lista = new ListaEnlazada();

            Scanner sc = new Scanner(System.in);
            System.out.println("BIENVENIDO, elija entre los dos tipos de productos: \n"+"Televisor. \n"+"Nevera. \n"+"Otro.");
            String tipo = sc.nextLine();
            tipo = tipo.toLowerCase();
            //System.out.println("El tipo de electrodomestico es: " + tipo);
            switch (tipo)
            {
                case "televisor":
                {
                    lista.addPrimero("Televisor");

                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Escoja entre: \n" + "Nacional \n" + "Importado");
                    String PROCENDENCIA = sc1.nextLine();
                    PROCENDENCIA = PROCENDENCIA.toLowerCase();

                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Escoja entre: \n" + "A \n" + "B \n" + "C");
                    String CONSUMO = sc2.nextLine();
                    CONSUMO = CONSUMO.toLowerCase();

                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Digite el numero de pulgadas que desea para su televisor: ");
                    String PULGADAS = sc3.nextLine();
                    int PUL;
                    PUL = Integer.parseInt(PULGADAS);

                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("Digite (1) si desea que su televisor incluya TDT, en caso contrario, digite cualquier otro numero. ");
                    String TDT = sc4.nextLine();
                    int TdT;
                    TdT = Integer.parseInt(PULGADAS);

                    float PRECIO=0;

                     Televisores t;
                     t = new Televisores(PROCENDENCIA,CONSUMO,PRECIO,PUL,TdT);




                }
            }
        }
        catch (Exception e)
        {
            System.out.println("No seleccionó un electrodomestico");
        }


    }
}

package paquete;

public class ListaEnlazada
{
    Nodo cabeza;
    int Size;

    public ListaEnlazada()
    {
        cabeza = null;
        Size = 0;
    }

    public boolean estaVacio()
    {
        return (cabeza == null)?true:false;
    }

    public void addPrimero(Object obj)
    {
        if(cabeza == null)
        {
            cabeza = new Nodo(obj);
        }
        else
        {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza=nuevo;
        }
        Size++;
    }

    public int Size()
    {
        return Size;
    }

    public Object obtener(int index)
    {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador<index)
        {
            temporal = temporal.ObtenerSiguiente();
            contador++;
        }
        return temporal.ObtenerDato();
    }
}

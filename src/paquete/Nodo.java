package paquete;

public class Nodo {
    Object dato;
    Nodo siguiente;
    public Nodo (Object dato)
    {
        this.dato=dato;
        this.siguiente=null;
    }

    public void enlazarSiguiente(Nodo n)
    {
        siguiente = n;
    }

    public Nodo ObtenerSiguiente()
    {
        return siguiente;
    }

    public Object ObtenerDato()
    {
        return dato;
    }

}

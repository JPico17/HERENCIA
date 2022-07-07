package clases;
public class Multiplicacion extends Operacion
{
    public Multiplicacion(double x, double y)
    {
        super(x,y);
    }
    //Metodos 
    public void multiplicar() 
    {
        resultado = x * y;
    } 
}
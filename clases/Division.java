package clases;
public class Division extends Operacion
{
    public Division(double x, double y)
    {
        super(x,y);
    }
    //Metodos 
    public void dividir() 
    {
        resultado = x / y;
    } 
}
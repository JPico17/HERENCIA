package clases;

import javax.swing.JOptionPane;

public class TestEjecutable
{
    //Metodo ejecutable
    public static void main(String[] args) 
    {
        //Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x : "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y : "));

        //Creacion de un objeto suma
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());

        Resta miResta = new Resta(x, y);
        miResta.restar();
        JOptionPane.showMessageDialog(null, "La resta de " + x + " y " + y + " es " + miResta.mostrarResultado());

        Multiplicacion miMultiplicacion = new Multiplicacion(x, y);
        miMultiplicacion.multiplicar();
        JOptionPane.showMessageDialog(null, "La multiplicacion de " + x + " y " + y + " es " + miMultiplicacion.mostrarResultado());

        Division miDivision = new Division(x, y);
        miDivision.dividir();
        JOptionPane.showMessageDialog(null, "La division de " + x + " y " + y + " es " + miDivision.mostrarResultado());
        System.exit(0);
    }

}
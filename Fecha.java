
/**
 * Write a description of class fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int anho;

    /**
     * Constructor for objects of class fecha
     */
    public Fecha(int dias, int meses, int años)
    {
        dia = dias;
        mes = meses;
        anho = años;
        
        assert años >= 1582: "no llega";
        if (dias >= 31){
           
        }
    }

    //devuelve cantidad de diasa que tiene el mes dado en el año indi
    private int cantidadDias(int mes, int anho){
        return
    }
    
    //devuelve true si el año es bisiesto
    private boolean esBisiesto(int anho){
        
    }
    
    //verifica si la fecha es valida
    private boolean fechaValida(int dia, int mes, int anho){
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

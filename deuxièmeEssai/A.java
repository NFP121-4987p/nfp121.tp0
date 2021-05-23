
/**
* @author (Rayane)
* @version (23-05-2021)
*/

public class A
{
    private int x;
    private int y;

    /**
    * Constructeur d'objets de classe A
    */
    public A()
    {
        x = 0;
        y = 0;
    }

    /**
    * @param  z   le paramètre de la méthode
    * @return     la somme de x et de y multipliée par z
    */
    public int sampleMethod(int z)
    {        
        return (x + y) * z;
    }
}

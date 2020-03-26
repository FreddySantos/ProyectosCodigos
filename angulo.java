import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class angulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class angulo
{
    public static void main(String[]arg)
    {
        double cat1, cat2, hipo, tan, medida, angulo;
        
        System.out.print('\u000c');
        
        Scanner datos1 = new Scanner(System.in);
        Scanner datos2 = new Scanner(System.in);
        System.out.println("Ingresar el primer valor del cateto");
        cat1 = datos1.nextDouble();
        System.out.println("Ingresar el segundo valor del cateto");
        cat2 = datos2.nextDouble();
        
        hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        tan = Math.tan(cat1 / cat2);
        medida = Math.toDegrees(Math.atan(tan));
        angulo = 180 - (90 + medida);
        
        
        System.out.println("El valor de la hipotenusa es: " + hipo);
        System.out.println("El valor del primer angulo es: " + medida);
        System.out.println("El valor del segundo angulo es: " + angulo);
        
    }
    
}

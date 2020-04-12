import java.util.Scanner;
/**
 * Una empresa paga a sus empleados x cantidad de acuerdo con sus años de antiguedad 
 * Escribir un progrma que lea datos,  como emtrada, sueldo, años de antiguedad
 * a)   Si el sueldo es menor a 1000 y su antiguedad es igual o mayor a 10 años, y aumentarle un 20% a su sueldo 
 * mostrar el sueldo total  del empleado
 * b)    Si el sueldo es menos a 1000 y su antiguedad  es menos a 10 años, aumentar un salario de 5% 
 * mostrar el sueldo total  del empleado
 * c)   si el sueldo  es mayor o iguel que mil mostrar el sueldo del empleado
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sueldos
{
    public static void main(String[]arg)
    {
        int años;
        float sueldo, aumento, total;
        
        System.out.print('\u000c');  
        Scanner datos = new Scanner(System.in);
        
        System.out.println("ingresar el valor del sueldo");
        sueldo = datos.nextFloat();
        System.out.println("ingresar los años de antiguedad");
        años = datos.nextInt();
        
        if (sueldo < 1000 && años >= 10)
        {
            aumento = sueldo * 0.20f;
            total = aumento + sueldo;
            System.out.println("nuevo sueldo " + total); 
        }
        else if (sueldo < 1000 && años < 10)
        {
            aumento = años * .05f;
            total = aumento + años;
            System.out.println("nuevo sueldo" +  total);
        }
        else if (sueldo >= 1000)
        {
            System.out.println("nuevo sueldo: " + sueldo); 
        }
    }
}

import java.util.Scanner;
 
public class Romboito{
     private static Scanner x;
    public static void main(String[] args) 
    {
        x = new Scanner(System.in);
        boolean Nc = false;
        int Nf;
        
        System.out.print('\u000c');
        do {
            System.out.print("Introduce el número de filas  ");
            Nf = x.nextInt();
            if(Nf>0 && Nf%2!=0)
            {
                Nc = true;
            }
        } while (!Nc);
         
        System.out.println(" ");
        int nf = Nf/2;
        int instancea = 1;
                 
        for(int altura=nf;altura>0;altura--){
         
            for(int espacio=1;espacio<=altura;espacio++){
                System.out.print(" ");
            }
           
            for(int asteriscos=1;asteriscos<=instancea;asteriscos++){
                System.out.print("*_");
            }
            System.out.println("");  
            instancea++;
        }
         
        
         
        for(int altura=0;altura<=nf;altura++){
            
            for(int espacio=1;espacio<=altura;espacio++){
                System.out.print(" ");
            }
            
            for(int asteriscos=instancea;asteriscos>0;asteriscos--){
                System.out.print("*_");
            }
            System.out.println();
            instancea--;
        }
    }
}